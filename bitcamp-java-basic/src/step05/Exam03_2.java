// 흐름 제어문 - 반복문 while
package step05;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        // 1부터 100까지의 합은?
        while(count < 100) {
            count++;
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");

        // continue 사용 전
        // 1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while(count < 100) {
            count++;
            if(count % 2 == 0)
                sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");
        // continue 사용 후
        // 1부터 100까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while(count < 100) {
            count++;
            if(count % 2 == 1) {
                continue;
            }
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");
        // break 사용 전 
        // 0부터 99까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) // 50 넘어가면 합을 수행하지 않는다.
                continue;
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");
        
        // break 사용 후 
        // 0부터 99까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) // 50 넘어가면 합을 수행하지 않는다.
                break;
            sum += count;
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------");
    }
}

