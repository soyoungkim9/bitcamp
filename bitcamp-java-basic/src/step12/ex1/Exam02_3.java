// java.util.ArrayList와 비교 : contains()의 동작원리 확인
package step12.ex1;

import java.util.ArrayList;

// hashcode와 equals를 오버라이딩 하지 않았다.
class Member {
    String name;
    int age;
    
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("[%s,%d]", this.name, this.age);
    }
}

public class Exam02_3 {
    public static void main(String[] args) {
        Member s1 = new Member("홍길동", 20);
        Member s2 = new Member("임꺽정", 30);
        Member s3 = new Member("유관순", 16);
        Member s4 = new Member("임꺽정", 30);
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        System.out.println(list.contains(s4));
        
    }
    static void print(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
