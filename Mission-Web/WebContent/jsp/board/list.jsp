<%@page import="kr.co.mlec.util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "kr.co.mlec.util.connectionFactory" %>
<%
	/*tbl_board에서 전체게시글(번호, 제목, 작성자, 등록일) 조회 */
	Connection conn = new connectionFactory().getConnection();
	StringBuilder sql = new StringBuilder();
	sql.append("select no, title, writer, to_char(reg_date,'yyyy-mm-dd') as reg_date");
	sql.append(" from tbl_board ");
	sql.append("order by no desc ");
	
	PreparedStatement pstmt = conn.prepareStatement(sql.toString());
	ResultSet rs = pstmt.executeQuery();
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 	hr, table {
 		width: 80%
 	}

</style>
<script>
	function goWriteForm(){
		location.href = "writeForm.jsp"
	}
</script>
</head>
<body>
	<div align = "center">
		<hr width="80%">
		<h2>게시판 목록 </h2>
		<hr width="80%">
		<br>
		<table border ="1">
			<tr>
				<th width ="7%">번호</th>
				<th>제목</th>
				<th width="16%">글쓴이</th>
				<th width="20%">등록일</th>
			</tr>
			<%
			while(rs.next()){
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
			%>
				<tr>
					<td><%=no %></td>
					<td><a href ="detail.jsp?no=<%=no %>" ><%=title %></a></td>
					<td><%=writer %></td>
					<td><%=regDate %></td>
				</tr>
			<%
			}
			%>			
		</table>
		<br>
		<button onclick = "goWriteForm()">새글등록</button>
	</div>
</body>
</html>
<%
	JDBCClose.close(pstmt, conn);
%>