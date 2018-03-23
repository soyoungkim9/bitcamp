package step11.ex11;

public class B3 extends B{
    // 오버라이딩 문법 검사
    // => 오버라이딩을 제대로 했는지 컴파일러에게 검사하도록 요청할 수 있다.
    // => 어떻게?
    //    메서드 정의 앞에 @Override를 붙여라
    
    @Override 
    void m(int x) {
        System.out.println("B2의 m()");
    }
}
