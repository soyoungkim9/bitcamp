// 논리 연산자 : 조건문과 비트 연산
package step04;

public class Exam03_6 {
    public static void main(String[] args) {
        // &&, ||의 피연산자(operand)는 boolean 이여야 한다.
        // 그리고 계산 결과도 boolean이다.
        boolean r;
        // r = 10 && 20; // 컴파일 오류!
        // r = 10 || 20; // 컴파일 오류!

        // &, |, ^, ~(not)의 피연산자는 정수이다.
        // 그리고 계산 결과도 정수이다.
        // r = 10 & 20; // 컴파일 오류!
        int r2 = 10 & 20; // OK!
        // float r3 = 10.2f & 20.3f; 컴파일 오류!
    }
}