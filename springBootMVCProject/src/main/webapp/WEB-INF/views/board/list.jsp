<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<style type="text/css">
h1 {
	text-align: center;
	font-family:
}

</style>
</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}"/>
	<h1>게시 목록입니다</h1>
	<br>
	<a href="insert">
	신규등록
		<img alt="강아지 등록 이미지 입니다." src="${path}/images/imge.jpg">
	</a>
	<br>
	<br>
	<br>
	<table class="table table-striped table-bordered table-hover">
		<tr>
			<th>순서</th>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>생성일</th>
			<th>수정일</th>
		</tr>
		<c:forEach items="${blist.result.content}" var="board"
			varStatus="bstatus">
			<tr>
				<td>${bstatus.count}</td>
				<td><a href="detail?bno=${board.bno}">${board.bno}</a> <span
					class="badge">${board.replies.size()}</span></td>
				<td>${board.title}</td>
				<td>${board.content}</td>
				<td>${board.writer}</td>
				<td>${board.regdate}</td>
				<td>${board.updatedate}</td>
				<td><button class="delButton" data-bno="${board.bno}">삭제</button></td>
			</tr>
		</c:forEach>
	</table>
	<!-- paging -->
	<nav>
		<div>
			<ul class="pagination">
				<c:if test="${blist.prevPage}">
					<li class="page-item">
						<a href="${blist.prevPage.pageNumber+1}">PREV${blist.prevPage.pageNumber+1}</a>
					</li>
				</c:if>
				<c:forEach items="${blist.pageList}" var="p">
					<li class="page-item" class="${p.pageNumber==blist.currentPageNum-1}?active:''">
						<a href="${p.pageNumber}">${p.pageNumber+1}</a>
					</li>
				</c:forEach>
				<c:if test="${blist.nextPage}">
					<li class="page-item">
					<a href="${blist.nextPage.pageNumber+1}">NEXT${blist.nextPage.pageNumber+1}</a>
					</li>
				</c:if>
			</ul>
		</div>
	</nav>

	<form id="f1" action="list" method="get">
	    <input type="text" name="page" value="${blist.currentPageNum}">
	    <input type="text" name="size" value="${blist.currentPage.pageSize}">
    </form>
		


	<script type="text/javascript">
		$(function() {
			$(".delButton").click(function() {
				location.href = "delete?bno=" + $(this).attr("data-bno");
			});
			
		$(".pagination a").click(function(e){
	    //	alert($(this).attr('href'));
	    	e.preventDefault();		//preventDefault : 본래 기능 취소한다.

	    	$("#f1").find("[name='page']").val($(this).attr('href'));
	    	$("#f1").submit();
	    	});
				
		});
	</script>
</body>
</html>