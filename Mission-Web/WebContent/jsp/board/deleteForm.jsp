<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int boardNo = Integer.parseInt(request.getParameter("no"));

BoardDAO dao = new BoardDAO();
BoardVO board = dao.deleteBoard(boardNo);

pageContext.setAttribute("board",board);

%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	 
</script>
</head>
<body>
	
</body>
</html>