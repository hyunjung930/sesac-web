<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
/*
	객체등록 : 공유 영역.setAttribute("이름, "값")
	공유영역 4가지: pageContext, request, sesstion, application

*/
	pageContext.setAttribute("msg", "page 영역에 객체등록");
	
	String msg = (String)pageContext.getAttribute("msg");
	
	request.setAttribute("msg", "request 영역에 객체등록");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	msg: <%= pageContext.getAttribute("msg") %><br>	
	msg: <%= msg %><br>	
	
	<%-- BL에서 공유영영 4가지: pagsScope, requestScope, sessionScope, applicationScope --%>
	
	msg: ${ msg }<br>
	request msg = ${ requestScope.msg }<br>
	session msg = ${ sessionScope.msg }<br>
</body>
</html>







