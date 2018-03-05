// 정수 변수 - 정수 리터럴과 정수 변수
package step02;

public class Exam04_1 {
    public static void main(String[] args) {
        byte b;
        // 정수 리터럴은 기본이 4바이트 메모리를 차지한다.
        b = -128;
        b = 127;
        
        // int를 byte로 바꿀 수 없다.
        b = -129;
        b = 128;

        short s;
        // 4바이트 정수 리터럴을 short 메모리(2byte)에 저장할 수 있다면, 허락한다.
        s = -34769;
        s = 32768;


        // 만약 2바이트 범위를 벗어난다면 컴파일 오류!
        int i;
        // i = -2147483648;
        //i = 2147483647;

        // 다음은 메모리의 문제가 아니다.
        // 정수 값을 표현할 때 4바이트 크기를 넘어가는 수를 표현했기 때문에
        // 오류가 발생한 것이다.
        // 4바이트 크기가 넘어가는 정수를 표현할 때는
        // 반드시 숫자 뒤에 L 또는 l을 붙여야 한다.
        //i = -2147483649;
        //i = 2147483648;

        // 위의 오류 해결
        // 그러나 i 메모리가 4바이트 크기를 갖기 때문에
        // 오른쪽의 값을 모두 저장할 수 없다. 그래서 컴파일 오류가 발생한다.
        i = -2147483649L; // 컴파일 오류!
        i = 2147483648l; // 컴파일 오류!

        long l;
        l = -9223372036854775808L;
        //l = 92233720368547758087L;

        byte b2;
        // 4바이트 정수 리터럴의 경우에만 byte나 short 메모리에 유효한 값을
        // 저장 할 수 있게한다.
        // 8바이트 정수 리터럴의 경우에는
        // 비록 byte나 short 메모리에 저장할 수 있는 값이라도
        // 저장할 수 없다.
        b2 = 100;
        b2 = 100L;
    }
}

