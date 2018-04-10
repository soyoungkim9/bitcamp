// RunException 예외 던지고 받기
package step21.ex4;

public class Exam03 {
    static void m1() {
        // RuntimeException 예외를 받을 경우
        // try ~ catch ~ 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m2();
    }
    
    static void m2() {
        // RuntimeException 예외를 받을 경우
        // try ~ catch ~ 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m3();
    }
    
    static void m3() {
        // m4()에서 어떤 예외가 발생하는지 구체적으로 선언되어 있지 않기 때문에
        // m4()를 호출할 때는 예외처리를 고민할 필요가 없다.
        // 그냥 예외를 던지지 않는 메서드인 것 처럼 사용하면 된다.
        // => 그러나 명심하라!
        //    m4()예외가 발생되면 상위 호출자에게 예외를 던질 것이다.
        m4();
    }
    
    static void m4() {
        // RuntimeException을 상위 호출자에게 전달할 때는
        // 굳이 메서드 선언부에 지정하지 않아도 된다.
        throw new RuntimeException("m4() 예외 발생!");
    }
    
    public static void main(String[] args) {
        try {
            m1();
        } catch (RuntimeException e) {
            // m4() 에서 발생된 예외가 여기까지 도달한다.
            System.out.println(e.getMessage());
        }
    }
}
