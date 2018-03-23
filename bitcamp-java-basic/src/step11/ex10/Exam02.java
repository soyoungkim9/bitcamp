// 메서드 오버로딩(overloading) - 정의하는 규칙과 사용 규칙
package step11.ex10;

public class Exam02 {

    public static void main(String[] args) {
        // 같은 이름의 메서드가 여러 개 있을 경우,
        // 아규먼트의 타입과 개수, 순서에 따라 호출될 메서드가 자동으로 결정된다.
        System.out.println(Calculator.plus(100, 200));
        System.out.println(Calculator.plus(100.5f, 200.5f));
        System.out.println(Calculator.plus("33", "77"));
    }
}

// 오버로딩(overloading)
// =>파라미터 타입이나 개수, 순서는 다르지만 이름이 같은 메서드를 여러 개 만들 수 있는 문법
// => 왜 이런 문법이 등장했는가?
// => 파라미터의 형식은 다르지만 같은 기능을 수행하는 메서드에 대해
//    같은 이름을 부여함으로써 프로그래밍의 일관성을 제공하기 위함
