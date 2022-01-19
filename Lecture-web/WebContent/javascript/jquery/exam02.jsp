<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery hide</title>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		alert('ready...')
			
		//$('h1').hide() /* h1 안보이게 만듬 */
		//$('#h01').hide()
		//$('.c01').hide()
		//$('h1.c01').hide()
		//$('body > *').hide()	/*바디 밑에 있는 모든 자식 애들 지우기*/
		//$('h1:first').hide()
		$('h1:last').hide()		/* 마지막거 지우기*/ 
		/*
		let h1Tags = document.getElenmentsByTagName("h1")
		for(let tag of h1Tags){
			tag.style.display ='none'
			
		}*/
	})

</script>
</head>
<body>
	<hr>
	<h1 id= "h01">Hello</h1>
	<h1 class ="c01">Hi</h1>
	<h2>good-bye</h2>
	<hr>
	<hr>
	<h1>Hello</h1>
	<h1 class ="c01">Hi</h1>
	<h2 class ="c01">good-bye</h2>
	<hr>
	
</body>
</html>