// 키보드 입력 받기
package step02;

public class Exam02_2 {
    public static void main(String[] args) {
        // 키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        // 팀 멤버의 정보를 입력 받아 출력하라
        // 이름, 전화, 이메일, 나이, 재직여부
        // 예)
        // 이름? 홍길동
        // 전화? 1111-2222
        // 이메일? hong@test.com
        // 나이? 20
        // 재직여부? y
        System.out.print("이름?");
        System.out.println(keyScan.nextLine());
        System.out.print("전화?");
        System.out.println(keyScan.nextLine());
        System.out.print("이메일?");
        System.out.println(keyScan.nextLine());
        System.out.print("나이?");
        System.out.println(keyScan.nextInt());
        System.out.print("재직여부?");
        System.out.println(keyScan.next());
    }
}

// System.out
// - 표준 출력 장치
// - 즉, 콘솔(모니터, 명령창)을 가리킨다.
// System.in
// - 표준 입력 장치
// - 즉, 키보드를 가리킨다.