// 애노테이션 프로퍼티 타입 - value 프로퍼티
package step20.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {
    // 배열값이 하나일 경우 괄호 생략 가능
    String[] v1() default "가나다";
    int[] v2() default 100;
    float[] v3() default 3.14f;
}








