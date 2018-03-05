// 형변환 - 타입이나 크기가 다른 변수의 값을 저장할 때
package step02;

public class Exam08_2 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        char c = 100;
        byte b2;
        short s2;
        int i2;
        long l2;
        char c2;

        // 작은 메모리의 값을 큰 메모리에 넣을 수 있다.
        s2 = b;
        i2 = c;
        i2 = s;
        l2 = i;
    }
}

