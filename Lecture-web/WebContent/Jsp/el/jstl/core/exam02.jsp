<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:set var = "msg" value ="hello"/> --%>
	<c:out value ="내이름은 <mark>홍길동</mark>입니다"/><br>
	<c:out value ="내이름은 <mark>홍길동</mark>입니다" escapeXml = "false"/><br>
	msg: <c:out value = "${ msg }" default ="msg 변수 미설정"/>
</body>
</html>