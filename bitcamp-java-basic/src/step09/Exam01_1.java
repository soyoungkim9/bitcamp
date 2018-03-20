// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생서자 활용을 익혀보자!
package step09;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        // 생성자를 호출하여 문자열 인스턴스를 초기화시킨다.
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        // s1과 s2는 다른 인스턴스 이다.
        // => 증명
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    
        // 다른 생성자를 사용하여 스트링 인스턴스를 초기화시키기
        char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        
        System.out.printf("%s, %s, %s\n", s1, s2, s3);
        
        // 바이트 배열을 가지고 스트링 만들기
        // => '가각똘똥' 문자를 EUC-KR 코드 값으로 바이트 배열을 만든다.
        byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, (byte)0xa2, 
                (byte)0xb6, (byte)0xca, (byte)0xb6, (byte)0xcb };
        
        // => EUC-KR 코드 값이 들어 있는 바이트 배열을 가지고 스트링 인스턴스를 초기화시킨다.
        //    즉 유니코드(UTF-16)배열에 저장한다.
        String s4 = new String(bytes);
        System.out.println(s4);
        
        String s5 = new String(bytes, "EUC-KR");
        System.out.println(s5);
    
    
    }
}

// 생성자의 활용
// => 인스턴스 변수를 초기화 시키기 위해  여러 개의 생성자를 만들어 제공할 수 있다.
// => 자신에게 맞는 적절한 생성자를 호출하여 인스턴스를 초기화시킨 후 사용하면 된다.
