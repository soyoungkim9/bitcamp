package step05.assignment;

import java.util.Scanner;

public class function1 {
    public static void printStar(int len) {
        for(int i = 0; i <= len; i++) {
            System.out.print('*');
        }
    }

    public static void main (String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int x = keyScan.nextInt();
        /*
        for(int i = 0; i < x; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        */
        for(int i = 0; i < x; i++) {
            printStar(i);
            System.out.println();
        }
    }
}