// java.util.arrayList와 비교
package step12.ex1;

import java.util.ArrayList;

public class Exam01_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        
        print(list);
        
        list.remove(2);
        
        print(list);
        
        list.remove(0);
        
        print(list);
        
        // 유효한 인덱스가 아니면 예욉 ㅏㄹ생시킨다!
        // list.remove(4); // 실행오류!
        
        print(list);
        
        list.add(1, "xxx");
        list.add(1, "yyy");
        list.add(0, "zzz");
        list.add(5, "ttt");
        
        print(list);
        list.set(1, "aaa");
        print(list);
        
        list.add("ccc");
        list.add("eee"); // zzz, aaa, yyy, xxx, ddd, ccc, eee
        
        print(list);
    }
    
    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
