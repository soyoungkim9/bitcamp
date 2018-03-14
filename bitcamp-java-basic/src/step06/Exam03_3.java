// 메서드 : call by valueII
package step06;

class MyObject {
    int a;
    int b;
}

public class Exam03_3 {
    static void swap(MyObject ref) {
        System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
        int temp = ref.a;
        ref.a = ref.b;
        ref.b = temp;
        System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    }

    public static void main(String[] args) {
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;
        swap(ref);
        System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
    }
}

// call by value
// => 자바에서는 primitive data type인 경우 메서드를 호출할 때
//    값을 넘긴다.


