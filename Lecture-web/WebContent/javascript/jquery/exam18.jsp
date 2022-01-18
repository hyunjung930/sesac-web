<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자식의 태그 만들기</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		$('#btn01').click(function() {

			/* //<h1>세번째 문장</h1>\
			let h1Tag = document.createElement('h1')
			let text = document.createTextNode('세번째 문장')
			h1Tag.appendChild(text)
			//console.log(h1Tag,text)
			document.querySelector('div').appendChild(h1Tag)		//하나밖에 없는 div라 쿼리셀렉터 사용 가능 
			 */
			// jquery 이용
			$('div').append('<h1>세번째 문장</h1>') // div에 append이용해서 새로운 자식 추가
		})
		$('#btn02').click(function() {

			/* 	$('ol').append('<li>노랑 </li>')		
			 */$('ol').prepend('<li>노랑 </li>') //prepend : 자식의 가장 위에 들어오는 것.

		})
	})
	$(document).ready(function() {
			$('#btn03').click(
				function() {
				//	$('body').prepend('<h4> 추가된 문장 </h4>')
				//	$('body').prepend('<h3> 또 추가된 문장 </h3>')
				//	$('body').prepend('<h6> 또또 추가된 문장 </h6>')
				$('body').prepend('<h4>추가 된 문장 </h4>','<h3> 또 추가된 문장 </h3>','<h6> 또또 추가된 문장 </h6>')
				// ,로 추가 가능 근데 순서는 써진 순서대로 추가 됨.
					})
			})
</script>
</head>
<body>
	<div>
		<h1>첫번째 문장</h1>
		<h1>두번째 문장</h1>
		<!--<h1>세번째 문장</h1> -->
	</div>
	<h2>색상표</h2>
	<ol>
		<!-- 순서를 가지고 있는 태그 -->
		<li>빨강</li>
		<li>파랑</li>
		<li>초록</li>
	</ol>
	<button id="btn01">문장추가</button>
	<button id="btn02">색상추가</button>
	<button id="btn03">본문추가</button>
</body>
</html>