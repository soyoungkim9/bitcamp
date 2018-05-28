<%@page import="bitcamp.java106.pms.domain.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>작업 목록</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1><a href='../team/view?name=<%=
request.getParameter("teamName")%>'><%=
request.getParameter("teamName")%></a>의 작업 목록(MVC + JSP 전용 태그)</h1>
<p><a href='add?teamName=<%=request.getParameter("teamName")%>'>새작업</a></p>
<table border='1'>
<tr>
    <th>번호</th><th>작업명</th><th>기간</th><th>작업자</th>
</tr>
<jsp:useBean id="list"
            type="java.util.List<Task>"
            class="java.util.ArrayList"
            scope="request"/>
<%
for (Task task : list) {
    pageContext.setAttribute("task", task);
%>
<tr>
    <td>${task.no}</td>    
    <td><a href='view?no=${task.no}'>${task.title}</a></td>    
    <td>${task.startDate} ~ ${task.endDate}</td>    
    <td>${task.worker == null ? "" : task.worker.id}</td>
</tr>
<%}%>
</table>
</body>
</html>


    