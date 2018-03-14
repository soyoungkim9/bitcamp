package step05.assignment;

import java.util.Scanner;

public class Test01 {
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
    }
}
