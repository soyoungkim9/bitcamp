// 클래스 변수의 응용
package step08;

public class Exam01_6 {
    static class Member {
        // 모든 인스턴스가 다음의 변수에 대해 같은 값을 가질 경우,
        // 클래스 변수로 만드는 것이 바람직하다.
        // => 만약 값을 저장한느 것이 아닌 조회하는 용도로만 사용하는 변수라면
        //    대문자로 선언하여 상수임으 ㄹ 표현하라!
        // => 조회 용도로만 사용하기로 했으면 문법적으로 값을 변경하는 것을 막아라!
        // => 보통 조회용으로 사용하는 변수는 공개해도 되기 때문에 public으로 선언한다!
        public final static int GUEST = 0;
        public final static int MEMBER = 1;
        public final static int MANAGER = 2;
        
        String id;
        String password;
        int type; // 0: 손님, 1: 회원, 2: 관리자
    }
    
    public static void main(String[] args) {
        Member m4 = new Member();
        m4.id = "aaa";
        m4.password = "1111";
        m4.type = Member.GUEST;
        
        Member m5 = new Member();
        m5.id = "bbb";
        m5.password = "1111";
        m5.type = Member.MANAGER; 
        
        Member m6 = new Member();
        m6.id = "ccc";
        m6.password = "1111";
        m6.type = Member.MEMBER;
        
        // 회원의 타입을 지정할 때 숫자를 이용하였다.
        // 그런데 소스 코드를 작성한 후 시간이 오래 지나면 숫자의 의미를 기억하기가 쉽지 않다.
        // 주석이나 개발 문서를 자세히 살펴보지 않는 이상에는 숫자의 의미를 파악하기 쉽지 않다.
        // 이런 경우를 방지하고자 나오느 문법이 ㅅ아수이다.
        //
        // "이런 경우를 방지하고자 나온 문법이 상숭디ㅏ!"
        // => 즉 의미있는 일므으로 변수를 만들어 놓고 그 변수에 숫자를 저장한다.
    }
}
