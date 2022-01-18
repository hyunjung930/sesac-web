<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		border : 1px solid red;
		padding : 10px;
	}
</style>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		$('button').click(function(){
			/* let pTags = document.getElementsByTagName("p")
			for(let i in pTags){	//p 태그 모두 지우고 싶을 때 for문 사용해서 작성. 				
			pTags[0].parentNode.removeChild(pTags[0])	// 모든 브라우저 지원으로 인해 removeChild 사용 
			}
		 */
		 
		// $('p').remove()	//jquery 함수로 p태그 모두 지우기 
		 //$('div').remove()
		 //$('div').empty()		//div는 살리고 안에 하위 태그들만 지우기
		// $('p').remove('.c01')	// 1. p 태그 안에 있는 클래스 c01 지우기 
		// $('p.c01').remove()	// 2. p 태그 안에 있는 클래스 c01 지우기
		
		$('p').remove('.c01, #id01')
		})

	})
</script>
</head>
<body>
	<div>
		<p id ="id01">나는 홍길동입니다</p>
		<mark class ="c01">나는 윤길동입니다</mark><br>
		나는 고길동입니다<br>
		<p class = "c01">나는 한길동입니다</p>
		<p>나는 김길동입니다</p>
	</div>
	<p class ="c01">나는 박길동입니다</p>
	<button>삭제</button>
</body>
</html>