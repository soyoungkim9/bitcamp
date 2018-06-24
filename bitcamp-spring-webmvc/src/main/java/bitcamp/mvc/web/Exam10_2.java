// 인터셉터 - 페이지 컨트롤러를 실행하기 전후에 개입하기. 필터와 같은 역할을 한다.
package bitcamp.mvc.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import bitcamp.mvc.dao.BoardDao;
import bitcamp.mvc.vo.Board;

@Controller 
@RequestMapping("/exam10_2") 
public class Exam10_2 {
    
    BoardDao boardDao;
    
    public Exam10_2(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    // 인터셉터가 주입되지 않았다.
    @GetMapping(value="list", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String list() {
        List<Board> boards = boardDao.selectList();
        
        // JSP로 보내서 DAO가 리턴한 게시물 목록을 가지고 HTML을 만들게 한다.
        String json = new Gson().toJson(boards);
        // 그렇게 만든 HTML은 웹브라우저로 보내져서 출력될 것이다.
        return json; 
    }
}