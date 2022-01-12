<%@page import="kr.co.mlec.util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="kr.co.mlec.util.connectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<%--
	http://localhost:9999/Mission-Web/jsp/board/detail.jsp?no=3

	작업순서
	1. 요청 URL의 파라미터 분석 => 게시글 번호 추출?
	2. DB tbl_board에서 추출된 게시글번호의 게시물 조회
	3. HTML에 조회된 게시물을 연결 화면 구성
	
 --%>
 <%
 	//1. 
 	int boardNo = Integer.parseInt(request.getParameter("no"));
 		
 	//2.
 	Connection conn = new connectionFactory().getConnection();
 	StringBuilder sql = new StringBuilder();
 	sql.append("select no,title,writer, content, view_cnt ");
 	sql.append(" 	, to_char(reg_date, 'yyyy-mm-dd') reg_Date ");
 	sql.append("   from tbl_board ");
 	sql.append(" where no =?");
 	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
 	pstmt.setInt(1, boardNo);
 	ResultSet rs = pstmt.executeQuery();
 	
 	rs.next();
 	
 	
 %>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세 페이지</title>
<style type="text/css">
	hr, table {
		width: 80%
	}
</style>
<script type="text/javascript">
	function doAction(type) {
			
		switch(type){
		case 'U':
			break
		case 'D':
			break
		case 'L':
			location.href ="list.jsp"
			break
			
		
		}
		
	}
</script>
</head>
<body>
	<div align = "center">
		<hr>
			<h2>게시판 상세 </h2>
		<hr>
		<br>
		<table border ='1'>
			<tr>
				<th width="25%">번호</th>
				<td><%= rs.getInt("no") %></td>
			</tr>
			<tr>
				<th width="25%">제목</th>
				<td><%= rs.getString("title") %></td>
			</tr>
			<tr>
				<th width="25%">작성자</th>
				<td><%= rs.getString("writer") %></td>
			</tr>
				<tr>
				<th width="25%">내용</th>
				<td><%= rs.getString("content") %></td>
			</tr>
			<tr>
				<th width="25%">조회수</th>
				<td><%= rs.getInt("view_cnt") %></td>
			</tr>
			<tr>
				<th width="25%">등록일</th>
				<td><%= rs.getString("reg_date") %></td>
			</tr>
		</table>
		<br>
		<button onclick ="doAction('U')">수정</button>
		<button onclick ="doAction('D')">삭제</button>
		<button onclick ="doAction('L')">목록</button>
		
	</div>
</body>
</html>
<%
	JDBCClose.close(pstmt,conn);
%>