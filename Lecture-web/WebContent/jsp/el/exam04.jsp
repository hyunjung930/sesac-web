<%@page import="kr.co.mlec.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO b = new BoardVO();
	b.setNo(10);
	b.setTitle("제목입니다");
	
	// pageContext영역에 객체 등록
	// 이름 : board 값: 생성된 BoardVo객체
	pageContext.setAttribute("board", b);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	no : <%= b.getNo() %><br>
	no : <%=((BoardVO)pageContext.getAttribute("board")).getNo() %><br>
	title : <%=b.getTitle() %><br>
	<hr>
	el no :${ board.no }<br>
	el title :${ board.title }<br>
	el title :${ board['title'] }<br><!-- 이렇게도 사용 가능하지만 왠만하면 .으로 사용 -->
	
</body>
</html>