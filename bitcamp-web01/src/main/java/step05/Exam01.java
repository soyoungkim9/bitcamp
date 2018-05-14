// 파일 업로드
package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 웹브라우저에서 파일을 보낼 때 POST 방식으로 보내기 때문에
// 서블릿에서는 POST 요청을 처리해야 한다.
// 그래서 HttpServlet을 상속 받아 만들고,
// doPost()를 재정의 한다.
//
@WebServlet("/step05/exam01")
public class Exam01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        // POST 요청으로 전송되는 데이터의 문자표를 서블릿 컨테이너에 알려준다.
        // 이렇게 알려줘야지만 getParameter()을 호출할 때 ,
        // UTF8 ==> UTF-16 제대로 바꿀 것이다.
        request.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String photo = request.getParameter("photo");
        
        // 출력할 때 UTF-16 ===> UTF-8로 제대로 바꾸기 위해
        // 출력스트림을 얻기 전에 알려줘야 한다.
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%s\n", age);
        out.printf("사진=%s\n", photo);
        
        // 출력 결과를 보면 name, age, photo의 값이 null이다.
        // 이유?
        //  - multipart/form-data 형식으로 전송된 데이터는
        //    일반적인 방식으로 값을 꺼낼 수 없다.
        //  - 즉 request.getParameter()를 사용하여 값을 꺼낼 수 없다.
        // 해결책?
        //  - multipart 형식을 분석하여 값을 추출해야 한다.
        //     개발자가 직접 추출하는 코드를 작성하는가?
        //  - 아니다! 이미 이런 작업을 수행하는 오픈 소스 라이브러리가 있다.
        //  - 그 라이브러리를 사용하라!
        // 어떤 라이브러리?
        //  - 
    }
}

// multipart/form-data 형식으로 데이터를 보낸  POST 요청
// - 보내는 데이터 파트 별로 분리하여 보낸다.
// - 파트와 파트의 구분자는 Content-Type 헤더에 정의되어 있다.
// - 