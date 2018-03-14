// 흐름 제어문 - switch 사용 후!
package step05;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

enum Level {
    A, B, C
}
public class Exam02_4 {
    public static void main(String[] args) {
        //Scanner keyScan = new Scanner(System.in);
        //System.out.print("입력? ");
        //int op = keyScan.nextInt();

        //final int A = 0, B = 1, C = 2;
        Level userList = Level.C;
        switch(userList) {
            case A:
                System.out.println("A");
            case B:
                System.out.println("B");
            case C:
                System.out.println("C");
                break;
            default:
                System.out.println("잘못된 입력값입니다.");
        }
    }
}
