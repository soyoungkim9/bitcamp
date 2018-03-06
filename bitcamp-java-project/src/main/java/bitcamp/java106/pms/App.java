package bitcamp.java106.pms;

public class App {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner scanner = new java.util.Scanner(keyboard);

        String tName;
        String ex;
        int max;
        String start;
        String end;
         

        System.out.print("팀명? ");
        tName = scanner.nextLine();
        System.out.print("설명? ");
        ex = scanner.nextLine();
        System.out.print("최대인원? ");
        max = scanner.nextInt();
        scanner.nextLine(); // 개행문자 \r\n 제거
        System.out.print("시작일? ");
        start = scanner.nextLine();
        System.out.print("종료일? ");
        end = scanner.nextLine();
        System.out.println("---------------");

        System.out.print("팀명: ");
        System.out.println(tName);
        System.out.println("설명:");
        System.out.println(ex);
        System.out.print("최대인원: ");
        System.out.print(max);
        System.out.println('명'); // max(int) + '명' 연산 시 int형으로반환됨 주의!
        System.out.print("일자: ");
        System.out.println(start + " ~ " + end);
    }
}