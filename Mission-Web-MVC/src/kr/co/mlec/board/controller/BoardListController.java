package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.controller.Controller;

//  /board/list.do (전체리스트조회)호출되었을 때
//  1. 비즈니스로직 수행 (tbl_board에서 전체게시글 조회)
//  2. servlet에게 forward 시킬 jsp/board/list/jsp 알려줌

public class BoardListController implements Controller {	
	//controller 인터페이스 상속 받아 안의 내용 사용 

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{		//String으로 받는 이유는 jsp주소값으로 받기 때문에 
		
		BoardService service = new BoardService();	//서비스에서
		List<BoardVO> list = service.selectAllBoard();
		
		request.setAttribute("list", list); 	
		//공유영역인 request에 등록해 준다.
		return "/jsp/board/list.jsp";
	}
	
}
