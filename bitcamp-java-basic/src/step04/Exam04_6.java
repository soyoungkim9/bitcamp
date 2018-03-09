// 비트 이동 연산자 : 응용 III
package step04;

public class Exam04_6 {
    public static void main(String[] args) {
        // 다음 변수의 값을 조사하여 개발자가 
        // 어떤 프로그래밍 언어를 사용할 수 있는 지 출력하라!
        // => 각 비트의 해당하는 프로그래밍 언어는 다음 순서를 따른다.
        //    c, cpp, java, js, python, php, html, css
        //    
        int lang = 0b1110_0011;
        
        // lang 변수에 들어 있는 각 비트 값을 조사하여 
        // 1이면 그 변수에 해당하는 프로그래밍 이름을 출력한다.
        // => if 조건문, &, == 연산자를 활용하라!
        // => 실행 결과
        //    c cpp java html css 

        if ((lang & 0b1000_0000) == 0b1000_0000) System.out.print("c "); // 1
        
        if ((lang & 0b0100_0000) == 0b0100_0000) System.out.print("cpp "); // 1
        
        if ((lang & 0b0010_0000) == 0b0010_0000) System.out.print("java "); // 1
        
        if ((lang & 0b0001_0000) == 0b0001_0000) System.out.print("js ");
        
        if ((lang & 0b0000_1000) == 0b0100_1000) System.out.print("python ");
        
        if ((lang & 0b0000_0001) == 0b0000_0001) System.out.print("php ");
        
        if ((lang & 0b0000_0010) == 0b0000_0010) System.out.print("html "); // 1
        
        if ((lang & 0b0000_0001) == 0b0000_0001) System.out.print("css "); // 1



    }
}

