// ServletRequestListener: 요청이 ㄷ르어오고 완료되는 이벤트
package step09.ex2;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class Listener2 implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
        System.out.println("Listener2.requestInitialized()");
        System.out.printf("[%s] %s\n",
                request.getRemoteAddr(),
                request.getPathInfo());
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listener2.requestInitialized()");
    }
    
}






