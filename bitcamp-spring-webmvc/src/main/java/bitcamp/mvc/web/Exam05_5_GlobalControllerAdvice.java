// 요청 핸들러의 파라미터 - custom property editor 등록하기 II
package bitcamp.mvc.web;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

// 모든 페이지 컨트롤러에 대해 조언을 수행하는 클래스 정의
// => 다음 애노테이션을 붙이면 페이지 컨트롤러를 실행할 때 마다 호출할 것이다.
@ControllerAdvice
public class Exam05_5_GlobalControllerAdvice {
    @InitBinder 
    public void initBinder(WebDataBinder binder) {
        System.out.println("Exam05_5_GlobalControllerAdvice.initBinder()");
        
        binder.registerCustomEditor(
                java.sql.Date.class,  
                new PropertyEditorSupport() {
                    @Override
                    public void setAsText(String text) throws IllegalArgumentException {
                        // "text" 파라미터에는 클라이언트가 보낸 데이터이다.
                        // 이렇게 문자열로 보낸 데이터는 java.sql.Date 객체로 바꿔야 한다.
                        this.setValue(Date.valueOf(text));
                    }
                });
    }
}
