// 정수 변수 - 크기가 다른 변수끼리 값 할당
package step02;

public class Exam04_2 {
    public static void main(String[] args) {
        int i = 100;
        byte b = 100;

        // 리터럴에 대해서만 예외를 허용
        b = i; // *** 컴파일 오류; 변수이기 때문임

        short s = 100;
        s = i; // 컴파일 오류

        int j = 100;
        j = i; // OK, 같은 종류의 메모리끼리는 값을 저장할 수 있다.

        long l = 100;
        l = i; // OK, 당연히 작은 메모리값을 큰 메모리에 저장할 수 있다.

        int k;
        k = l; // 컴파일 오류
    }
}

