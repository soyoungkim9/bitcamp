// 메서드 분류 - 인스턴스 변수 사용
package step07;

public class Calculator4 {
    // 인스턴스 변수
    // => 작업 결과를 개별적으로 관맇가ㅗ 싶을 때 인스턴스 변수로 선언한다.
    // => 인스턴스 변수는 클래스가 로딩 될 때 만들어지지 않는다.
    // => new 명령을 사용해서 만들어야 한다.
    // => 변수 선어 ㄴ앞에 static이 붙지 않는다.
    int result = 0;
    
    // 인스턴스 변수를 다루는 메서드는 작업을 수행할 때 그 인스턴스 주소를 받아야 한다.
    public void plus(int value) {
        // result는 더이상 클래스 변수가 아니기 때문에 직접 접근할 수 없다.
        // 오직 인스턴스 주소를 통해서만 접근할 수 있다.
        this.result += value;
    }
    public void minus(int value) {
        this.result -= value;
    }
    public void multiple(int value) {
        this.result *= value;
    }
    public void divide(int value) {
        this.result /= value;
    }
}
