<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1초마다 * 늘어나기 </title>
<script src ="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
	
		$('h1').click(function(event, data){
		$(this)[0].innerText += ' * '
		
		})
		
		setInterval(function (){				// 주기적으로 내용 수행
	//		$('h1').click()
			$('h1').trigger('click')		// 강제로 이벤트 발생시키기
		},1000)
	})
</script>
</head>
<body>
	<h1>수행률 : </h1>
</body>
</html>