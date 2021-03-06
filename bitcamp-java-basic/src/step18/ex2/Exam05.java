// 메서드 정보 추출 - 특정 메서드만 추출 II
package step18.ex2;

import java.lang.reflect.Method;

public class Exam05 {
    public static void plus(int a, int b) {
        System.out.printf("합계: %d\n", a + b);
    }
    
    public void minus(int a, int b) {
        System.out.printf("빼기 %d\n", a - b);
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Exam05.class;
        
        // 1) 스태틱 메서드를 찾아 호출하기
        Method m = clazz.getMethod("plus", int.class, int.class);
        
        // 메서드 호출 방법
        // invoke(인스턴스, 아규먼트, ...);
        //
        // => 스태틱 메서드이기 때문에 인스턴스는 지정할 필요가 없다.
        m.invoke(null, 10, 20);
        
        // 2) 인스턴스 메서드를 찾아 호출하기
        m = clazz.getMethod("minus", int.class, int.class);
        
        // => 인스턴스 메서드를 호출할 때는 반드시 인스턴스 주소를 넘겨야 한다.
        // m.invoke(null, 10, 20);
        
        Exam05 obj = new Exam05();
        m.invoke(obj, 10, 20);
    }

}


