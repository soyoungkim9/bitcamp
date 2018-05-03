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
        System.out.println(value);
        if (value != null) {
            country = value;
        }
        
        label = new Properties();
        label.load(new FileReader(
                String.format("%s-%s.properties", filename, country)));
    }
    
    public static void main(String[] args) throws Exception {
        init();
        System.out.println("안녕하세요!");
    }

}
