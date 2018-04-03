// 제네릭(Generic) - x특징1
package step13.ex1;

import java.util.ArrayList;

public class Exam01_1 {
    public static void main(String[] args) {
        // Generic 사용
        // 특징 1: 다루는 타입을 제한할 수 있다.
        // => 즉 ArrayList가 어떤 종류(타입, 클래스)의 객체를 저장할 것인지 지정할 수 있다.
        //    지정된 타입 외에 다른 타입은 지정할 수 없다.
        // => 방법
        //    클래스명 옆에 다루고자 하는 타입의 이름을 지정한다.
        //    클래스명<타입명>
        
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("홍길동", 20));
        
        // ArrayList를 선언할 때 지정된 타입이 아닌 경우에는 컴파일 오류가 발생한다.
        // => 컬렉션에 잘못된 값이 들어갈 상황을 없앨 수 있다.
        // list.add(new String("홍길동"));
        // list.add(new Integer(100));
        
        // 레퍼런스에 제너릭 정보가 있다면 new 연산자에서는 생략할 수 있다.
        ArrayList<Member> list2 = new ArrayList</*"Member"*/>();
        
        ArrayList<Member> list3;
        list3 = new ArrayList<>();
        
        // 레퍼런스 변수를 선언할 때는 제너릭 문법에서 타입명을 생략할 수 없다.
        // ArrayList<> list4;
    }
    // ArrayList에 어떤 종류(타입,클래스)의 객체를 저장할 지 지정하지 않으면
    // 기본으로 Object 타입의 객체를 다루는 것으로 간주한다.
    // 즉 Object 타입이라면 어떤 클래스든지 저장하고 꺼낼 수 있다.
}
