package step11.ex06;

public class Exam01 {
    public static void main(String[] args) {
        C obj = new C();
        obj.v1 = 100;
        obj.v2 = 200;
        obj.v3 = 300;
        System.out.printf("v1=%d, v2=%d, v3=%d\n", obj.v1, obj.v2, obj.v3);
        
        // 생성자 호출 순서
        // 1) C 클래스의 생성자를 호출하면
        //    그 생성자의 첫번째 문장이 수퍼 클래스의 호출하는 명령
        //    그래서 수퍼 클래스인 B클래스의 생성자를 호출한다.
        // 2) B
        // 3) A
    }
}
