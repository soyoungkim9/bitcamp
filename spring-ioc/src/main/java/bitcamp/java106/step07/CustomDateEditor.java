// 프로퍼티 에디터 만들기
package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

// 프로퍼티 에디터 만드는 방법
// 1) java.beans.PropertyEditorSupport를 상속 받는다.
public class CustomDateEditor extends PropertyEditorSupport {
    // 이 메서드는 스프링 IoC 컨테이너가 String 타입의 프로퍼티 값을
    // 다른 타입의 값으로 바꿀 떄 호출하는 메서드이다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomDateEditor.setAsText()");
        // 파라미터로 넘어온 String 타입의 프로퍼티 값을
        // 원하는 값으로 변경한다.
        this.setValue(Date.valueOf(text));
    }
    
    @Override
    public void setValue(Object value) {
        // 이 메서드는 단지 호출되었을 떄 표시하기 위해 오버라이딩 했다.
        System.out.println("CustomDateEditor.setValue()");
        super.setValue(value); // 원래 하던 일을 수행한다.
    }
    
    @Override
    public Object getValue() {
        // 이 메서드는 단지 호출되었을 떄 표시하기 위해 오버라이딩 했다.
        System.out.println("CustomDateEditor.getValue()");
        return super.getValue(); // 원래 하던 일을 수행한다.
    }
}
