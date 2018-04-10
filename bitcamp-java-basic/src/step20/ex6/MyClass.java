// 애노테이션 적용 범위
package step20.ex6;

// @MyAnnotation은 메서드와 타입(인터페이스와 클래스)에만 붙일 수 있다.ㅂ
@MyAnnotation // 컴파일 오류!
public class MyClass {
    @MyAnnotation int i; // 컴파일 오류!
    
    //@MyAnnotation은 메서드에만 붙일 수 있다.
    @MyAnnotation public void m() {}
}
