// Mybatis - SQL에 파라미터로 일반 객체 전달하기
package step25.ex6;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam02_3 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex6/mybatis-config06.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        
        // SqlSession 공장 객체로부터 SqlSession 객체를 얻는다.
        SqlSession sqlSession = factory.openSession();
        // Board 객체 값을 저장하여 전달하기
        // => 단 값을 꺼낼 수 있도록 겟터(프로퍼티)가 있어야 한다.
        Board board = new Board();
        board.setTitle("제목이래요!");
        board.setContent("내용이래요!");
        
        
        
        int count = sqlSession.insert("BoardMapper.insertBoard", board);
        
        System.out.println(count);
        
        // mybatis에서는 기본으로 autocomit이 false이다.
        // autocommit?
        // => insert/update/delete 과 같이 데이터를 변경하는 작업은
        //    위험하기 때문에 DBMS의 임시 메모리에 그 작업 결과를 보관한다.
        // => 클라이언트에서 최종적으로 변경을 허락해야만 진짜 테이블에 값을 반영한다.
        //
        // mybatis에서는 다음 메서드를 호출하여 DBMS에게 작업 결과를
        // 진짜 테이블에 반영하라고 명령해야 한다.
        sqlSession.commit();
        // commit 명령을 내리지 않으면 insert/update/delete을 테이블에 반영하지 않는다.
        // close()하면 취소된다.
        
        
        // commit : 임시 메모리에 저장된 작업 결과를 실제 테이블에 반영시키는 명령
        // rollback : 임시 메모리에 지정된 작업 결과를 취소하는 명령
        sqlSession.close();
                
        
    }
}
