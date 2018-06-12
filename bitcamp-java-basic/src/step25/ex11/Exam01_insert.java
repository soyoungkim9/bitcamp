// mybatis + spring IoC - 트랜잭션 정책  
package step25.ex11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("step25/ex11/application-context.xml");
        
        // 트랜잭션 적용
        // 1) @Transactional 애노테이션을 처리할 객체를 등록한다.
        //    => application-context.xml
        // 2) 트랜잭션을 적용할 대상 메서드에 애노테이션을 붙인다.
        //    => BoardService의 메서드에 @Transactional 애노테이션 붙인다.
        BoardService boardService = iocContainer.getBean(BoardService.class);
        
        Board b1 = new Board().setNo(191).setTitle("11111").setContent("xxxx");
        Board b2 = new Board().setNo(192).setTitle("11111").setContent("xxxx");
        Board b3 = new Board().setNo(193).setTitle("11111").setContent("xxxx");
        Board b4 = new Board().setNo(191).setTitle("11111").setContent("xxxx");
        Board b5 = new Board().setNo(195).setTitle("11111").setContent("xxxx");
        
        boardService.test1(b1, b2, b3, b4, b5);
    }
}