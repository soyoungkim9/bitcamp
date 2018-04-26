// Mybatis - 자바 객체의 프로퍼티 이름과 컬럼명을 일치시키기
package step25.ex6;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam01_3 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex6/mybatis-config03.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        
        // SqlSession 공장 객체로부터 SqlSession 객체를 얻는다.
        SqlSession sqlSession = factory.openSession();
        
        // SqlSession 객체를 이용하여 SQL 맵퍼 파일에 작성한 SQL문을 실행한다.
        List<Board> list =
                sqlSession.selectList("BoardMapper.selectBoard");
        
        for(Board board : list) {
                System.out.printf("%d, %s, %s, %s\n",
                board.getNo(),
                board.getTitle(),
                board.getContent(),
                board.getRegisteredDate());
        }
        
        sqlSession.close();
                
        
    }
}
