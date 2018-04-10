// 애노테이션 프로퍼티 타입 - value 프로퍼티
package step20.ex6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Target을 사용하여 애노테이션을 붙일 수 있는 범위를 지정할 수 잇다.
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String v1() default "가나다";
}








