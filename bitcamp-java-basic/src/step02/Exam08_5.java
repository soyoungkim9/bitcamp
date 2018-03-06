// 형변환 - 명시적 형변환
package step02;

public class Exam08_5 {
  public static void main(String[] args) {
    float f = 3.14f;
    double d = 9876.56789;

    // 부동소수점 값을 정수 메모리에 저장하고 싶을때,
    // 또는 큰 메모리 값을 작은 메모리에 저장하고 싶을때
    // 컴파일러에게 강제로 값을 넣을 것을 명시하라 (명시적 형변환)

    int i = (int)f;
    long l = (long)d;
    System.out.println(i);
    System.out.println(l);

  }
}

