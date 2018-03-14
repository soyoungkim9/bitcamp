// 메서드 : 인스턴스와 JVM 메모리
package step06;

import java.util.Scanner;

/*class MyObject {
    int a;
    int b;
}*/

public class Exam04_4 {

    static int m1(int value) {
        int r1 = m2(value);
        int r2 = m3(value);
        return r1 + r2;
    }

    static int m2(int value) {
        return value + 100;
    }

    static int m3(int value) {
        return value + 200;    
    }

    public static void main(String[] args) {
        
    }
}
