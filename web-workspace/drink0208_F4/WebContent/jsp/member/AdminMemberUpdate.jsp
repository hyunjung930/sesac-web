
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자모드 | 회원관리</title>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800'
	rel='stylesheet' type='text/css'>
<script type="text/javascript">
	function deleteMember(id) {
	
		var answer=confirm("선택한 회원을 삭제하시겠습니까?");
		if(answer){
			var url = 'deleteMember.do?id=' + id.value;
			location.href = "${pageContext.request.contextPath }/AdminDeleteMember.do"
		}
		
	}
</script>
</head>
<body>
	<header>
		<jsp:include page="/jsp/include/topMenu.jsp" />
	</header>

       <!-- Body content -->
        <div class="page-head"> 
            <div class="container">
                <div class="row">
                    <div class="page-head-content">
                        <h1 class="page-title">관리자모드 회원 관리</h1>               
                    </div>
                </div>
            </div>
        </div>
        <!-- End page header -->


	<c:if test="${ userVO.type == 'S'}">
		<div class="page-head-content" align="center">
			<h1 class="page-title">회원 목록</h1>
			<hr>
			<br>
				<div align="center" class="row">
		<c:forEach items="${ memberlist }" var="memberlist">
			<div class="box-two proerty-item">
				<strong>${ memberlist }</strong><br>
			</div>
		</c:forEach>
	</div>
	<hr>
			<button onclick="deleteMember(id)">회원 삭제</button>
		</div>
	</c:if>




	<br>
	<jsp:include page="/jsp/member/AdminMemberPaging.jsp">
		<jsp:param value="${paging.page}" name="page" />
		<jsp:param value="${paging.beginPage}" name="beginPage" />
		<jsp:param value="${paging.endPage}" name="endPage" />
		<jsp:param value="${paging.prev}" name="prev" />
		<jsp:param value="${paging.next}" name="next" />
	</jsp:include>
	<br>



	<footer>
		<%@ include file="/jsp/include/footer.jsp"%>
	</footer>
</body>
</html>

