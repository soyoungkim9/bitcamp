// GET요청 파라미터의 값이 한글일 경우 깨지는 현상 해결
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam04")
public class Exam04 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request,
            ServletResponse response) throws ServletException, IOException {
        
        
        // tomcat7 이하 버전:
        // => GET 요청으로 한글 문자열을 파라미터로 보낼 때
        //    서버에서 꺼내면 한글이 깨진다.
        //    예) http://localhost:8888/test01/step03/exam04?name=홍길동&age=20
        // => 이유?
        //    웹브라우저: URL에 입력한 값(UTF-8) ==> URL 인코딩 
        //      1) URL에 입력한 값(UTF-8): "AB가각" (4142eab080eab081)
        //      2) URL 인코딩: ==> "AB%EA%B0%80%EA%B0%81"
        //    톰캣서버:
        //      3) URL 디코딩 : "AB가각" (41 42 ea b0 80 ea b0 81)
        //      4) String 객체(UTF-16): (0041 0042 00ea 00b0 0080 00ea 00b0 0081)
        //          - 각 바이트를 UTF-16으로 변환한다.
        //          - 클라이언트가 보낸 데이터가 어떤 문자표에 따라 만든 데이터인지 알려주지 않으면,
        //            무조건 ISO-8859-1(ISO-latin-1)이라고 가정하고 무조건 00 1바이트를 붙인다.
        // 해결책?
        // => 최초로 값을 꺼내기 전에(getParameter()를 최초로 호출하기 전)
        //    클라이언트가 보낸 문자가 어떤 문자코드로 되어 있는지 알려줘야 한다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        
        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%d\n", age);
    }
}
