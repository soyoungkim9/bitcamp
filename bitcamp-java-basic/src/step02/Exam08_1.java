// 형변환 - 타입이나 크기가 다른 변수의 값을 저장할 때
package step02;

public class Exam08_1 {
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

        // 비록 변수에 들어 있는 값이 작은 값이라 할지라도
        // 큰 메모리의 값을 작은 메모리에 넣을 수 없다.
        /*
        b2 = s;
        s2 = i;
        i2 = l;
        c2 = s;
        */
    }
}

