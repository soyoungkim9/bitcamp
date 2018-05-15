// 파일 업로드 - 다른 클라이언트가 올린 파일을 덮어쓰지 않게 하기
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

@WebServlet("/step05/exam04")
public class Exam04 extends HttpServlet {
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
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        try {
            Map<String,List<FileItem>> paramMap = upload.parseParameterMap(request);
                    out.printf("name=%s\n", paramMap.get("name").get(0).getString("UTF-8"));
                    out.printf("age=%s\n", paramMap.get("age").get(0).getString());
                    FileItem photo = paramMap.get("photo").get(0);
                    String filename =  newFilename(photo.getName());
                    out.printf("photo=%s\n", filename);
                    
                    // 업로드할 파일을 저장한다.
                    ServletContext appEnvInfo = request.getServletContext();
                    String savedPath = request.getRealPath("/");
                    out.println(savedPath);
                    photo.write(new File(savedPath + "/" + filename));
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석 중 오류 발생!");
        }
    }
    
    int count = 0;
    private String newFilename(String originFilename) {
        int lastIndex = originFilename.lastIndexOf(".");
        String extName="";
        if (lastIndex >= 0) {
            extName = originFilename.substring(lastIndex);
        }
        // 파일명: [현재업로드한시각의 밀리초]-[카운트].[확장자]
        return String.format("%s-%d%s",
                System.currentTimeMillis(),
                ++count,
                extName);
    }
}

// multipart/form-data 형식으로 데이터를 보낸  POST 요청
// - 보내는 데이터 파트 별로 분리하여 보낸다.
// - 파트와 파트의 구분자는 Content-Type 헤더에 정의되어 있다.
// - 