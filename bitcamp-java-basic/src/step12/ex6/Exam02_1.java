// java.util.HashMap - key 목록을 사용하여 Map에서 값을 꺼내기

package step12.ex6;

import java.util.HashMap;
import java.util.Iterator;

public class Exam02_1 {

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
        
        // => HashMap에서 key 목록을 꺼내기
        java.util.Set keys = map.keySet(); // key 객체들이 들어있는  집합(컬렉션)을 리턴한다.
        
        // key가 들어있는 Set에서 값을 꺼내는 방법
        // 1) Iterator 사용
        Iterator 키를꺼내주는객체 = keys.iterator();
        while(키를꺼내주는객체.hasNext()) {
            Object key = 키를꺼내주는객체.next();
            System.out.println(map.get(key)); // key를 사용하여 값을 꺼낸다.
        }
        System.out.println("------------------------");
        
        // 2) 배열을 사용
        Object[] keyArray = keys.toArray();
        for(Object key : keyArray) {
            System.out.println(map.get(key));
        }
        System.out.println("------------------------");
        // 3) 
        for(Object key : keys) {
            System.out.println(map.get(key));
        }
    }

}
