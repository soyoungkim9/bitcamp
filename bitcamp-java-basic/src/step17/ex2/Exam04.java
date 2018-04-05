// 상수 코드를 별도의 클래스로 분리하여 다루기
package step17.ex2;

// 스태틱 즁첩 클래스를 사용할 때 바깥 클래스를 지정하고 싶지 않다면 
// 다음과 같이 미리 스태틱 중첩 클래스가 들어 있는 ... 멤버를 이름을 지정하지 않고 바로 사용하고 싶다면
// 다음과 같이 해당 스태틱 멤버가 들어 있는 클래스를 컴파일러에게 알려줘라@
import static step17.ex2.Category2.*;

public class Exam04 {
    public static void main(String[] args) {
        Product2 p = new Product2();
        
        // p.category = Category2.appliance.TV;
        
        // 위에서 import로 스태틱 멤버(변수, 메서드, 중첩클래스)가 들어 있는 클래스의
        // 패키지 정보를 컴파일러에게 알려줬기 대문에
        // 다음과 같이 클래스 이름을 생략하고 쓸 수 있다.
        p.category = appliance.TV;
        
        p.name = "울트라비젼 뷰";
        p.price = 2000000;
        
    }
}
