package bitcamp.java106.pms.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.server.ServerResponse;

// 새규칙에 따라 기존에 만든 클래스를 사용할 수 있도록
// 중간에서 중계해주는 역할 - Adapter
// => 즉 기존에 만든 클래스를 새 기술이나 구조에서 재사용할 수 있도록 해주는 설계 기법이다.

public class ServerResponseAdapter extends ServerResponse {
    HttpServletResponse response;
    public ServerResponseAdapter (HttpServletResponse response) {
        super(null);
        this.response = response;
    }
    
    // 상속받은 메서드를 현재 클래스의 역할에 맞춰서 재정의 하는 것 - 오버라이딩
    @Override
    public PrintWriter getWriter() {
        try {
            return response.getWriter();
        } catch (Exception e) {
            return null;
        }
    }
}
