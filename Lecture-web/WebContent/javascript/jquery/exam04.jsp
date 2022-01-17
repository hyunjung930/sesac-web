<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src ="js/jquery-3.6.0.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.min.js" integrity="sha256-eGE6blurk5sHj+rmkfsGYeKyZx3M4bG+ZlFyA7Kns7E=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function() {
		alert('!!!')
		//$('a').hide()
		//$('a[target]').hide()	// target 속성만 있는 애들을 지워줘
		//$('a[href="http://www.naver.com"]').hide()	//naver.com을 지워줘
		
		//$('input[type = text]').hide()
		//$('input.text').hide()
		//$('input.button').hide()
		//$('button').hide()
		//$(':text').hide()	//타입이 text인것을 지워줘
		//$(':button').hide()		//버튼인 친구들 다 지워줘
		
		$(':button').click(function(){	//버튼을 클릭하는 함수
				//$('hr').hide()
				$(this).hide("drop", {direction : 'down'})		//클릭한 버튼 지우기
		})	
	})
	
</script>
</head>
<body>
	<h2>a Tag 전</h2>
	<a href ="http://www.never.com">네이버</a>
	<a href ="http://www.daum.net" target="_blank">다음</a>
	<h2>a Tag 후</h2>
	<hr>
		<input type ="text">
		<input type ="button" value ="버튼1">
		<button>버튼2</button>
	<hr>
</body>
</html>