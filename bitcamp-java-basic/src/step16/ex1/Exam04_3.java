// 특정 폴더를 생성하여 그 폴더에 파일을 만든다.
package step16.ex1;

import java.io.File;

public class Exam04_3 {
    public static void main(String[] args) throws Exception {
        // 생성할 파일의 경로 설정
        File file = new File("temp2/a/test.txt");
        
        File dir = file.getParentFile();
        
        if(dir.mkdirs()) {
            System.out.println("team/a 디렉토리를 생성하였습니다.");
        } else {
            System.out.println("team/a 디렉토리를 생성할 수 없습니다.");
        }
        
        if(file.createNewFile()) { // 파일 삭제
            System.out.println("test.txt 파일을 생성하였습니다.");
        } else {
            // 존재하지 않는 파일은 삭제할 수 없다.
            // 경로가 존재하지 않으면 당연히 그 경로에 파일이 없으니까 파일이 없으니까 삭제할 수 없다.
            System.out.println("test.txt 파일을 생성할 수 없습니다.");
        }
    }
}
