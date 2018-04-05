// 상수 코드를 별도의 클래스로 분리하여 다루기
package step17.ex2;


// 스태티 ㄱ중첩 클래스 이름까지도 
// 다음과 같이 import static을 사용하여 미리 컴파일러에게 알려줘라!
import static step17.ex2.Category2.appliance.*;
import static step17.ex2.Category2.computer.*;
import static step17.ex2.Category2.book.*;
public class Exam05 {
    public static void main(String[] args) {
        Product2 p = new Product2();
        
        // p.category = Category2.appliance.TV;
        
        // 위에서 import로 스태틱 멤버(변수, 메서드, 중첩클래스)가 들어 있는 클래스의
        // Category2 클래스에 대해 컴파일러에게 알려줬기 때문에
        // 패키지 정보를 컴파일러에게 알려줬기 대문에
        // 다음과 같이 클래스 이름을 생략하고 쓸 수 있다.
        p.category = TV;
        p.category = NOVEL;
        p.category = MOUSE;
        
        p.name = "울트라비젼 뷰";
        p.price = 2000000;
        
    }
}
