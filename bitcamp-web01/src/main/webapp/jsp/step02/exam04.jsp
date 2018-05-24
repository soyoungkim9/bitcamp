<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exam02</title>
</head>
<body>
<h1>표현식(expression element)</h1>
<pre>
[표현식(expression)]
- 결과를 리턴하는 자바 코드이다.
- 예) 변수, 계산식, 값을 리턴하는 메서드 호출 등
- 표현식이 아닌 예) 값을 리턴하지 않는 메서드 호출 등

문법
 %lt;%= 표현식 %>
자바 코드
  위의 JSP 코드는 다음과 같이 자바 출력문으로 만든다.
 out.print(표현식);
</pre>
aaa, <%=2+3%>, bbb, <%=System.currentTimeMillis()%>, ccc
<%--
out.print(/*작성할 수 잇는 자바 코드는 무엇입니까?; 넣으면 안됩니까?*/ System.currentTimeMillis(););
위의 JSP 코드는 다음의 자바 출력문으로 만든다.
out.print(여기에 넣을 수 있는 자바 코드를 <%= =>태그 안에 작성하시오.
 --%>

</body>
</html>