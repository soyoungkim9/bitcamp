// 다형적 변수와 오버라이딩
package step11.ex14;

public class Exam01 {
    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();
        
        // A
        a.m();
        
        a2.m();
        a2.x();
        
        // 다형적 변수와 오버라이딩 메서드
        A p = a2; // 수퍼 클래스의 래퍼런스는 서브 클래스의 객체 주소를 담을 수 있다.
                  // 수퍼 클래스의 레퍼런스는 서브 클래스의 객체를 가리킬 수 있다.
        
        // p.x(); // 컴파일 오류 
               // 비록 p에는 실제로 A2 객체의 주소가 저장되어 있지만,
               // 컴파일러는 p가 실제 가리키는 객체에 관심이 없고
               // p가 어떤 클래스의 변수인지만 확인한다.
               // p는 A 클래스의 변수이기 때문에
               // 오직 A 클래스의 멤버(변수,메서드)만 사용할 수 있다.
        
        // 주의!
        p.m(); // 단, p가 실제 가리키는 객체의 클래스가
               // p 클래스의 메서드를 오버라이딩 했다면
               // 그때는 실제 가리키는 객체의 클래스를 오버라이딩 한 메서드를 호출한다.
    }
}
