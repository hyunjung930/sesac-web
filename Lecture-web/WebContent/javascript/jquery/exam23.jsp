<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자식 (형제자매) 접근</title>
<style type="text/css">
	body *{
		display: block;
		border: 1px solid red;
		padding: 10px;
		margin: 10px;
		
	}
	.blue{
		border-color: blue
	}
</style>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		//$('h2').siblings().addClass('blue')
		//$('h2').siblings('h3').addClass('blue')
		//$('h2').next().addClass('blue')	//h2의 바로 다음에 있는 것 .
		//$('h2').prev().addClass('blue')		//h2의 앞쪽에 있는 형제 
		//$('h1').nextuntil('p').addClass('blue')		//h2의 p태그 나오기 전까지  
		//$('h1').prevAll('p').addClass('blue')	// p태그 앞 모두
		$('h3').siblings.().eq(1).addClass('blue')	//eq는 jquery 문법
		
		
	})
</script>
</head>
<body>
	<div>div1
		<p>p-1</p>
		<span>span</span>
		<h1>h1</h1>
		<h2>h2</h2>
		<h3>h3<p>p-2-1</p></h3>
		<p>p-3</p>
	</div>
	<div>div2
		<h2>h2</h2>
		<h3>h3</h3>
		<p>p2-1</p>
	</div>
</body>
</html>