// 제네릭(Generic) - 사용 전
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Member("홍길동", 20));
        list.add(new String("홍길동"));
        list.add(new Integer(100));
        list.add(new HashSet());
        
        // 값 꺼내기
        // 객체의 값을 꺼낼 때는 보통 해당 클래스로 형변환 한 다음에 사용한다.
        // 왜? get() 메서드의 리턴 타입이 Object이기 때문이다.
        Member member = (Member) list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
    }
    // ArrayList에 어떤 종류(타입,클래스)의 객체를 저장할 지 지정하지 않으면
    // 기본으로 Object 타입의 객체를 다루는 것으로 간주한다.
    // 즉 Object 타입이라면 어떤 클래스든지 저장하고 꺼낼 수 있다.
}
