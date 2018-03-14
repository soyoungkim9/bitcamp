// 흐름 제어문 - for 반복문과 컬렉션
package step06;

//import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
import java.util.ArrayList;

public class Exam01_1 {
    public static void printSpaces(int len) {
        for(int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }
    public static void printStar(int len) {
        for(int i = 0; i <= len; i++) {
            System.out.print("*");
        }
    }
    public static int getSpaceLength(int totalStar, int displayStar) {
        return (totalStar - displayStar) / 2;
    }

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int x = keyScan.nextInt();

        for(int i = 0; i < x; i += 2) {
            printSpaces(getSpaceLength(x, i));
            printStar(i);
            System.out.println();
        }
        
        /*
        int i = 0;
        while(i < x) {
            int j = 0;
            int space = (x - i) / 2;
            while (j < space) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while(k <= i) {
                System.out.print('*');
                k++;
            }
            System.out.println();
            i +=2;
        }
        */


    }
}

