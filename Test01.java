public class Test01 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner scan = new java.util.Scanner(keyboard);

        String[] name = new String[5];
        int[] korean = new int[5];
        int[] english = new int[5];
        int[] math = new int[5];

        int[] sum = new int[5];
        float[] average = new float[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("입력? ");
            name[i] = scan.next();
            korean[i] = scan.nextInt();
            english[i] = scan.nextInt();
            math[i] = scan.nextInt();
            sum[i] = korean[i] + english[i] + math[i];
            average[i] = sum[i] / 3; 
        }

        System.out.println("-------------------------");

        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %d %d %d %f\n", name[i], korean[i],
                english[i], math[i], sum[i], average[i]);
        }


    }
}