<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#div01{
		background-color: : pink;
		height: 150px;
	}
</style>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		alert('!!!')
		
		/*$('#div01').mouseenter(function (){ 
			$(this).css('background-color', 'red')
		})
		
		$('#div01').mounseleave(function() {
			$(this).css('background-color', 'blue')
		})*/
		
		$('#div01').hover(function(){	// 마우스를 접근 미접근 변수 2개 받음
			$(this).css('background-color', 'green')
		},function(){
			$(this).css('background-color', 'yellow')
		})	
		$('#div01').click(function(event){
			console.log(event.pageX, event.pageY)
		})
		
		$('button').click(function(){		//클릭했을 때 함수 실행 (콜백) 
		//	$('h1:first').hide(1000)		//1초에 걸쳐서 사라지기
			$('h1:first').hide('slow')		//천천히 사라지기 (--> fast도 가능)
		})
		
		$('body > h1').dblclick(function(){	//바디 안에 있는 자식 (더블클릭하여 사라지기)
			$(this).hide(3000)
		})	
	})
</script>
</head>
<body>
	<div id ="div01">
		나는 div 영역입니다<br>
		마우스를 접근시켜보세요
	</div>	
	<h1>첫번째 문장입니다</h1>
	<h1>두번째 문장입니다</h1>
	<div>
		<h1>세번째 문장입니다</h1>
	</div>
	<h1>네번째 문장입니다</h1>
	<button>클릭</button>
</body>
</html>