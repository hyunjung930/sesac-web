<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  ${ myname }
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!--  login 창 열기 -->
<a href="test/login">로그인 창으로 가기1</a><br><!-- 상대경로 -->
<a href="/education/test/login">로그인 창으로 가기2</a><!-- 절대경로 -->

<form action="test/login" >
	<input type ="submit" value="로그인하기3(Form 이용)">
</form>
<hr>

<form action="test/login" method="post">
	<input type="text" name ="userid" value="sesac"><br>
	<input type="text" name ="userpass" value="aaaa"><br>
	<input type ="submit" value="로그인하기5(Form이용 POST)">
</form>
<hr>

<button id="btn1">로그인하기4(JS)</button>
<hr>
<form action="test/helloParam.do">
	<input type="text" name ="userid" value="sesac"><br>
	<input type="text" name ="userpass" value="aaaa"><br>
	<input type="submit" value="파라미터보내기"><br>
</form>





<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
//고전
$(function(){
	$("#btn1").click(function(){
		//BOM(Brower Object Model): window, document, location, history, screen
		location.href="test/login";
	});
});

</script>
</body>
</html>
