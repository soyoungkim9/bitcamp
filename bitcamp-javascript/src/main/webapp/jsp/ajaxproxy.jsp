<%@ page language="java"
 	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	trimDirectiveWhitespaces="true"%>
<%--JSTL 태그를 사용하여 다른 서버에 HTTP 요청을 할 것이다. --%>
<%--JSTL 라이브러리를 가져온다.
	만약 프로젝트에 JSTL 라이브러리를 추가하지 않았다면
	build.gradle에 추가하라!
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- 

 --%>
<c:import url="http://m.zdnet.co.kr/news_view.asp?article_id=20180622064949"/>
