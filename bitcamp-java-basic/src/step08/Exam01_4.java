// 인스턴스 변수
package step08;

public class Exam01_4 {
    static class A {
        static int v1; 
        int v2; 
    }
    
    public static void main(String[] args) {
        A.v1 = 100;
        
        // v2는 인스턴스 변수이기 때문에 사용하기 전에 new 명령으로 먼저 생성해야 한다.
        // A.v2 = 200;
        
        A p = new A();
        // A 클래스의 인스턴스를 만들 때
        // static이 안붙은 변수가 그 대상이
        //A.v2 = 200;
        p.v2 = 200;
        
        // 인스턴스 변수는 인스턴스를 만들 때 마다 생성된다.
        A p2 = new A();
        p2.v2 = 300;
        
        System.out.printf("A.v1=%d, p.v2=%d, p2.v2=%d\n",
                A.v1, p.v2, p2.v2);
        
    }
}

// 클래스 변수는 클래스가 로딩될 때 딱 한 번 자동으로 생서되기 때문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
// 왜? 변수가 한 개이다.