// 실행 위임 하는 방법 - forward
package step09.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
// @WebServlet("/step09/ex1/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <meta charset='UTF-8'>");
        out.println("  <title>exam03</title>");
        
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>exam03 실행!</h1>\n");
        
        // init()의 파라미터로 받은 ServletConfig 객체를 이용하여
        // web.xml 파일에 설정된 init-param 태그의 값을 가져올 수 있다.
        ServletConfig config = this.getServletConfig();
        String name =  config.getInitParameter("name");
        String age =  config.getInitParameter("age");
        out.printf("<p>name=%s, age=%s</p>\n", name, age);
        out.println("</body>");
        out.println("</html>");
        
        // 콘솔 창에 서블릿이 실행되었음을 표시하기 위해
        // => 필터의 실행과 서블릿의 실행 순서를 확인하기 위함이다.
        System.out.println("/step09/ex1/exam03 실행!");
    }
}







