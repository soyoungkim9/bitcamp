<%@ page 
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP로 목록 페이지 만들기</title>
</head>
<body>
<table border = "1">
<h1>Exam09_1의 실행 결과</h1>

<thead>
	<tr><th>번호</th><th>제목</th><th>작성자</th><th>등록일</th></tr>
</thead>
<tbody>

<c:forEach items="${boards}" var="board">
	<tr>
		<td>${board.no}</td>
		<td>${board.title}</td>
		<td>${board.user.id}</td>
		<td>${board.createdDate}</td>
	</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
