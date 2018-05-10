// GenericServlet + HTTP 프로토콜 기능 = HttpServlet 클래스
package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 파라미터로 넘어오는 것은 실제로 HTTP 프로토콜을 다룰 수 있는 객체가 넘어온다.
        // 즉 ServletRequest 대신에 그 자식 객체인 HttpServletRequest가 넘어온다.
        
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;
    
    }
    
    // 개발 편의를 위해 service 메서드를 추가한다. (오버로딩)
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        // 이 메서드는 클라이언트가 요청한 명령에 따라
        // 또 다른 메서드를 호출한다.
        String command = request.getMethod();
        
        switch (command) {
        case "GET": doGet(request, response); break;
        case "POST": doPost(request, response); break;
        case "HEAD": doHead(request, response); break;
        default:
            throw new ServletException("해당 명령을 처리할 수 없습니다!");
        }
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
        throw new ServletException("해당 명령을 처리할 수 없습니다!");

    }
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
        throw new ServletException("해당 명령을 처리할 수 없습니다!");

    }
    
    protected void doHead(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException{
        throw new ServletException("해당 명령을 처리할 수 없습니다!");

    }
}
