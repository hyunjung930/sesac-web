
<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
	
	//요청할 객체 데이터 인코딩
	request.setCharacterEncoding("utf-8");

    //삭제할 제목,작성자,내용 추출
    
    int no = Integer.parseInt(request.getParameter("no"));
    
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
    BoardVO board = new BoardVO();
    
    board.setTitle(title);
	board.setWriter(writer);
	board.setContent(content);
	board.setNo(no);
	
	
    BoardDAO dao = new BoardDAO();
    dao.deleteBoard(board.getNo());

  %>
<script>
	alert('삭제가 완료되었습니다')
	location.href = 'list.jsp'
</script>
    