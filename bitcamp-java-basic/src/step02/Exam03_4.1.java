//변수 - 변수 선언과 값 저장
package step02;

public class Exam03_4 {
    public static void main(String[] args) {
        
        int a1, a2;
        a1 = 100;
        a2 = 200;
        System.out.println(a1);
        System.out.println(a2);
        int b1 = 100, b2 = 200;
        System.out.println(b1);
        System.out.println(b2);

        int c1 = 100, c2, c3 = 300, c4;
        System.out.println(c1);
        // 메모리를 준비한 후 단 한 번이라도 값을 넣은 후에 사용해야 한다.
        // 초기화시키지 않은 상태에서 출력하거나 사용하려하면 컴파일 오류 발생
        // System.out.println(c2);
        System.out.println(c3);
        //System.out.println(c4);
    }
}

