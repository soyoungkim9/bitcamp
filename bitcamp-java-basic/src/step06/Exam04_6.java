// 메서드 : 스택 메모리 응용 III - 스택 오버플로우
package step06;

import java.util.Scanner;

/*class MyObject {
    int a;
    int b;
}*/

public class Exam04_6 {

    static int sum(int value) {
        // 종료 조건을 빼버리면, 무한으로 호출한다.
        /*
        if (value == 1)
            return 1;
        */
        long a1, a2, a3, a4, a5, a6, a7, a8, a9,
             a10, a11, a12, a13, a14, a15, a16,
             a111, a222, a333, a444, a555, a666;
        System.out.println(value);
         return value + sum(value-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
