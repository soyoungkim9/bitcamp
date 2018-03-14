// 메서드 : 개념 및 기본 문법 IV
package step06;

public class Exam02_5 {

    // 5) 메서드 : 가변 파라미터
    // [리턴타입] 메서드명(타입...변수) {...}
    // => 0개 이상의 값을 받을 때 선언하는 방식
    // => 내부적으로 배열처럼 사용한다.
    //
    // 다음은 hello()를 호출할 때 String 값으 0개 이상 전달할 수 있다.

    static void hello(String... names) {
        for(int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }

    public static void main(String[] args) {
        hello();
        System.out.println("---------------------");

        hello("홍길동");
        System.out.println("---------------------");

        
        hello("홍길동", "유관순", "임꺽정");
        System.out.println("---------------------");

        String[] arr = {"김구", "안중근", "윤봉길", "유관순"};
        hello(arr);
        System.out.println("---------------------");
    }
}



