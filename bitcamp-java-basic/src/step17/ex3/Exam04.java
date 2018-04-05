// non-static nested class == inner class
package step17.ex3;

import step17.ex3.ArrayList.MyIterator;

public class Exam04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        // ArrayList가 보유한 inner 클래스의 객체를 얻는다.
        MyIterator iterator = list.iterator();
        
        // MyIterator를 통해 list에 저장된 값을 꺼내보자!
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    
    }
}
