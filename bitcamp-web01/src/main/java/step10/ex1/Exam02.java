// 쿠키 : 클라이언트 쪽에 보관된 쿠키 데이터를 꺼내는 방법
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam02")
public class Exam02 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        // 쿠키(cookie) 받기
        // => 쿠키는 서버가 요청하지 않아도 웹브라우저에서 무조건 보낸다.
        //    물론 웹서버가 웹브라우저에 쿠키를 보낼 때 조건에 따라 웹서버에 보낸다.
        Cookie cookie1 = new Cookie("c1", "aaa");
        Cookie cookie2 = new Cookie("c2", "123");
        
        // 1) 쿠키 가져오기
        // => 안타깝게도 특정 일므을 가진 쿠키 값만 꺼내는 메서드가 없다.
        Cookie[] cookies = request.getCookies();
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("클라이언트가 보낸 쿠키들:");
        
        for (Cookie cookie : cookies) {
            out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
        }
        
        // 웹 브라우저가 웹서버로 쿠키를 보내는 HTTP 프로토콜?
        
    }
}
