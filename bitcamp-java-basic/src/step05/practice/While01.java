package practice;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("밑변 길이? ");
        int x = keyScan.nextInt();

        int line = 1;
        while(line <= x) {
            int star = 1;
            while(star <= line) {
                System.out.print('*');
                star++;
            }
            System.out.println();
            line++;

        }
    }
}