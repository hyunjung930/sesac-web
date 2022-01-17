<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바스크립트 객체(JSON)</title>
<script>
	let person = {
			name : '홍길동'
			'pohne' : '010-1111-2222',
			info :function(){
				slert(this.name + ' : ' + this.phone)
				
			}
			
	}
	docunment.write('이름: ' + person.name + ", 전화번호 : " + person.phone + '<br>')
	
	person.info()
	
</script>
</head>
<body>

</body>
</html>