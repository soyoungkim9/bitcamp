<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP 전용 태그: ㄹ</h1>
<pre>
jsp:include
  RequestDispatcher의 include()와 같다.
</pre>

<%--
error 라는 파라미터가 있을 때 다른 JSP 페이지로 포워딩시켜 보 자!
 --%>
<%if (request.getParameter("error") != null) {%>
	<jsp:forward page="exam02_error.jsp"></jsp:forward>
<%} %>
<jsp:include page="exam01_header.jsp"></jsp:include>
<p>내용....</p>
<jsp:include page="exam01_footer.jsp"></jsp:include>
</body>
</html>