package step05.assignment;

import java.util.Scanner;

public class Test02 {
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
        for(int i = 0; i < x-1; i++) {
            for(int j = 0; j < x-i-1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        */

        int count = 0; //세로 줄
        while(count < x) {
            int star = 0;
            while (star <= count){
                System.out.print('*');
                star++;
            }
            System.out.println();
            count++;
        }
        count = 0;
        while(count < x-1) {
            int star = 0;
            while (star < x-count-1){
                System.out.print('*');
                star++;
            }
            System.out.println();
            count++;
        }
    }
}