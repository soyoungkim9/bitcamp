package step05.assignment;

import java.util.Scanner;

public class function2 {
    public static void printStar1(int len) {
        for(int i = 0; i <= len; i++) {
            System.out.print('*');
        }
    }

    public static void printStar2(int len) {
        for(int i = 0; i < len-i-1; i++) {
            System.out.print('*');
        }
    }

    public static void main (String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int x = keyScan.nextInt();

        int i = 0; //세로 줄
        while(i < x) {
            printStar1(i);
            System.out.println();
            i++;
        }
        i = 0;
        while(i < x-1) {
            printStar2(i);
            System.out.println();
            i++;
        }
    }
}