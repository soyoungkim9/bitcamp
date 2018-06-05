// 요청 핸들러의 리턴 값 - 콘텐트를 직접 리턴하기 
package bitcamp.mvc.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/exam06_2")
public class Exam06_2 {
    
    // request handler에서 콘텐트를 직접 리턴할 때는
    // HttpEntity에 담아서 리턴할 수 있다.
    @GetMapping(value="m1")
    public HttpEntity<String> m1(
            ServletRequest request,
            ServletResponse response) {
        // 마찬가지로 응답 콘텐트의 기본 타입은
        // "text/html;charset=ISO-8859-1" 이다.
        HttpEntity<String> entitty = new HttpEntity<>("Exam06_1.m1() ==> 012ABCabc#!@가각간");
        return entitty;
    }

    @GetMapping(value="m2")
    public HttpEntity<String> m2() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        HttpEntity<String> entitty = new HttpEntity<>(
                "Exam06_2.m2() ==> 012ABCabc#!@가각간",
                headers);
        return entitty;
    }

    @GetMapping(value="m3")
    public HttpEntity<String> m3() {
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        // ResponseEntity는 HttpEntity의 하위 클래스이다.
        // 응답할 때 상태코드를 설정할 수 있다.
        ResponseEntity<String> entitty = new ResponseEntity<>(
                "Exam06_2.m3() ==> 012ABCabc#!@가각간",
                headers,
                HttpStatus.OK);
        return entitty;
    }
}
