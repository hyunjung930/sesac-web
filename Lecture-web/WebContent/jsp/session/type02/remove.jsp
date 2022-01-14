<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	
	session.invalidate();		//invalidate 세션 영역의 등록된 객체를 모두 지울 수 있음
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--<c:remove var ="member" scope="session" />--%>

	<h2>세션 삭제 완료</h2>
	<a href ="get.jsp">삭제된 세션정보 보기</a>
	
</body>
</html>