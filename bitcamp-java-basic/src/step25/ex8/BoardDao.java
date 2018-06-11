// 데이터를 처리하는 코드를 별도의 클래스로 캡슐화시킨다.
// 게시물 관리 - Dao 적용
// => Data 영속성(지속성)을 관리하는 클래스를  DAO(Data Access Obejct)라 부른다.
// => data 영속성(지속성(
//    - 데이터를 저장하고 유지하는 것.
//    - "데이터 퍼시스턴스(persistence)"라 부른다.
package step25.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public int delete(int no) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(
                java.sql.Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                        "java106", "1111");
                
                PreparedStatement stmt = con.prepareStatement(
                        "delete from ex_board where bno=?")
           ) {
            stmt.setInt(1, no);
            return stmt.executeUpdate();
        }
    }
    
    public List<Board> list() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                    "java106", "1111");
            // 당장 select 할 때 파라미터 값을 넣지 않는다 하더라도,
            // 나중에 넣을 것을 대비해서 그냥 PreparedStatement를 사용하라!
            PreparedStatement stmt = con.prepareStatement(
                    "select bno,titl,cdt from ex_board");
            ResultSet rs = stmt.executeQuery()
        ) {

            ArrayList<Board> arr = new ArrayList<>();
            while (rs.next()) {
                Board board = new Board();
                board.setNo(rs.getInt("bno"));
                board.setTitle(rs.getString("titl"));
                board.setRegisteredDate(rs.getDate("cdt"));
                arr.add(board);
            }
            return arr;
        }
    }

    public int insert(Board board) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                    "java106", "1111");
            
            // 값이 들어갈 자리에 in-parameter(?)를 지정한다.
            // => 데이터 타입에 상관없이 ?를 넣는다.
            PreparedStatement stmt = con.prepareStatement(
                "insert into ex_board(titl,cont,cdt) values(?,?,now())");
        ) {
            // in-parameter에 값을 설정한다.
            // => 설정하는 순서는 상관없다. 하지만 유지보수를 위해 순서대로 나열하라!
            stmt.setString(1, board.getTitle());
            stmt.setString(2, board.getContent());
            
            // 실행할 때는 SQL문을 파라미터로 넘길 필요가 없다.
            return stmt.executeUpdate();
        }
    }

    public int update(Board board) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                    "java106", "1111");
            
            PreparedStatement stmt = con.prepareStatement(
                "update ex_board set titl=?, cont=?, cdt=now() where bno=?");
        ) {
            stmt.setString(1, board.getTitle());
            stmt.setString(2, board.getContent());
            stmt.setInt(3, board.getNo());
            return stmt.executeUpdate();
        }
    }

    public Board view(String no) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            java.sql.Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                    "java106", "1111");
    
            PreparedStatement stmt = con.prepareStatement(
                "select bno,titl,cont,cdt from ex_board where bno=?")) {
            
            stmt.setString(1, no);
            
            try (ResultSet rs = stmt.executeQuery();) {
                if(!rs.next())
                    return null;
                
                Board board = new Board();
                board.setNo(rs.getInt("bno"));
                board.setTitle(rs.getString("titl"));
                board.setContent(rs.getString("cont"));
                board.setRegisteredDate(rs.getDate("cdt"));
                return board;

            }
        }
    }
    
}
