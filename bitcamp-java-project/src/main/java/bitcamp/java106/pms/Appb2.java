package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// 3단계 : 반복문 적용
public class Appb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 팀 정보를 받을 메모리 준비
        Team[] teams = new Team[100];
        
        for(int i = 0; i < 3; i++) {
            teams[i] = new Team();

            System.out.print("팀명? ");
            teams[i].name = scanner.nextLine();
            
            System.out.print("설명? ");
            teams[i].description = scanner.nextLine();
            
            System.out.print("최대인원? ");
            teams[i].maxQty = scanner.nextInt();
            
            scanner.nextLine(); // 개행문자 \r\n 제거
            
            System.out.print("시작일? ");
            teams[i].startDate = scanner.nextLine();
            
            System.out.print("종료일? ");
            teams[i].endDate = scanner.nextLine();
        }

        System.out.println("---------------");

        for(int i = 0; i < 3; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n",
                teams[i].name, teams[i].maxQty, 
                teams[i].startDate, teams[i].endDate);
        }
    }
}