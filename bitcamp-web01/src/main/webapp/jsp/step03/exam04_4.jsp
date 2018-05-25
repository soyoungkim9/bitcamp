<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_3</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + without 객체 속성</h1>
<pre>
저장소에서 값을 꺼낸다.
</pre>

<%
Member obj = new Member();
obj.setId("홍길동");
obj.setEmail("hong@test.com");
obj.setPassword("1111");
//pageContext.setAttribute("member", obj);
request.setAttribute("member2", obj);
%>

<h2>PageContext 저장소에서 값 꺼내기</h2>
<jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
<%-- 자바 코드: 
jsp.Member member = (jsp.Member)pageContext.getAttribute("member");
if (member == null) {
    member = new jsp.Member();
    pageContext.setAttribute("member", member);
}
--%>

<h2>ServletRequest 저장소에서 값 꺼내기</h2>
<jsp:useBean id="member2" class="jsp.Member" scope="request"></jsp:useBean>
<%-- 자바 코드: 
jsp.Member member2 = (jsp.Member)request.getAttribute("member2");
if (member == null) {
    member2 = new jsp.Member();
    request.setAttribute("member2", member2);
}
--%>
아이디: <%=member2.getId()%><br>
이메일: <%=member2.getEmail()%><br>
암호: <%=member2.getPassword()%><br>

</body>
</html>







