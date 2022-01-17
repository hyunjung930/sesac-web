<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		width: 100px;
		height: 100px;
		background-color: red;
	}
</style>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		/*
		$('div').css({
			'width' : '100px',
			'height' : '100px',
			'background-color' : 'red'
			
		})*/
		
		$('div').hide(1000)
		$('div').show(1000)
		
		$('div').toggle(1000)		//toggle 스크롤에 따라 보이는 것
		
		$('div').fadeOut(2000)
		$('div').fadeIn(2000)
		
		$('div').fadeToggle(2000)		 
		$('div').fadeToggle(2000)		
		
		$('div').fadeTo(1000, 0.6)		//투명도를 1초에 걸쳐서 0.6정도의 투명도를 가짐
		})
</script>
</head>
<body>
	<div></div>
</body>
</html>