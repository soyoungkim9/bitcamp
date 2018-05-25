<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="exam09_error.jsp"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam08</title>
</head>
<body>
<h1>지시문(directive element): taglib</h1>
<pre>
JSP엔진이 JSP 파일을 가지고 서블릿 클래스를 만들 떄
 반드시 다음의 객체들을 지정된 일므으로 사용할 수 있도록 정의해야 한다.
  HttpServletRequest  => request
  HttpServletResponse => response
  JSPWriter			  => out
  HttpSession		  => session
  Servletcontext	  => application
  PageContext		  => pageContext
  ServletConfig       => config
     서블릿 객체 그 자신	 	  => page
  Throwable			  => exception
     
     
오류 객체?
- 다른 서블릿에서 오류가 발생했을 때 그 오류를 처리하는 JSP는
     오류정보를 담은 객체를 받는다.
- 바로 그 객체의 변수명이 error이다.

errorPage 속성
- 오류가 발생했을 떄 포워딩할 JSP 페이지를 가리킨다.
- 예) errorPage="exam09_error.jsp"
</pre>

<%
// 이 페이지에서 일부로 예외를 발생시켜 보자!
// => error라는 파라미터가 있다면 예외를 발생시켜 exam09_error.jsp를
//    실행하게 한다.
if (request.getParameter("error") != null) {
    throw new Exception("오호라~~ 예외가 발생했어요!");
}
%>
</body>
</html>







