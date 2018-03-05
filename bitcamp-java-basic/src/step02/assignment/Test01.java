package step02.assignment;

class Test01 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner scanner = new java.util.Scanner(keyboard);

        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        int total = 0;
        double average = 0;

        System.out.print("이름?");
        name = scanner.nextLine();
        System.out.print("국어?");
        korean = scanner.nextInt();
        System.out.print("영어?");
        english = scanner.nextInt();
        System.out.print("수학?");
        math = scanner.nextInt();
        System.out.println("-----------------");

        total = korean + english + math;
        average = total / 3;
        System.out.print(name + " " + korean + " " + english + " " + math+ " ");
        System.out.print(total + " " + average);
    }
}