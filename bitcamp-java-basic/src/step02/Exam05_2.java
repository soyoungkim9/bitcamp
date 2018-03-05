// 부동소수점 변수 - 단정도와 배정도
package step02;

public class Exam05_2 {
    public static void main(String[] args) {
        float f;
        double d;

        // 부동소수점 리터럴 값 뒤에 f나 F를 붙이면
        // 4바이트 크기의 부동소수점 값을 의미한다.
        // 다음 코드의 값은 4바이트 크기의 부동소수점 저장하는 것이다.
        // 변수(메모리)에 값을 넣기 전에
        // 이미 리터럴 값이 4바이트 크기를 넘어가기 때문에 짤린다.
        // 따라서 d 변수에 저장된 값은 짤린 값이다.
        //f = 9876.98769876f;
        //d = 9876.98769876f;

        //System.out.println(f);
        //System.out.println(d);
        // 리터럴이 메모리의 크기를 넘어갈때
        // 정수의 경우 컴파일 오류
        // 부동소수점의 경우 값이 짤린다.
        f = 9876.98769876f;
        d = 9876.98769876;
        System.out.println(f);
        System.out.println(d);

        //컴파일 오류 발생
        //f = 9876.98769876f;
    }
}

