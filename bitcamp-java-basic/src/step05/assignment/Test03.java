package step05.assignment;

import java.util.Scanner;

public class Test03 {
    public static void main (String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변 길이? ");
        int x = keyScan.nextInt();
        /*
        int space = x / 2;
        for(int i = 0; i < x; i += 2) {
            for(int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            space--;
            for(int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        */

        int space = x / 2;
        int i = 0;
        while(i < x) {
            int j = 0;
            while (j < space) {
                System.out.print(" ");
                j++;
            }
            space--;
            int k = 0;
            while(k <= i) {
                System.out.print('*');
                k++;
            }
            System.out.println();
            i +=2;
        }
    }
}