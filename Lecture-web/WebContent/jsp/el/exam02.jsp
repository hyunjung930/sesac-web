<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--

	http://localost:9999/Lecture-web/jps/el/exam02.jsp?id=aaa 요청가정시 aaa 추출 어떻게 할것인가?	
 --%>
 	
 	<%
 		String id = request.getParameter("id");
 		String[] hobby = request.getParameterValues("hobby");
 		if(hobby == null){
 			hobby =new String[] {"파라미터 없음"};
 			
 		}
 	%>
 	id: <%=id %><br>
 	id: <%=request.getParameter("id") %><br>
 	id: ${ param.id}<br>
 	
 	name: <%=request.getParameter("name") %><br>
 	name: ${ param.name }<br>
 	
 	<%--
	http://localost:9999/Lecture-web/jps/el/exam02.jsp?id=aaa%name=bbb&hobby=reading&hobby=movie	
 	--%>
 	
 	hobby[0] : <%= hobby[0] %><br>
 	hobby[0] : ${ paramValues.hobby[0] }<br>
 	empty hobby [0] : ${ empty paramValues.hobby[0]}<br>
 	
 	
</body>
</html>