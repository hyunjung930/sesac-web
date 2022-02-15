<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 추가 페이지</title>
<style>
	hr, table{
		width : 80%
	}
</style>

</head>
<body>
	<div align="center">
		<hr>
		<h2>회원 추가</h2>
		<hr>
		<br>
		<form action="update" method="post" value>
			<table border = "1">
			<tr>
				<th width ="7%">id</th>
				<td> 
					<input type ="text" name = "id" >
				</td>
			</tr>
			<tr>
				<th width ="7%">name</th>
				<td> 
					<input type ="text" name = "name" >
				</td>
			</tr>
			<tr>
				<th width ="7%">password</th>
				<td> 
					<input type ="text" name = "password" >
				</td>
			</tr>
			<tr>
				<th width ="7%">email_id</th>
				<td> 
					<input type ="text" name = "email_id" >
				</td>
			</tr>
			<tr>
				<th width ="7%">email_domain</th>
				<td> 
					<input type ="text" name = "email_domain">
				</td>
			</tr>
			<tr>
				<th width ="7%">tel1</th>
				<td> 
					<input type ="text" name = "tel1" >
				</td>
			</tr>
			<tr>
				<th width ="7%">tel2</th>
				<td> 
					<input type ="text" name = "tel2" >
				</td>
			</tr>
			<tr>
				<th width ="7%">tel3</th>
				<td> 
					<input type ="text" name = "tel3" >
				</td>
			</tr>
			<tr>
				<th width ="7%">post</th>
				<td> 
					<input type ="text" name = "post" >
				</td>
			</tr>
			<tr>
				<th width ="7%">basic_addr</th>
				<td> 
					<input type ="text" name = "basic_addr" >
				</td>
			</tr>
			<tr>
				<th width ="7%">detail_addr</th>
				<td> 
					<input type ="text" name = "detail_addr" >
				</td>
			</tr>
			
			</table>
			<br>
			<input type="submit" value="추가">
			</form>
	</div>
</body>
</html>