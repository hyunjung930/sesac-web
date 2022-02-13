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
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
}

.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;

	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;

	font-weight: normal;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
}

.tg .tg-ltmv {
	background-color:  #ffcd58;
	text-align: left;
	vertical-align: top
	
}

.tg .tg-0lax {
	text-align: left;
	vertical-align: top
}
</style>

<link rel="stylesheet" href="/Mission-Web/css/layout.css">
<link rel="stylesheet" href="/Mission-Web/css/board.css">
<script src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function doAction(type) {

		switch (type) {
		case 'R':
			location.href = "${pageContext.request.contextPath}/board/replyForm.do?no=${param.no}"
			break;
		case 'U':
			location.href = "${pageContext.request.contextPath}/board/updateForm.do?comNo=${param.no}"
			break;
		case 'D': 
			location.href = "${pageContext.request.contextPath}/board/delete.do?no=${param.no}"
			break;
		case 'L':
			location.href = "${pageContext.request.contextPath}/board/list.do"
			break;

		case 'A':
			$.ajax({ 
				url : "${pageContext.request.contextPath}/board/like.do",
				cache : false,
				data : {
					'comNo': ${param.no}
				},
													// 파라미터 전송 형태(표준 쿼리형태)로 만들어줌
				success : function(data) { // ajax통신 성공시 넘어오는 데이터 통째 이름 =data
					alert(" 좋아요♥ "); // data중 put한 것의 이름 like
			//		$("#like_result").html(data.like); // id값이 like_result인 html을 찾아서
					location.reload();									// data.like값으로 바꿔준다.
					
				},
				error : function(request, status, error) {
					alert("좋아요 실패 다시 클릭하세요!")
				}
			});
					
		}

	}

/* var httpRequest = null;

 // httpRequest 객체 생성
function getXMLHttpRequest(){
    var httpRequest = null;

    if(window.ActiveXObject){
        try{
            httpRequest = new ActiveXObject("Msxml2.XMLHTTP");    
        } catch(e) {
            try{
                httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e2) { httpRequest = null; }
        }
    }
    else if(window.XMLHttpRequest){
        httpRequest = new window.XMLHttpRequest();
    }
    return httpRequest;    
} 

 
 
// 댓글 등록
function writeCmt()
{
    var form = document.getElementById("writeMentionForm");
    
    //게시글 번호, 댓글 내용, 댓글 작성자에 대한 정보를 가져와서 변수에 담는다.

    var commentNo = form.commentNo.value
    var id = form.mentionId.value
    var content = form.mentionContent.value; //오류.. 안먹혀 .....
    
    //댓글 내용이 입력되었는지 확인하는 부분이다. 입력되지 않은 상태에서 등록을 하려 하면 경고 창을 띄운다.
    if(!content)
    {
        alert("내용을 입력하세요.");
        return false;
    }
    
     else
    {    //서버로 전달할 파라미터이다. 전달할 값은 게시글 번호, 댓글 내용, 댓글 작성자이다.
    	 /*
        var param="commentNo="+commentNo+"&mentionId="+id+"&mentionContent="+content;
      /*       
        httpRequest = getXMLHttpRequest();
        
        httpRequest.onreadystatechange = checkFunc; //XMLHttpRequest 상태 변화시 호출될 함수를 지정한다.

                         //"mentionController"
        httpRequest.open("POST", "/mentionWrite.do", true);    //전송 방식, 전송할 경로, 동기/비동기를 지정한다.
        httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded;charset="UTF-8"'); //인코딩
        httpRequest.send(param); //서버로 파라미터를 전송한다. }}*/


//댓글등록
 
	$(document).ready(
					function() {
						$('#writeMention').click(
										function() {
											//location.href = "${ pageContext.request.contextPath }/mentionWrite.do"
											$.ajax({
												'url' : "${ pageContext.request.contextPath }/mentionWrite.do",
												type: 'post',
												data : {
													commentNo : ${ board.comNo },
													mentionID: '${userVO.id}',
													mentionContent: $('#mentionContent').val()
												},
												success : function() {
													alert('성공')
													window.location.reload()
												}
											})
										})
					})
					 


/* 
function checkFunc(){
    if(httpRequest.readyState == 4){
        // 결과값을 가져온다.
        var resultText = httpRequest.responseText;
        if(resultText == 1){ 
            document.location.reload(); // 상세보기 창 새로고침
        }
    }
}  */

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
					<h1 class="page-title">리뷰이야기</h1>
				</div>
			</div>
		</div>
	</div>
	<!-- End page header -->



	<section>
		<div align="center">
			<hr>
			<h2>리뷰 상세 보기</h2>
			<hr>
			<br>
			<table border='1' class="tg">
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">번호</th>
					<td width="500px" style="padding-left: 10px">${ board.comNo }</td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">작성자</th>
					<td width="500px" style="padding-left: 10px">${ board.id }</td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">제목</th>
					<td width="500px" style="padding-left: 10px">${ board.comTitle }</td>
				</tr>

				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">내용</th>
					<td width="500px" style="padding-left: 10px">${ board.comContent }</td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">조회수</th>
					<td width="500px" style="padding-left: 10px">${ board.viewCnt + 1 }</td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">등록일</th>
					<td width="500px" style="padding-left: 10px">${ board.regDate }</td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">첨부파일</th>
					<td width="500px" style="padding-left: 10px"><c:forEach
							items="${ fileList }" var="file">
							<a
								href="${ pageContext.request.contextPath}/upload/${file.fileSaveName}">
								${ file.fileOriName } </a>
							(${ file.fileSize } bytes)<br>
						</c:forEach></td>
				</tr>
				<tr>
					<th width="100px" class="tg-ltmv" style="text-align: center;">좋아요
						수</th>
					<td width="500px" style="padding-left: 10px">${ board.comLikeCnt }</td>
				</tr>
			</table>

			<br>
			<button onclick="doAction('R')">답글</button>
			<c:if test="${ board.id eq userVO.id }">
				<button onclick="doAction('U')">수정</button>
			</c:if>
			<c:if test="${ board.id eq userVO.id || userVO.type == 'S'}">
				<button onclick="doAction('D')">삭제</button>
			</c:if>
			<button onclick="doAction('L')">목록</button>
			<c:if test="${ board.id ne userVO.id}">
				<button onclick="doAction('A')" id="like">좋아요</button>
			</c:if>

			<!-- 댓글  -->
			<hr>
			<h4>댓글창</h4>

			<!-- <form method="post" action="/reply/write">
	
		<p>
			<label>댓글 작성자</label> <input type="text" name="writer">
		</p>
		<p>
			<textarea rows="5" cols="50" name="content"></textarea>
		</p>
		<p>
			<button type="submit">댓글 작성</button>
		</p>
	</form>
 -->

			<div id="mention">
				<table border="1">
					<!-- 댓글 목록 -->
					<!-- 공유영역 등록 ..했나..? -->
					<c:if test="${not empty requestScope.mentionList }">
						<c:forEach var="mention" items="${requestScope.mentionList}">

							<tr>
								<!-- 아이디, 작성날짜 -->
								<td width="150">
									<div>
										${mention.mentionId}<br> <font size="2" color="lightgray">${mention.regDate}</font>
									</div>
								</td>
								<!-- 본문내용 -->
								<td width="550">
									<div class="text_wrapper">${mention.mentionContent}</div>
								</td>
								<!-- 버튼 -->
								<td width="100">
									<div id="btn" style="text-align: center;">
										<a href="#">[답변]</a><br>
										<!-- 댓글 작성자만 수정, 삭제 가능하도록 -->
										<c:if test="${mention.mentionId == sessionScope.userVO.id}">
											<a href="#">[수정]</a>
											<br>
											<a href="#">[삭제]</a>
										</c:if>
									</div>
								</td>
							</tr>

						</c:forEach>
					</c:if>


					<!-- 로그인 했을 경우만 댓글 작성가능 -->
					<c:if test="${sessionScope.userVO !=null}">
						<tr bgcolor="#F5F5F5">
						
								<%--<form action="${ pageContext.request.contextPath }/mentionWrite.do"
									method="post" name="inputForm"
									id="writeMentionForm"> --%>
									<!--..?  -->
									
									<!-- 아이디 뜨는 부분 -->
								<td width="150px">
									<div>${sessionScope.userVO.id}</div>

								</td>
								<!-- 댓글 적는 부분-->
								<td width="550px">
									<div>
										<textarea name="mentionContent" id="mentionContent" rows="4" cols="70"></textarea>
									</div>
								</td>
								<!-- 댓글 등록 버튼 -->
								<td width="100px">
									<div id="btn" style="text-align: center;">
										<p>
											<button id="writeMention" >댓글등록</button>
											
											<!-- type="submit" -->
										</p>
									</div>
								</td>
							<%--</form> --%>
						</tr>
					</c:if>

				</table>
			</div>
		</div>




		<%-- 
 <c:if test = "${sessionScope.userVO != null}">
    
    <textarea rows = "3" cols = "80" id = "r_content" name = "r_content"></textarea>
    <br>
    
    
    <!-- 댓글쓰기 버튼을 클릭하면 위쪽에 있는 자바스크립트 구문이 실행되어서 컨트롤러로 맵핑됨 --><br><br>
    
    <button type = "button" id = "btnReply">댓글쓰기~~!~!</button>
    </c:if>
    
    <!-- 댓글 목록 -->
    <!-- 댓글이 등록이 되면 listReply에 댓글이 쌓이게 된다. -->
    <div id = "listReply"></div>
 --%>


	</section>
	<footer>
		<%@ include file="/jsp/include/footer.jsp"%>
	</footer>
</body>
</html>