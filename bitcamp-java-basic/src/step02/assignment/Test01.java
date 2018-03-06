package step02.assignment;

public class Test01 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner scanner = new java.util.Scanner(keyboard);

        String name;
        int korean;
        int english;
        int math;
        int total;
        double average;

        System.out.print("이름? ");
        name = scanner.nextLine();
        System.out.print("국어? ");
        korean = scanner.nextInt();
        System.out.print("영어? ");
        // 이전에 국어 점수를 입력받을 때 들어온 줄바꿈 코드는
        // nextInt() 메서드에서 버린다.
        english = scanner.nextInt();
        System.out.print("수학? ");
        math = scanner.nextInt();
        System.out.println("-----------------");

        total = korean + english + math;
        average = total / 3.0;
        System.out.print(name + " " + korean + " " + english + " " + math+ " ");
        System.out.print(total + " " + average);
    }
}