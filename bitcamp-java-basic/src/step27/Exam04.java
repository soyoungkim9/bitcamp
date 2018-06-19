// 람다(lambda) - 익명 클래스 와 람다 표현식
package step27;

public class Exam04 {

    static interface Calculator {
        int compute(int a, int b);
    }
    
    static void test(Calculator c) {
        System.out.println(c.compute(100, 200));
    }
    
    public static void main(String[] args) {
        // 파라미터와 리턴 값이 있는 메서드 구현하기
        test((a, b) -> a + b);
        test(new Calculator() {
            public int compute(int a, int b) {
                return a + b;
            }
        });
        
        test((a, b) -> {
            int sum = 0;
            for (int i = a; i <=b; i++) {
                sum += i;
            }
            return sum;
        });
        
    }
}
