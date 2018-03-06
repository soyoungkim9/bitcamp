package step02.assignment;

// 4단계: 
public class Test02_3 {
    public static void main(String[] args) {
        // 배열을 사용하면 같은 종류의 메모리를 아주 간단하게 만들 수 있다.
        String[] name = new String[5];
        int []kor = new int[5];
        int []eng = new int[5];
        int []math = new int[5];
        int []sum = new int[5];
        float []average = new float[5];

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        for(int i = 0; i < 5; i++) {
            System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();

            sum[i] = kor[i] + eng[i] + math[i];
            average[i] = sum[i] / 3;
        }

        System.out.println("------------------------------");
        
        for(int i = 0; i < 5; i++) {
            System.out.print(name[i]);
            System.out.print(" ");
            System.out.print(kor[i]);
            System.out.print(" ");
            System.out.print(eng[i]);
            System.out.print(" ");
            System.out.print(math[i]);
            System.out.print(" ");
            System.out.print(sum[i]);
            System.out.print(" ");
            System.out.print(average[i]);
            System.out.println();
        }
    }
}