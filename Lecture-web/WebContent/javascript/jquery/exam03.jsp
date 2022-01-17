<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		alert('!!!')
		//$('ul li').hide()
	//	$('ul li:first').hide()	//호랑이만 사라지기
	//	$('ul li:last').hide()	//짜장면만 사라지기
	//	$('ul li:first-child').hide()	//동물 종류의 호랑이만 사라지기 
		$('ul li:last-child').hide()	
		
		
	})
</script>
</head>
<body>
	<h1>동물종류</h1>
	<ul>
		<li>호랑이</li>
		<li>사자</li>
		<li>코끼리</li>
	</ul>
	<h1>음식종류</h1>
	<ul>
		<li>떡볶이</li>
		<li>라면</li>
		<li>순대</li>
		<li>짜장면</li>
	</ul>
</body>
</html>