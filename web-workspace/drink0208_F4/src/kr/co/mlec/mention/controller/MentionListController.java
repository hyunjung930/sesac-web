package kr.co.mlec.mention.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.controller.Controller;
import kr.co.mlec.mention.dao.MentionDAO;
import kr.co.mlec.mention.service.MentionService;
import kr.co.mlec.mention.vo.MentionVO;

//댓글목록
public class MentionListController implements Controller {

	//?,,,
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		 request.setCharacterEncoding("utf-8");
		
		//글번호를 가져온다.
		 int no =Integer.parseInt(request.getParameter("no"));

		// 페이징..? 모름

	
		BoardDAO dao = new BoardDAO();	
		BoardVO boardVO = dao.selectBoardByNo(no);
       
	
		  
		// 게시글 번호를 이용하여 해당 글에 있는 댓글목록 가져옴
		//MentionDAO mentionDAO = new MentionDAO();
		//MentionVO mentionVO = new MentionVO();
		
		MentionService service = new MentionService();
		
		
		ArrayList<MentionVO> mentionList = service.selectMentionList(no);

		request.setAttribute("boardVO", boardVO);
		request.setAttribute("mentionList", mentionList);
		
		System.out.println("size : " + mentionList.size());
		// 댓글이 1개라도 있다면 request에 mentionList를 세팅한다.
		/*
		 * if (mentionList.size() > 0) { }
		 */
		//request.setAttribute("board", boardVO);

		// request.setAttribute("pageNum", pageNum);

		//return "/jsp/board/detail.jsp";
		
		 return "redirect:/board/detail.do?no=" + no;
	}
}
