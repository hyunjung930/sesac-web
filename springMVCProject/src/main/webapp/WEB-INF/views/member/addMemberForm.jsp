<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 추가 페이지</title>
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/resources/css/layout.css">
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/resources/css/board.css">
<style>
hr, table {
	width: 80%
}
</style>
<script type="text/javascript">
	function doWrite() {

		let f = document.inputForm

		if (f.id.value == '') {
			alert('ID을 입력하세요')
			f.title.focus()
			return false
		}

		if (f.name.value == '') {
			alert('이름을 입력하세요')
			f.content.focus()
			return false
		}

		if (f.password.value == '') {
			alert('비밀번호를 입력하세요')
			f.content.focus()
			return false
		}

		return true
	}
</script>
</head>
<body>
	<div align="center">
		<hr>
		<h2>회원 수정</h2>
		<hr>
		<br>
		<form action="insert" 
		name = "inputForm" method="Post" onsubmit="return doWrite()">
			<table border="1">
				<tr>
					<th width="7%">id</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th width="7%">name</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th width="7%">password</th>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<th width="7%">email_id</th>
					<td><input type="text" name="email_id"></td>
				</tr>
				<tr>
					<th width="7%">email_domain</th>
					<td><input type="text" name="email_domain"></td>
				</tr>
				<tr>
					<th width="7%">tel1</th>
					<td><input type="text" name="tel1"></td>
				</tr>
				<tr>
					<th width="7%">tel2</th>
					<td><input type="text" name="tel2"></td>
				</tr>
				<tr>
					<th width="7%">tel3</th>
					<td><input type="text" name="tel3"></td>
				</tr>
				<tr>
					<th width="7%">post</th>
					<td><input type="text" name="post"></td>
				</tr>
				<tr>
					<th width="7%">basic_addr</th>
					<td><input type="text" name="basic_addr"></td>
				</tr>
				<tr>
					<th width="7%">detail_addr</th>
					<td><input type="text" name="detail_addr"></td>
				</tr>

			</table>
			<br> <input type="submit" value="회원등록">
		</form>
	</div>
</body>
</html>