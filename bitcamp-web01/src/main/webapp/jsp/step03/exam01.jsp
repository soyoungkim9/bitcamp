<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP 전용 태그: include</h1>
<pre>
JSP 전용 태그
  각 태그 별로 특정 자바 코드를 생성한다.

문법
  jsp:태그명 속성="값" 속성="값"
  
jsp:include
  RequestDispatcher의 include()와 같다.
</pre>

<jsp:include page="exam01_header.jsp"></jsp:include>
<p>내용....</p>
<jsp:include page="exam01_footer.jsp"></jsp:include>
</body>
</html>