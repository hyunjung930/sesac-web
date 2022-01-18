<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.c1{
		font-style: italic;
	}
	.c2{
		color : pink;
	}
	.blue{
		color : blue
	}
	.red{
		color : red
	}
</style>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		
		$('button').click(function(){
			
		$('body h1').addClass('red')		//바디 안에 h1안에  blue class 추가
		$('body *').addClass('blue')		//body 밑이라 button 색도 blue로 바뀐다. 
		$('h1').removeClass('red')		//h1의 red클래스 지우기 
		
		})
	})
</script>
</head>
<body>
	<h1 class = "c1 c2">나는 문장 1 입니다</h1>	
	<h1>나는 문장 2 입니다</h1>
	<p>나는 단락입니다</p>
	<div>
		나는 구역입니다.
	</div>
	<button>클릭</button>
</body>
</html>