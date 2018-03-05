// 문자 변수 - UTF-16(Unicode 2) 코드 값 저장
package step02;

public class Exam06_3 {
    public static void main(String[] args) {
        int a = 0xac00;
        // a 메모리의 종류가 int이기 때문에
        // 그냥 10진수 정수 값을 출력한다.
        System.out.println(a);

        // println()에게 정수 값을 문자 코드라고 알려주면
        // 문자를 출력한다.
        System.out.println((char)a);

        for(int i = 0; i <100; i++) {
            if((i % 10) == 0) System.out.println();
            System.out.print((char)('가'+ i));

        }
    }
}
// 결론
// -char 메모리에서는 0에서 65535까지의 정수 값을 저장한다.
// - UTF-16에 정의된 문자에 대한 2바이트 코드 값을 저장한다.
// - 메모리의 문자를 직접 저장할 방법은 없다.
//   반드시 2진수로 변환하여 저장해야 된다.
// 즉, 메모리에 저장하는 것은 2진수 값이다.
