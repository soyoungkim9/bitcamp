// 예외 처리 후 마무리 작업 - try-with-resources
package step21.ex3;

import java.io.FileReader;
import java.util.Scanner;

public class Exam06_3 {
    static void m() throws Exception {
        // 자원해제시키는 코드를 매번 작성하기가 귀찮다!
        // => try-with-resources 라는 문법을 사용하면
        //    굳이 close()를 직접 호출할 필요가 없다.
        // => 단 java.lang.AutoCloseable 구현체에 대해서만 가능하다!
        // => 문법
        //    try (java.lang.AutoCloseable 구현체) {...}
        try (Scanner keyScan = new Scanner(System.in);
                // 반드시 AutoCloseable 구현체이어야 한다.
                //String s = "Hello"; // 컴파일 오류!
                //if(true) // 변수선언만 올 수 있다.
                
                // FileReader 클래스도 java.lang.AutoClassable 구현체이다.
                FileReader in = new FileReader("Hello.java"); // OK!
                ){
            System.out.print("입력> ");
            int value = keyScan.nextInt();
            System.out.println(value * value);
        } 
    }
    public static void main(String[] args)throws Exception {
        m();
    }
}
