package step14.ex2;

public class Exam01 {

    public static void main(String[] args) {
        // 인터페이스의 인스턴스는 칸들 수 없다.
        // A4 obj = new A4(); // 컴파일 오류!
        
        // 인터페이스의 모든 변수는 스새틱 변수이다.
        System.out.println(A4.v1);
        
        // 그런데 final이기 때문에 값을 바꿀 수 없다.
        // A4.v2 = 300;
    }
}
