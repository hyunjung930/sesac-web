<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");

	//세션 등록
	session.setAttribute("id", id);
	session.setAttribute("password", password);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>세션 등록 완료</h2>
	<a href="get.jsp">설정된 세션정보 보기</a>
</body>
</html>