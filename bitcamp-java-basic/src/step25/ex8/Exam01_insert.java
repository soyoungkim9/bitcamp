// mybatis + spring IoC - 스프링 적용 전
package step25.ex8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext("step25/ex8/application-context.xml");
        
        // 트랜잭션 관리자를 도입하지 않으면,
        // DAO의 각 메서드 호출은 독립작업으로 간주한다.
        // 즉 DAO 메서드를 호출할 때마다
        // DataSource로부터 별도의 DB 커넥션을 받아서 사용한다.
        // 따라서 DAO 메서드를 호출하다가 오류가 발생하더라도,
        // 그 전에 호출한 메서드의 작업은 그대로 DB
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        Board board = new Board();
        board.setNo(141);
        board.setTitle("11111");
        board.setContent("xxxx");
        boardDao.insert(board);
        System.out.printf("%d번 게시물 입력!", board.getNo());
        
        board.setNo(142);
        board.setTitle("22222");
        boardDao.insert(board);
        System.out.printf("%d번 게시물 입력!", board.getNo());
        
        board.setNo(141);
        board.setTitle("33333");
        boardDao.insert(board);
        System.out.printf("%d번 게시물 입력!", board.getNo());
    }
}