// 문자의 리터럴
package step01;

public class Exam07_1 {
  public static void main(String[] args) {
    // 소스 코드에 10진수가 아닌 16진수가 있다면
    // 그것은 개발자가 의도적으로 값이 아닌 2진수를 강조하기 위함이다.
    System.out.println(0x41); // 출력할 때는 10진수가 출력
    
    // 해당 숫자가 단순한 정수값이 아니라,
    // 문자 코드 값임을 알려주면,
    // println() 명령어는 그 문자 코드에 해당하는 문자를
    // 폰트파일에 찾아 출력한다. 
    System.out.println((char)0x41);
    // => 문자의 코드값을 알고있으면 문자를 출력하기 쉽다
    // 만약 문자의 코드값을 모를 때는?
    // => 특별한 기호('')를 사용하여 문자를 표현하라
    System.out.println('A');

    // 문자의 유니코드값을 작은 따옴표에 넣는다
    // 단 코드값 앞에 \ u 문자를 붙여야 한다.
    System.out.println('\u3182');
    System.out.println((char)0x3182);
  }
}

