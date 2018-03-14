// 메서드 : 개념 및 기본 문법 IV
package step06;

public class Exam02_6 {

    // 5) 메서드 : 가변 파라미터
    // [리턴타입] 메서드명(타입...변수) {...}
    // => 0개 이상의 값을 받을 때 선언하는 방식
    // => 내부적으로 배열처럼 사용한다.
    //
    // 다음은 hello()를 호출할 때 String 값으 0개 이상 전달할 수 있다.

    // 가변 파라미터
    static void hello(String... names) {
        for(int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }
    // 배열 파라미터
    static void hello2(String[] names) {
        for(int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }

    public static void main(String[] args) {
        // 가변 파라미터의 메서드를 호출할 때는
        // => 다음과 같이 낱개의 여러 개 줄 수도 있고
        hello();
        System.out.println("---------------------");

        // => 또는 다음과 같이 배열에 담아서 전달할 수도 있다.
        String[] arr = {"김구", "안중근", "윤봉길", "유관순"};
        hello(arr);
        System.out.println("---------------------");


        // 배열 파라미터의 메서드를 호출할 때는
        // => 가변 파라미터와달리 낱개의 값을 여러 개 줄수 없다!
        //hello2("안중근", "윤봉길", "유관순");
        System.out.println("---------------------");

        // => 또는 다음과 같이 배열에 담아서 전달할 수도 있다.
        // => 오직 배열에 담아서 전달해야 한다.
        String[] arr2 = {"김구", "안중근", "윤봉길", "유관순"};
        hello2(arr2);
        System.out.println("---------------------");
    }
}



