package bitcamp.java106.pms;

//import bitcamp.java106.Team;

public class App2 {
    public static void main (String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String answer;
        int repeatNum = 0; // 반복수
        Team[] arr = new Team[5];


        for(int i = 0; i < arr.length; i++) {
            repeatNum += 1;
            arr[i] = new Team();

            System.out.print("팀명? ");
            arr[i].name = scanner.next();
            scanner.nextLine();
            System.out.print("설명? ");
            arr[i].ex = scanner.nextLine();
            System.out.print("최대인원? ");
            arr[i].num = scanner.nextInt();
            System.out.print("시작일? ");
            arr[i].startDate = scanner.next();
            System.out.print("종료일? ");
            arr[i].endDate = scanner.next();
            scanner.nextLine();
            if(repeatNum == arr.length) break;
            System.out.printf("입력하시겠습니까?(Y/n)");
            answer = scanner.nextLine();
  
            if(answer.toLowerCase().equals("Y")) continue;
            else if(answer.toLowerCase().equals("n")) break;
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