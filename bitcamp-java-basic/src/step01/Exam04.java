// 리터럴(literal)
package step01;

public class Exam04 {
  public static void main(String[] args) {
    // 정수
    // 4바이트 크기의 정수
    System.out.println(10);
    System.out.println(+10);
    System.out.println(-10);

    // 8바이트 크기의 정수
    System.out.println(10L);
    System.out.println(+10l);
    System.out.println(-10L);

    // 부동소수점
    // 4바이트크기의 부동소수점
    System.out.println(3.14F);
    System.out.println(31.4e-1f);

    // 8바이트크기의 부동소수점
    System.out.println(3.14);
    System.out.println(31.4e-1);

    // 문자열
    System.out.println("오호라..");

    // 한 개의 문자
    System.out.println('가');

    // 논리값
    System.out.println(true);
    System.out.println(false);
  }
}