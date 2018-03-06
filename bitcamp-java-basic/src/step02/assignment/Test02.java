package step02.assignment;

public class Test02 {
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner scanner = new java.util.Scanner(keyboard);

        String[] name = new String[5];
        int[] korean = new int[5];
        int[] english = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        double[] average = new double[5];
        
        for(int j = 0; j < 5; j++) {
            System.out.print("입력? ");
            name[j] = scanner.next();
            korean[j] = scanner.nextInt();
            english[j] = scanner.nextInt();
            math[j] = scanner.nextInt();
                
            sum[j] = korean[j] + english[j] + math[j];
            average[j] = sum[j]/3.0;
        }  
        System.out.println("-----------");
        
        for(int j = 0; j < 4; j++) {
            System.out.print(name[j] + " ");
            System.out.print(korean[j] + " ");
            System.out.print(english[j] + " ");
            System.out.print(math[j] + " ");
            System.out.print(sum[j] + " ");
            System.out.println(average[j]);

        }


    }
}