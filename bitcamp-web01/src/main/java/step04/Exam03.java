// GET 요청과 POST 요청을 구분하기 - HttpServlet 클래스
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HTTP 요청을 다루기 위해 매번 ServletRequest와 ServletResponse를
// 형변환해야 한다면 프로그래밍 하기가 매우 번거롭다.
// 미리 형변환 처리를 한 클래스가 있으니 그 클래스를 사용하자.

@WebServlet("/step04/exam03")
public class Exam03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // 테스트 방법:
    // http://localhost:8888/java106-web01/step04/exam03_test.html
    
    // => service() 메서드를 오버라이딩 할 때도 Servlet 인터페이스에 선언된
    //    원래의 service(ServleRequest, ServletResponse)를 오버라이딩 하지 말고,
    //    HttpServlet 클래스에서 추가(오버로딩)한 service()메서드를 오버라이딩 하라!
    // => 이 메서드는 파라미터 값으로 HttpServletRequest와 HttpSErvlerResponse를 받는다.
    //    물론 서블릿 컨테이너가 이 메서드를 직접 호출하는 것이 아니라
    //    service(ServletRequest, ServletResponse)가 내부적으로 호출하는 것이다.
    
    @Override
    public void service(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        // 클라이언트가 보낸 값ㅇ르 꺼낼 때는 GET, POST 구분없이 동일한 방법으로 값을 꺼낸다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        // 클라이언트가 요청한 방식을 알아내기
        // => 요청 방식은 HTTP 프로토콜에 대한 내용이다.
        // => ServletRequest에는 HTTP 프로토콜에 대한 내용을 다룰 수 있는 기능이 없다.
        // => 해결책? 
        //    서블릿 컨테이너가 service()를 호출할 때 넘겨준 파라미터의
        //    원래의 타입으로 변환하라!
        // => 서블릿 컨테이너는 service()를 호출할 때 HTTP 정보를 다룰 수 있는
        //    HttpServletRequest와 HttpServletResponse를 넘겼다.
        // => 따라서 이 타입으로 형변환하면 된다.
        //HttpServletRequest httpRequest = (HttpServletRequest) request;
        
        String method = request.getMethod();
        
        response.setContentType("text/plan;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("요청 방식=%s\n", method);
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    
    }
}

// GET vs. POST
// [GET]
//  - URL에 데이터가 포함되기 때문에 바이너리 데이터를 보낼 수 없다.
//    바이너리 데이터를 BASE64 형식(텍스트형식)으로 변환하여 보낼 수는 있다.
//  - 대용량의 데이터를 보낼 수 없다.
//    대부분의 웹서버는 request-line 및 header의 최대 크기를 8182(8KB)로 제한하고 있다.
//    => 그래서 파일 업로드나 게시글 등록, 변경에서는 GET 요청을 하지 않는다.
//  - URL에 데이터가 포함되기 때문에 보내는 데이터가 타인에게 노출된다. 보안에 취약
//    => 그래서 로그인 값을 GET 요청으로 보내지 않는다.
//  - URL에 값을 동시에 보낼 때 유용하다.
//    왜? URL에 값이 포함되기 때문이다.
//    => 예) 검색을 요청하는 URL
//  - 즐겨찾기와 방문내역에 저장할 수 있다.
//    => 그래서 더더욱 로그인에는 GET을 사용하면 안된다.

// [POST]
//  - 멀티파트 형식으로 바이너리 데이터를 보낼 수 있다.
//  - 대용량의 데이터를 보낼 수 있다.
//    빈 줄 다음에 데이터를 보내기 때문에 데이터의 크기에 제한이 없다.
//    서버 쪽에서 허용하는 만큼 보낼 수 있다.
//    => 파일업로드나 게시글 등록, 변경에 주로 사용한다.
//  - 보내는 데이터가 웹브라우저의 URL 주소창에 노출되지 않는다.
//    => 그래서 로그인 값을 보낼 떄 이 방식을 사용한다.
//  - 즐겨찾기에 저장해봐야 소용없다. 방문기록에 저장된 것은 무용하다.
//    => 왜? URL만 저장되기 때문이다. 즉 데이터가 포함되어 있지 않기 때문이다.
//    => 게시물 조회, 검색 결과 조회와 같은 데이터 조회 결과를 출력하는 URL을 저장할 때는
//       POST방식이 아닌 GET 방식을 사용해야 한다.
//
// BSSE64
// - 바이너리 데이터를 텍스트로 변환하여 전송할 때 사용한다.
// - 바이너리 데이터를 ASCII 코드의 문자로 변환하는 방식이다.
// - 이렇게 텍스트로 만든 데이터를 OS에 상관없이, 프로그래밍 언어에 상관없이,
//   네트워크 프로토콜에 상관없이 언제든 주고 받을 수 있다는 장점이 있다.
//






