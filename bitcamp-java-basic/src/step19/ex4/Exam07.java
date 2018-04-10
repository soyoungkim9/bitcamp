// IoC 컨테이너 만들기 - 3) .class 파일만 추출하기. 중첩클래스 제외.
package step19.ex4;

import java.io.File;
import java.util.List;

// => FileFilter를 사용하여 .class 파일만 추출한다. 
public class Exam07 {

    public static void main(String[] args) throws Exception {
        ApplicationContext5 appContext = new ApplicationContext5("step19.ex1");
        List<String> classnames = appContext.getFiles();
        for (String name : classnames) {
            System.out.println(name);
        }
    }
    
    

}





