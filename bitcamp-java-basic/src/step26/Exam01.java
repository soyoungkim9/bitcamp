// Internationalization(i18n) 구현
package step26;

import java.io.FileReader;
import java.util.Properties;

public class Exam01 {
    static String filename = "message";
    static String country= "enUS";
    static Properties label;
     
    static void init() throws Exception {
        String value = System.getProperty("country");
        if (value != null) {
            country = value;
        }
        
        label = new Properties();
        label.load(new FileReader(
                String.format("%s-%s.properties", filename, country)));
    }
    
    public static void main(String[] args) throws Exception {
        init();
        // 다음과 같이 화면에 텍스트를 출력할 때 직접 입력한 값으 출력하는 것이 아니라
        // 프로퍼티 파일에서 읽은 값을 출력한다.
        // 이렇게 한 이유는 다양한 언어로 출력하기 위함이다.
        // 즉 다국어를 제공할 수 있도록 개발된 프로그램을
        // "국제화(i18n;Internationalization)"라고 얘기한다.
        System.out.println(label.get("welcome"));
    }

}
