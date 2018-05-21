// 실행 위임 하는 방법 - forward
package step08.ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step08/ex3/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <meta charset='UTF-8'>");
        out.println("  <title>계산결과</title>");
        out.println("</head>");
        out.println("<body>");
        
        RequestDispatcher 요청배달자 = request.getRequestDispatcher("/step08/ex3/common");
        요청배달자.include(request, response);
        out.printf("<h1>%s님 반갑습니다.</h1>", name);
        
                
        out.println("</body>");
        out.println("</html>");

        요청배달자 = request.getRequestDispatcher("/step08/ex3/header");
        요청배달자.include(request, response);
        
        요청배달자.include(request, response);
        out.printf("<h1>%s님 반갑습니다.</h1>", name);
        
        요청배달자 = request.getRequestDispatcher("/step08/ex3/footer");
        요청배달자.include(request, response);
    }
}







