// 어떻게? 상속 문법을 이용한다.
package step11.ex07;

public class B extends A {
    int v2;
    
    B() {
        // 만약 수퍼 클래스에 기본 생성자가 없으면 컴파일 오류가 발생한다!
        
        // 해결 방법?
        // => 수퍼 클래스에 있는 다른 생성자를 호출하라!
        super(100);
        System.out.println("B() 생성자!");
    }
}
