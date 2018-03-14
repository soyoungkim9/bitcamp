// 흐름 제어문 - for 반복문과 컬렉션
package step06;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
import java.util.ArrayList;

public class Exam01_3 {
    public static int getSpaceLength(int totalStar, int displayStar) {
        return (totalStar - displayStar) / 2;
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int len = keyScan.nextInt();

        // 명령 코드들을 기능 별로 묶어 놓고
        // 필요할 때마다 다음과 같이 사용하면
        // 코드를 읽기가 쉬워진다.
        for(int starLen = 1; starLen <= len; starLen += 2) {
            printSpaces((getSpaceLength(len, startLen));
            printStars(starLen);
            System.out.println();

        }
    }
}

