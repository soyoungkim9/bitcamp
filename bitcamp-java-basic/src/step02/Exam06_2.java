// 문자 변수 - UTF-16(Unicode 2) 코드 값 저장
package step02;

public class Exam06_2 {
    public static void main(String[] args) {
        char c1, c2;
        c1 = 0x41;  // A문자의 UTF-16코드값
        c2 = 65;
        c3 = 0b0100_0001;

        // println()은 변수의 타입에 따라 출력을 달리한다.
        // 변수의 종류가 char이면 해당코드의 문자를 찾아 출력
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 다음 변수에 핳 문자를 저장하여 출력하라!
        // 자바에서는 문자의 코드 값을 알아내는 명령어가 있다.
        char c3;
        c3 = '헐'; // 작은 따옴표를 사용하라!
                   // '헐'의 경우 헐 문자의 UTF-16코드 값을
                   // 그 자리에 놓는다.
                   // c4 = 54736
        System.out.println(c4);
    }
}

