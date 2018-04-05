// 디렉토리에 들어 있는 파일이나 하위 디렉토리 정보 알아내기
package step16.ex1;

import java.io.File;

public class Exam05_2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("."); // 현재 폴더는 프로젝트 폴더이다.
        
        // => 파일이나 디렉토리 이름을 알아내기
        File[] files = dir.listFiles();
        
        for(File file : files) {
            System.out.printf("%s %12d, %s\n", 
                    file.isDirectory() ? "d" : "-", 
                    file.length(),
                    file.getName());
        }
    
    }
}
