<%@page import="java.util.ArrayList"%>
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

Member obj2 = new Member();
obj2.setId("임꺽정");
obj2.setEmail("leem@test.com");
obj2.setPassword("2222");

ArrayList<Member> arr = new ArrayList<>();
arr.add(obj);
arr.add(obj2);

pageContext.setAttribute("list", arr);
%>

<h2>PageContext 저장소에서 값 꺼내기</h2>
<jsp:useBean id="member" type="" class="jsp.Member"></jsp:useBean>

<h2>ServletRequest 저장소에서 값 꺼내기</h2>
<jsp:useBean id="member2" class="jsp.Member" scope="request"></jsp:useBean>

아이디: <%=member2.getId()%><br>
이메일: <%=member2.getEmail()%><br>
암호: <%=member2.getPassword()%><br>

</body>
</html>







