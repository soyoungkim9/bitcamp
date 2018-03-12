// 흐름 제어문 - else 문의 소속
package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_5 {
    public static void main(String[] args) {
        int age = 15;

        // else는 가장 가까운 if에 소속된다.
        // 들여쓰기에 속지 말라!

        if(age >= 19)
            if(age >= 70)
                System.out.println("지하철 무임승차 가능합니다.");
        else
            System.out.println("미성년입니다.");
        
        // => else문 if없이 단독으로 사용할 수 없다.
        //      오직 if가 있어야만 사용할 수 있다.
        //      그래서 if ~ else ~는 한 문장으로 취급한다.
        // => 그런 이유로, 위의 if (age >= 70) ~ else ~는 한 문장으로 간주한다.
        //    굳이 다음과 같이 중괄호를 사용할 필요 없다.

        if(age >= 19) {
            if(age >= 70)
                System.out.println("지하철 무임승차 가능합니다.");
            else
                System.out.println("미성년입니다.");
        }

        // 만약 else문을 첫 번재 if문에 소속되게 하고 싶다면
        // 다음과 같이 두 번재 if문을 블록으로 묶어라
        if(age >= 19) {
            if(age >= 70)
                System.out.println("지하철 무임승차 가능합니다.");
        }
        else // 두 번째 if는 첫 번째 if블록에 묶여있기 때문에 이 else와 상관없다.
            System.out.println("미성년입니다.");
        
    }
}