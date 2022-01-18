<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기 통신 서버 쪽으로 이름, 나이 전달</title>
<script src ="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>

	$(document).ready(function() {
		
		$('button').click(function(){
		
			let name =$('#name').val()	
			let age =$('#age').val()
			
		/* 	$.get('parma.jsp', {'name':name, age:25} function(data){
				$('#debug').val(data)
			})
 */
			//get으로 ajax
			/* $.post('parma.jsp', "name=hong&age=25" function(data){
				$('#debug').val(data)
			})
			 */
		 
			//param.jsp?name:hong&age=25
		$.ajax({
			type: 'get',			
			url : 'param.jsp',
			//data: 'name=hong&age=25',
			//data : 'name=' + name + '&age=' + age,		//오류 날 가능성이 많아
			//data : `name=${name}&age=${age}`
			data : {			//data를 객체로 넘길 수 있다.
				name: name,		//name 멤버변수에 name
				age: age		//age 멤버변수에 age
			},
			success : function(data){
				$('#debug').val(data.trim())		//val로 인자 가져옴
			}, error: function(error){
				alert('오류상태코드 : ' + error.status)	//이러면 404에러 뜸 
			}
		})
		}) 
	})
</script>
</head>
<body>
	<textarea rows="10" cols="80" id ="debug"></textarea><br>  <!-- 수정하려는 영역 -->
	이름: <input type = "text" name = "name" id ="name"><br>		<!-- param.jsp에 전달 영역-->
	나이: <input type = "text" name = "age" id ="age"><br>		<!-- param.jsp에 전달 영역-->
	<button>호출</button>
</body>
</html>