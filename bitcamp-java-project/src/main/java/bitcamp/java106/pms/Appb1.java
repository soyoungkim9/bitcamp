package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// 2단계 : 배열 적용
public class Appb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[100];
        teams[0] = new Team();

        System.out.print("팀명? ");
        teams[0].name = scanner.nextLine();
        
        System.out.print("설명? ");
        teams[0].description = scanner.nextLine();
        
        System.out.print("최대인원? ");
        teams[0].maxQty = scanner.nextInt();
        
        scanner.nextLine(); // 개행문자 \r\n 제거
        
        System.out.print("시작일? ");
        teams[0].startDate = scanner.nextLine();
        
        System.out.print("종료일? ");
        teams[0].endDate = scanner.nextLine();
        
        System.out.println("---------------");

        System.out.printf("%s, %d명, %s ~ %s\n",
            teams[0].name, teams[0].maxQty, teams[0].startDate, teams[0].endDate);
    }
}