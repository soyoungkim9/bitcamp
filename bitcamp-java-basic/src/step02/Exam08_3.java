// 형변환 - 정수변수와 부동소수점 변수
package step02;

public class Exam08_3 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 98765678;
        long l = 98765678;
        char c = 100;
        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;

        float f;
        double d;

        // 정수 변수의 값을 부동소수점 변수에 저장 할 수 없다.
        // 값이 짤릴 수 있다.
        f = b; //ok
        System.out.println(f);
        f = s; //ok
        System.out.println(f);
        f = c; //ok
        System.out.println(f);
        f = i; // 가수부 크기(23비트)를 넘는 정수는 짤린다.
                // 즉 유효자릿수를 넘는 정수는 짤린다.
                // 주의! 컴파일 오류가 발생하지 않는다(실행시 값이 짤리는 현상 발생)
        System.out.println(f);
        f = l; // 가수부 크기(23비트)를 넘는 정수는 짤린다.
                 // 즉 유효자릿수를 넘는 정수는 짤린다.
        System.out.println(f);
        d = i;
        System.out.println(d);
        l = 18_2345_3456_4567_5678L;
        d = l;
        System.out.println(d);
    }
}

// 정수 메모리의 값을 부동소수점(float, double) 메모리에 저장할 때 주의해서 사용!
// 컴파일 오류가 발생하지 않으나 값이 짤릴 수 있다.

