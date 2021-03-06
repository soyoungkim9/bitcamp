// java.util.HashMap - key/value 한쌍으로 묶어 꺼내기

package step12.ex6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Exam02_2 {

    public static void main(String[] args) {
        Member v1 = new Member("홍길동", 20);
        Member v2 = new Member("임꺽정", 30);
        Member v3 = new Member("유관순", 16);
        Member v4 = new Member("안중근", 20);
        Member v5 = new Member("윤봉길", 25);
        
        HashMap map = new HashMap();
        map.put("s01", v1);
        map.put("s02", v2);
        map.put("s03", v3);
        map.put("s04", v4);
        map.put("s04", v5);
        
        Set entrySet = map.entrySet(); // key/value가 한쌍으로 묶은 객체가 들어있는 집합
        
        for(Object obj : entrySet) {
            // Set 컬렉션에 들어있는 객체는 원래 Entry 객체이다.
            // Entry 객체에서 key와 값을 꺼내려면
            // 원래의 타입으로 형변환해야 한다.
            Entry entry = (Entry)obj;
            System.out.printf("%s===>%s\n", entry.getKey(), entry.getValue());
        }
        
    }
}
