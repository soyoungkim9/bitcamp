// 메서드 : 스택 메모리 응용 II - 재귀호출
package step06;

import java.util.Scanner;

/*class MyObject {
    int a;
    int b;
}*/

public class Exam04_5 {

    static int sum(int value) {
        if (value == 1)
            return 1;
        return value + sum(100000);
    }

    static int m2(int value) {
        return value + 100;
    }

    static int m3(int value) {
        return value + 200;    
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
