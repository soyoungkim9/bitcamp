<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>구동원리</h1>
<pre>
클라이언트가  exam01.jsp 요청
  ===>[JSP 엔진]
   ===> .java 소스 생성 : 배치폴더(ex: tmp0)/work/...
	===> [java 컴파일러]
	  ===> .class 파일 생성	: 배치폴더(ex: tmp0)/work/....
	    ===> service()를 호출하여 서블릿 실행!


</pre>
</body>
</html>