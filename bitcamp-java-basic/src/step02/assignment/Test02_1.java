package step02.assignment;

// 3단계: 여러 명의 성적 정보를 받아서 처리하기
public class Test02_1 {
    public static void main(String[] args) {

        String name1, name2, name3, name4, name5;
        int kor1, kor2, kor3, kor4, kor5;
        int eng1, eng2, eng3, eng4, eng5;
        int math1, math2, math3, math4, math5;
        int sum1, sum2, sum3, sum4, sum5;
        float average1, average2, average3, average4, average5;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name1 = keyScan.next();
        kor1 = keyScan.nextInt();
        eng1 = keyScan.nextInt();
        math1 = keyScan.nextInt();

        sum1 = kor1 + eng1 + math1;
        average1 = sum1 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name2 = keyScan.next();
        kor2 = keyScan.nextInt();
        eng2 = keyScan.nextInt();
        math2 = keyScan.nextInt();

        sum2 = kor2 + eng2 + math2;
        average2 = sum2 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name3 = keyScan.next();
        kor3 = keyScan.nextInt();
        eng3 = keyScan.nextInt();
        math3 = keyScan.nextInt();

        sum3 = kor3 + eng3 + math3;
        average3 = sum3 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name4 = keyScan.next();
        kor4 = keyScan.nextInt();
        eng4 = keyScan.nextInt();
        math4 = keyScan.nextInt();

        sum4 = kor4 + eng4 + math4;
        average4 = sum4 / 3;

        System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
        name5 = keyScan.next();
        kor5 = keyScan.nextInt();
        eng5 = keyScan.nextInt();
        math5 = keyScan.nextInt();

        sum5 = kor5 + eng5 + math5;
        average5 = sum5 / 3;

        System.out.println("------------------------------");
        System.out.print(name1);
        System.out.print(" ");
        System.out.print(kor1);
        System.out.print(" ");
        System.out.print(eng1);
        System.out.print(" ");
        System.out.print(math1);
        System.out.print(" ");
        System.out.print(sum1);
        System.out.print(" ");
        System.out.print(average1);
        System.out.println();

        System.out.print(name2);
        System.out.print(" ");
        System.out.print(kor2);
        System.out.print(" ");
        System.out.print(eng2);
        System.out.print(" ");
        System.out.print(math2);
        System.out.print(" ");
        System.out.print(sum2);
        System.out.print(" ");
        System.out.print(average2);
        System.out.println();

        System.out.print(name3);
        System.out.print(" ");
        System.out.print(kor3);
        System.out.print(" ");
        System.out.print(eng3);
        System.out.print(" ");
        System.out.print(math3);
        System.out.print(" ");
        System.out.print(sum3);
        System.out.print(" ");
        System.out.print(average3);
        System.out.println();

        System.out.print(name4);
        System.out.print(" ");
        System.out.print(kor4);
        System.out.print(" ");
        System.out.print(eng4);
        System.out.print(" ");
        System.out.print(math4);
        System.out.print(" ");
        System.out.print(sum4);
        System.out.print(" ");
        System.out.print(average4);
        System.out.println();

        System.out.print(name5);
        System.out.print(" ");
        System.out.print(kor5);
        System.out.print(" ");
        System.out.print(eng5);
        System.out.print(" ");
        System.out.print(math5);
        System.out.print(" ");
        System.out.print(sum5);
        System.out.print(" ");
        System.out.print(average5);
        System.out.println();
    }
}