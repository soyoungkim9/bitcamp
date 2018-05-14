// 파일 업로드 - 멀티파트 파라미터 값 추출하기
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step05/exam02")
public class Exam02 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // 출력할 때 UTF-16 ===> UTF-8로 제대로 바꾸기 위해
        // 출력스트림을 얻기 전에 알려줘야 한다.
        // 1) 의존 라이브러리 정보 알아내기
        //    mvnrepository.com 에서 "apache fileupload" 검색
        // 2) build.gradle에 의존 라이브러리 정보 추가
        // 3) "gradle eclipse"
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 멀티 파트로 전송된 POST 요청 데이터를 추출하려면 일반적인 방법으로는 안된다.
        // apache.org 사이트의 라이브러리를 사용하여 처리해 보자!
        
        // apache-fileupload 라이브러리를 사용하여 클라이언트가 보낸 멀티파트 데이터를 추출해보자!
        // 1) 클라이언트가 보낸 데이터가 멀티파트 형식인지 검사한다.
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if(!isMultipart) {
            out.println("멀티파트 형식이 아닙니다!");
            return;
        }
        
        // 2) 멀티파트 데이터를 추출하여 HDD에 저장할 공장 준비
        DiskFileItemFactory factory = new DiskFileItemFactory();
        
        // 3) 멀티파트 데이터 분석기에 공장 객체를 장착한다.
        // => 멀티파트 데이터 분석기가 멀티파트 데이터를 추출하면
        //    공장객체가 파일로 만들어 HDD에 저장한다.
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        // 4) 멀티파트로 전송된 요청 데이터 분석하기
        Map<String,String> paramMap = new HashMap<>();
        try {
            List<FileItem> items = upload.parseRequest(request);
            
            for (FileItem item : items) {
                if (item.isFormField()) { // 일반적인 텍스트 항목
                    out.printf("%s=%s\n", 
                            item.getFieldName(), 
                            item.getString("UTF-8"));
                } else {
                    out.printf("%s=%s\n", 
                            item.getFieldName(), 
                            item.getName());
                    ServletContext appEnvInfo = request.getServletContext();
                    String savedPath = request.getRealPath("/");
                    out.println(savedPath);
                    
                    // => FileItem.write(저장할 경로) 호출하여 클라이언트가 보낸 파일을 저장한다.
                    item.write(new File(savedPath + "/" + item.getName()));
                }
            }
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석 중 오류 발생!");
        }
    }
}

// multipart/form-data 형식으로 데이터를 보낸  POST 요청
// - 보내는 데이터 파트 별로 분리하여 보낸다.
// - 파트와 파트의 구분자는 Content-Type 헤더에 정의되어 있다.
// - 