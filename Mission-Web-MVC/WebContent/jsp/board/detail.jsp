<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.board.dao.BoardDAO"%>
<%@page import="kr.co.mlec.util.JDBCClose"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="kr.co.mlec.util.connectionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<%--
	http://localhost:9999/Mission-Web/jsp/board/detail.jsp?no=3

	작업순서
	1. 요청 URL의 파라미터 분석 => 게시글 번호 추출?
	2. DB tbl_board에서 추출된 게시글번호의 게시물 조회
	3. HTML에 조회된 게시물을 연결 화면 구성
	
 --%>

<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세 페이지</title>
<link rel="stylesheet" href="/Mission-Web/css/layout.css">
<link rel="stylesheet" href="/Mission-Web/css/board.css">
<script type="text/javascript">
	function doAction(type) {

		switch (type) {
		case 'U':
			location.href = "updateForm.jsp?no=${ param.no }"
			break
		case 'D':
			break
		case 'L':
			location.href = "${pageContext.request.contextPath}/board/list.do"
			break

		}

	}
</script>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>
	<section>
		<div align="center">
			<hr>
			<h2>게시판 상세</h2>
			<hr>
			<br>
			<table border='1'>
				<tr>
					<th width="25%">번호</th>
					<td>${ board.no }</td>
				</tr>
				<tr>
					<th width="25%">제목</th>
					<td>${ board.title }</td>
				</tr>
				<tr>
					<th width="25%">작성자</th>
					<td>${ board.writer }</td>
				</tr>
				<tr>
					<th width="25%">내용</th>
					<td>${ board.content }</td>
				</tr>
				<tr>
					<th width="25%">조회수</th>
					<td>${ board.viewCnt }</td>
				</tr>
				<tr>
					<th width="25%">등록일</th>
					<td>${ board.regDate }</td>
				</tr>
				<tr>
					<th width="25%">첨부파일</th>
					<td>
						<c:forEach items="${ fileList }" var ="file">
						<a href = "${ pageContext.request.contextPath}/upload/${file.fileSaveName}">
							${ file.fileOriName }
						</a>
							(${ file.fileSize } bytes)<br>
						</c:forEach>
					</td>
				</tr>
			</table>
			<br>
			<c:if test="${ board.writer eq userVO.id }">
				<button onclick="doAction('U')">수정</button>
			</c:if>
			<c:if test ="${ board.writer eq userVO.id || userVO.type == 's'}">
				<button onclick="doAction('D')">삭제</button>
			</c:if>
			<button onclick="doAction('L')">목록</button>

		</div>
	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp"%>
	</footer>
</body>
</html>