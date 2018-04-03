// java.util.ArrayLIst 클래스 사용
package step12.ex5;

import java.util.ArrayList;

// ArrayLIst 사용처
// => 즁복을 허용한다.
// => Set은 집합을 의미한다.
// => 집합에서는 중복값을 허용하지 않는다.
// => 값의 중복 여부는 hashCode()의 리턴 값이 같고, equlas()의 검사 결과가 true일 때
//    같은 값으로 취급한다.
// => 즉 중복된 값을 저장하고 싶지 않을 때 ArrayLIst을 사용한다.

public class Exam01_2 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");
        
        ArrayList list = new ArrayList();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5); 
        // 비록 v5가 v3와 다른 인스턴스이지만 두 객체 들어있는 문자열은 같다.
        // String 클래스는 인스턴스가 다르더라도 값이 같으면
        // hashCode()의 리턴 값이 같도록 오버라이딩 하였다.
        // 또한 equals()의 리턴 값도 true가 되도록 오버라이딩 하였다.
        
        // ArrayLIst은 값의 중복을 검사할 때 인스턴스의 주소를 비교하지 않고
        // hashCode()의 리턴 값과 equals()의 리턴 값으로 판단한다.
        // 비록 v5는 v3와 다른 인스턴스이지만,
        // hashCode()의 리턴 값이 같고 두 객체에 대해 equals()를 호출하면
        // true가 리턴되기 때문에 같은 값으로 간주하여 중복 저장하지 않는다.
        // 결론! v5가 저장되지 않는다.
        
        print(list);
    }
    
    static void print(ArrayList list) {
        Object[] values = list.toArray();
        for(Object obj : values) {
            System.out.print(values + ", ");
        }
        System.out.println();
    }
}
