// Worker 구현체 사용
package step14.ex1;

public class Exam02 {

    public static void main(String[] args) {
        // 인터페이스 레퍼런스
        // => 인터페이스를 구현한 클래스의 객체 주소를 저장하는 변수
        Worker w1 = new BlueWorker();
    
        // d인터페이스를 구현하지 안ㅇㅎ느 클래스의 인스턴스 주소를 저장할 수 없다.
        //Worekr w2 = new String();
        
        Worker w2 = new WhiteWorker();
        Worker w3 = new JubuWorker();
    
        // 인터페이스 구현체 호출
        w1.excute();
        w2.excute();
        w3.excute();
        
        // 역할?
        // caller : Exam01
        // callee : BluewWorker, WhiteWorker, JubuWorker
        // 규칙 : Worker
    }

}
