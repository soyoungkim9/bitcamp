package bitcamp.java106.pms;

//import bitcamp.java106.Team;

public class App2 {
    public static void main (String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        char answer = ' ';
        int repeatNum = 0; // 반복수
        Team[] arr = new Team[5];


        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Team();

            System.out.print("팀명? ");
            arr[i].name = scanner.next();
            System.out.print("설명? ");
            arr[i].ex = scanner.nextLine();
            scanner.nextLine();
            System.out.print("최대인원? ");
            arr[i].num = scanner.nextInt();
            System.out.print("시작일? ");
            arr[i].startDate = scanner.next();
            System.out.print("종료일? ");
            arr[i].endDate = scanner.next();

            System.out.print("입력하시겠습니까?(Y/n)");
            answer = scanner.next().charAt(0);
            repeatNum += 1;
            if(answer == 'Y') continue;
            else if(answer == 'n') break;
        }

        System.out.println("-----------------------");

        for(int i = 0; i < repeatNum; i++) {
            System.out.printf("%s, %s, %d명, %s ~ %s\n", 
                arr[i].name,
                arr[i].ex,
                arr[i].num,
                arr[i].startDate,
                arr[i].endDate);
         }


    }
}