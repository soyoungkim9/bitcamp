package bitcamp.java106.pms2a1;

import bitcamp.java106.pms2.domain.Team;
import bitcamp.java106.pms2.domain.Member;
import java.util.Scanner;

// ver0.1 - : 명령입력프롬프트
public class App01 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamIndex = 0;

        Member[] members = new Member[1000];
        int memberIndex = 0;
        
        while(true) {
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null; // 문자열(주소) 없음!
            if(arr.length == 2) {
                option = arr[1];
            }

            if(menu.equals("quit")) {
                System.out.println("안녕히가세요.");
                break;
            } else if(menu.equals("help")) {
                System.out.println("[도움말]");
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
            } else if(menu.equals("team/add")) {
                System.out.println("[team정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();
                
                System.out.print("설명? ");
                team.description = keyScan.nextLine();
                
                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                
                keyScan.nextLine(); // 개행문자 \r\n 제거
                
                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();
                
                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team;
            } else if(menu.equals("team/list")) {
                System.out.println("[team 목록]");
                for(int i = 0; i < teamIndex; i++) {
                    System.out.printf("%s, %d, %s ~ %s\n",
                    teams[i].name,
                    teams[i].maxQty,
                    teams[i].startDate,
                    teams[i].endDate);
                }
            } else if(menu.equals("team/view")) {
                System.out.println("[team 정보 조회]");
                
                if(option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }

                Team team = null;
                for(int i = 0; i < teamIndex; i++) {
                    if(option.equals(teams[i].name.toLowerCase())) {
                        team = teams[i];
                        break;
                    }
                }

                if (team == null) {
                    System.out.println("해당 이름의 팀이 없습니다.");
                } else {
                        System.out.printf("팀명: %s\n", team.name);
                        System.out.printf("설명: %s\n", team.description);
                        System.out.printf("최대인원: %d\n", team.maxQty);
                        System.out.printf("기간: %s ~ %s\n", 
                            team.startDate, team.endDate);
                }
                
                System.out.println(option);
            } else if(menu.equals("member/add")) {
                System.out.println("[member정보 입력]");
                Member member = new Member();

                System.out.print("아이디? ");
                member.id = keyScan.nextLine();
                
                System.out.print("이메일? ");
                member.email = keyScan.nextLine();
                
                System.out.print("최대인원? ");
                member.pwd = keyScan.nextLine();

                members[memberIndex++] = member;
            } else if(menu.equals("member/list")) {
                System.out.println("[member 목록]");
                for(int i = 0; i < memberIndex; i++) {
                    System.out.printf("%s, %s, %s\n",
                    members[i].id,
                    members[i].email,
                    members[i].pwd);
                }
            }
            System.out.println();
        }
    }
}