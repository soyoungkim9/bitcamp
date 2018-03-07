package step03.assignment;

public class Test01 {
    public static void main(String[] args) {
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        Score[] arr = new Score[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Score();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print("입력? ");
            arr[i].name = scan.next();
            arr[i].kor = scan.nextInt();
            arr[i].eng = scan.nextInt();
            arr[i].math = scan.nextInt();

            arr[i].sum = arr[i].kor + arr[i].eng + arr[i].math;
            arr[i].aver = arr[i].sum / 3;
        }

        System.out.println("---------------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",
            arr[i].name, arr[i].kor, arr[i].eng, arr[i].math,
            arr[i].sum, arr[i].aver);
        }
    }
}