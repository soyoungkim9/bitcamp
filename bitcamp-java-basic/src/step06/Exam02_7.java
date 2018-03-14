// 메서드 : 개념 및 기본 문법 IV
package step06;

public class Exam02_7 {
    // 가변 파라미터는 여러 개 선언할 수 없다.
    /*
    static void m1(String... names, String... names2) {} //컴파일 오류!
    */

    // 가변 파라미터는 반드시 맨 끝에 와야 한다.
    // => 아규먼트의 시작과 끝을 구분할 수 없다.
    //    예) m1("aaa", "bbb", "ccc", "ddd");
    //    어느 값이 names 배열에 들어가고, 어느 값이 names2 배열에 들어가는가?
    //static void m2(String... names, String a) {} // 컴파일 오류! 
    static void m2(int a, String... names) {}

    // 배열 파라미터는 여러 개 선언할 수 있다.
    static void x1(String[] names, String[] names2) {}

    // 배열 파라미터는 순서에 상관 없다.
    static void x2(String[] names, int a) {}

    public static void main(String[] args) {

    }
}



