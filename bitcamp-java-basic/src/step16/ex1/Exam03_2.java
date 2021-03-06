// 디렉토리 생성
package step16.ex1;

import java.io.File;

public class Exam03_2 {
    public static void main(String[] args) {
        // 생성할 디렉토리 경로 설정
        File dir = new File("temp2/a");
        dir.mkdir(); 
        
        // 해당 경로의 디렉토리가 존재하지 않을 때는
        // 하위 경로에 디렉토리(a)를 새로 만들 수 없다.
        if(dir.mkdir()) { // 디렉토리 생성
            System.out.println("temp2/a 디렉토리를 생성하였습니다.");
        } else {
            System.out.println("temp2/a 디렉토리를 생성할 수 없습니다.");
        }
        
        // mkdirf()
        // - 지정된 경로에 디렉토리가 존재하지 않으면 그 디렉토리도 만든다.
        
        if(dir.mkdirs()) { // 디렉토리 생성
            System.out.println("temp2/a 디렉토리를 생성하였습니다.");
        } else {
            System.out.println("temp2/a 디렉토리를 생성할 수 없습니다.");
        }
    }
}
