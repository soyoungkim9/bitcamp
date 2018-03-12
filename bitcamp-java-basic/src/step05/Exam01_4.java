// 흐름 제어문 - if 문의 조건
package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_4 {
    public static void main(String[] args) {
        int age = 17;

        // if문은 else문 없이 단독으로 사용할 수 있다.
        if(age < 19)
            System.out.println("미성년입니다.");
        if(age >= 19)
            System.out.println("성인입니다.");
        else
            System.out.println("미성년입니다.");

        // 잘못 사용한 예:
        // => else 문만 단독으로 사용할 수 없다.
        /*
        else
            System.out.println("컴파일 오류!");
        */

        // => if문과 else 문 사이에 다른 문장이 올수 없다.
        /*
        if(age >= 19)
            System.out.println("성인입니다.");
        System.out.println("-----------------------");
        else
            System.out.println("미성년입니다.");
        */

        // => 블록에 들어 있는 문장은 if문에 소속되기 때문에 상관없다.
        //    블록 안에 여러 개의 문장이 와도 상관없다.
        if(age >= 19) { // OK
            System.out.println("성인입니다.");
            System.out.println("-----------------------");
        }
        else
            System.out.println("미성년입니다.");
    }
}