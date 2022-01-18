<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클릭 눌러서 사진 옮겨가기 실습</title>
<style>
	img{
		height: 200px;
		width: 200px;
		float: left;
	}
	button{
		height: 200px;
		float: left;
	}
	
</style>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		$('#next').click(function(){
			$('img').last().prependTo('#gallery')
		})	
		$('#nprev').click(function(){
			$('img').first().appendTo('#gallery')
		})	
		setInterval(function(){
			$('#next').trigger('click')
		},2000)
	})
	
</script>
</head>
<body>
	<button id ="prev">pre</button>
	<span id = "gallery">
		<img src ="/Lecture-web/html/images/dog2.jpg ">
		<img src ="/Lecture-web/html/images/dog3.jpg ">
		<img src ="/Lecture-web/html/images/ms.gif ">
		<img src ="/Lecture-web/html/images/su2.gif ">
	</span>
	<button id = "next">next</button>
</body>
</html>