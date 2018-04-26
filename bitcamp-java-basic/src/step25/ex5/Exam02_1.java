// Mybatis - 클래스 별명 지정하기
package step25.ex5;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex5/mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = factory.openSession();
        
        List<Board> list =
                sqlSession.selectList("BoardMapper.selectBoard");
        
        for(Board board : list) {
                System.out.printf("%d, %s, %s, %s\n",
                board.getNo(),
                board.getTitle(),
                board.getContent(),
                board.getRegisteredDate());
        }
                
        
    }
}
