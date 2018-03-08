package bitcamp.java106.pms;

// 컴파일러에게 클래스의 위치 정보를 알려준다.
// => 컴파일 한 후 import 명령은 제거된다.
//    즉 .class 파일에 포함되지 않는다.
// 그러니 import 문장이 없으면 .class 파일이 켜지지 않을까 걱정 ㄴㄴ

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 팀 정보를 받을 메모리 준비
        Team team = new Team();

        System.out.print("팀명? ");
        team.name = scanner.nextLine();
        
        System.out.print("설명? ");
        team.description = scanner.nextLine();
        
        System.out.print("최대인원? ");
        team.maxQty = scanner.nextInt();
        
        scanner.nextLine(); // 개행문자 \r\n 제거
        
        System.out.print("시작일? ");
        team.startDate = scanner.nextLine();
        
        System.out.print("종료일? ");
        team.endDate = scanner.nextLine();
        
        System.out.println("---------------");

        System.out.printf("%s, %d명, %s ~ %s\n",
            team.name, team.maxQty, team.startDate, team.endDate);
    }
}