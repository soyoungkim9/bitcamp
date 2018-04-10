// 파일 생성
package step16.ex1;

import java.io.File;

public class Exam04_1 {
    public static void main(String[] args) throws Exception {
        // 생성할 파일의 경로 설정
        File file = new File("temp2/a/test.txt");
        if(file.createNewFile()) { // 디렉토리 생성
            System.out.println("test.txt 파일을 생성하였습니다.");
        } else {
            // 이미 팡리이 있다면 다시 생성할 수 없다.
            // 해당 경로에 디렉토리가 없다면 팡리을 생성할 수 없다.
            System.out.println("test.txt 파일을 생성할 수 없습니다.");
        }
    }
}