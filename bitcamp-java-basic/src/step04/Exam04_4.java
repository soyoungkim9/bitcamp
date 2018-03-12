// 비트 이동 연산자 : >>, >>>, << 
package step04;

public class Exam04_4 {
    public static void main(String[] args) {
        int i = 0x27a130ff;
        int a, b, c, d;
        System.out.println(Integer.toHexString(i));
    
        // i 변수에 들어있는 값을 1바이트씩 짤라서 16진수로 출력하라!
        // 비트연산자 비트 or연산

        //27 27_a1_30_ff
        a = i >> 24;
        System.out.println(Integer.toHexString(a));

        //a1
        b = (i >> 16) & 0xff;
        System.out.println(Integer.toHexString(b));

        //30
        c = (i >> 8) & 0xff;
        System.out.println(Integer.toHexString(c));
        
        //ff

        d = i & 0xff;
        System.out.println(Integer.toHexString(d));

    }
}

