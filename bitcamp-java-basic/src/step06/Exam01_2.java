// 흐름 제어문 - for 반복문과 컬렉션
package step06;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
import java.util.ArrayList;

public class Exam01_2 {
    // 스페이스 출력하는 코드들을
    // 관리하기 쉽도록 별도의 블록에 모아 놓는다.
    // 그리고 그 블록에 대해 이름을 붙인다.
    // => 이렇게 정의한 블록을 "메서드(method)"
    public static void printSpaces(int len) {
        for(int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }

    // *문자를 출력하는 코드를 관리하기 쉽게 별도의 블록으로 빼둔다.
    // 그리고 그 블록의 이름을 붙인다.
    // 이렇게 별도로 빼둔 코드 블록에 이름을 붙인 것을 "메서드=함수"라고 부른다.
    public static void printStars(int len) {
        for(int i = 0; i < len; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int len = keyScan.nextInt();

        // 명령 코드들을 기능 별로 묶어 놓고
        // 필요할 때마다 다음과 같이 사용하면
        // 코드를 읽기가 쉬워진다.
        for(int starLen = 1; starLen <= len; starLen += 2) {
            printSpaces((len - starLen)/2);
            printStars(starLen);
            System.out.println();

        }
    }
}
