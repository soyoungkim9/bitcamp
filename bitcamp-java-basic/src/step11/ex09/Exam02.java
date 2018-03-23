// 다형성 - 다형적 변수(polymorphic variable)와 형변환
package step11.ex09;

public class Exam02 {

    public static void main(String[] args) {
        Vehicle v1 = new Sedan();
        Vehicle v2 = new Truck();
        
        // model과 capacity 변수는 원래 Vehicle 설계도에 있는 변수이기 때문에
        // 당연히 레퍼런스를 통해 사용할 수 있다.
        v1.model = "티코";
        v1.capacity = 5;
        
        // 자바 컴파일러는 레퍼런스의 클래스를 보고 사용할 수 있는 변수인지 아닌지
        // 비록 v1 변수에 sedan 객체의 주소가 들어 있다 할지라도
        // 실제 들어 있는 객체의 주소로 판단하지 않고 레퍼런스가 어떤 클래스냐 따라 판단한다.
/*        v1.cc = 16; // 컴파일 오류!
        v1.valve = 16; // 컴파일 오류!
        v1.sunroof = true; // 컴파일 오류!
        v1.auto = true;  // 컴파일 오류!
*/   
        // 그럼에도 불구하고 레퍼런스가 실제 가리키는 객체의 모든 메모리가 접근하고 싶은가?
        // 형변환 하라!
        Sedan s = (Sedan)v1;
        ((Sedan)v1).cc = 1980; // 컴파일 오류!
        ((Sedan)v1).valve = 16; // 컴파일 오류!
        ((Sedan)v1).sunroof = true; // 컴파일 오류!
        ((Sedan)v1).auto = true;  // 컴파일 오류!
        System.out.printf("%s, %d, %d, %d, %b, %b\n",
                s.model, s.capacity, s.cc,
                s.valve, s.sunroof, s.auto);
    
    }
}
