<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border = "1" style ="width: 100%">
	<tr>
		<td rowspan ="2" style ="height: 40px; width: 10px;">
			<a href="/Mission-Web">
				<img src ="/Mission-Web/images/logo.png"
					style ="height: 45px; width: 65px;" />
			</a>
			
		<td align ="right">
		즐겨찾기
		<c:if test = "${ not empty userVO }">
		[${ userVO.id }님으로 로그인 중....]
		</c:if>
		</td>
	</tr>
	<tr>
		<td>
			<nav>
				<c:if test="${ userVO.type eq 's' }">
				회원관리 | 
				</c:if>
				<a href="/Mission-Web/jsp/board/list.jsp">게시판</a> |
		<c:choose>
			<c:when test ="${ empty userVO }">
				 회원가입 | 
				 <a href="/Mission-Web/jsp/login/loginForm.jsp">로그인</a> |
			</c:when>
			<c:otherwise>
				 마이페이지 | 
				 <a href="/Mission-Web/jsp/login/logout.jsp">로그아웃</a>
			</c:otherwise>
		 </c:choose>
			</nav>
		</td>
	</tr>
</table>