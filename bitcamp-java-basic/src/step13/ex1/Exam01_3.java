// 제네릭(Generic) - 사용 전
package step13.ex1;

import java.util.ArrayList;

public class Exam01_3 {
    public static void main(String[] args) {
        // 문법
        // => 클래스명 옆에 다루고자 하는 타입의 이름을 지정한다.
        //    클래스명<타입명>
        ArrayList<Member> list = new ArrayList();
        list.add(new Member("홍길동", 20));
        
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        
        // 만약 제네릭이라는 문법이 없다면?
        // 1) 값을 꺼낼 때 마다 형변환을 해야 한다.
        // 2) 형변환하기 싫다면 값의 종류별로 ArrayList를 만들어야 한다.
        //
        // 제네릭 문법이 존재하므로
        // => 한 개의 클래스로 여러 타입의 객체를 형변환 없이 다룰 수 있다.
    }
    

    
    
}
