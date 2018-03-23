package step09.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("년,월,일?(예:2018 3 21) ");
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int day = keyScan.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month -1);
        c.set(Calendar.DATE, day);
        
        String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
        //int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.printf("요일: %s요일\n", week[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차: %d주차\n", c.get(Calendar.WEEK_OF_MONTH));
        System.out.printf("일차: %d요일\n", c.get(Calendar.DAY_OF_YEAR));
        
        
        
        
        
        
//        System.out.print("요일: ");
//        
//        //String sday = null;
//        /*switch(day) {
//            case 1:
//                System.out.println("일요일");
//                break;
//            case 2:
//                System.out.println("월요일");
//                break;
//            case 3:
//                System.out.println("화요일");
//                break;
//            case 4:
//                System.out.println("수요일");
//                break;
//            case 5:
//                System.out.println("목요일");
//                break;
//            case 6:
//                System.out.println("금요일");
//                break;
//            case 7:
//                System.out.println("토요일");;
//                break;
//        }*/
//        int num = c.get(7);
//        String[] week = {"일", "월", "화", "수", "목", "금", "토"};
//        System.out.println(week[num-1] + "요일");
//        System.out.print("주차: ");
//        System.out.println(c.get(4) + "주차");
//        
//        System.out.print("일차: ");
//        System.out.println(c.get(6) + "일차");
//        
//        
//        
//        System.out.printf("%d, %d, %d", year, month, day);
        

    }

}
