<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#msgView{
		border: 1px solid red;
		height: 200px;
		width: 500px;
	
	}
</style>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		$('button').click(function(){
			/*
				url 	: 요청주소(문자열)
				type	: 요청메소드(문자열)
				data	: 요청 파라미터(문자열, 객체)
				success : 요청성공(함수)
				error	: 요청실패(함수)
			*/
			$.ajax({				//비동기 통신을 할 때 쓰는 함수
				url: 'hello.jsp',
				success : function(data){		//function의 인자로 날라온다.
					$('#msgView').append(data)
				}, error: function(){
					alert('실패')
				}
			})	 
		})
	})
</script>
</head>
<body>
	<h2>서버에서 받은 메세지</h2>
	<div id ="msgView"></div>
	<button>서버에서 자료요청</button>
</body>
</html>