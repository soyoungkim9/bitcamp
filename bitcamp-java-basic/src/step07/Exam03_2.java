// 메서드 분류 - 클래스 변수의 활용
package step07;

public class Exam03_2 {
    public static void main(String[] args) {
        // 식1)2 + 3 - 1 * 7 / 3 = ?
        
        Calculator2.plus(2);
        Calculator2.plus(3);
        Calculator2.minus(1);
        Calculator2.multiple(7);
        Calculator2.divide(3);
        
        System.out.printf("result = %d\n", Calculator2.result);  
    }
}

