<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		width: 100px;
		height: 100px;
		background-color: red;
		dlsplay:none;
		position: absolute;
	}
</style>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		
		$('div').animate({
			width: 'toggle',
			height: 'toggle',
			left: '100px',
			top:'50px',
			opacity: '0.4'
		},2000)
			
		/* $('div').animate({
			width:'200px',
			height:'+=200px'		//height가 가지고 있는 숫자 더하기
		},2000) */		//2초 동안 	
	})
</script>

</head>
<body>
	<div>
	</div>
</body>
</html>