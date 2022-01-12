<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		exm 03. jsp?type=s     or exam03.jsp?type=U	
	 --%>
	 <c:if test ="${ empty param.type}">
		 type파라미터가 전송되지 않았스니다.
	 </c:if>
	
	 <c:if test ="${ param.type == 'S'}">
		 환영합니다 관리자님
	 </c:if>
	 
	 <c:if test="${ patam.type eq 'U' }">
	 	일반 사용자님 환영합니다.
	 </c:if>
</body>
</html>