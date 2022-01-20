package kr.co.mlec.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.controller.Controller;
import kr.co.mlec.util.SesacFileNamePolicy;

public class BoardWriteController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String saveFolder = "D:\\Lecture\\web-workspace\\Mission-Web-MVC\\WebContent\\upload";
		
		
		MultipartRequest multi = new MultipartRequest
	            (request, saveFolder,1024*1024*3, "utf-8",new SesacFileNamePolicy());
		// 요청객체로 날라오는 데이터들을 파싱할거야 
				// 최대 3메가로 텍스트 파일 utf으로 인코딩하고 SesacFile~ 이걸로 이름을 새거로 만들어준다.  
				//저장 장치는 원래 이클립스 워크 폴더이지만 deploy판이 아니라
		
		// 제목, 작성자, 내용 추출
		String title = multi.getParameter("title");			//multi를 이용해서 사용힌디.
		String writer = multi.getParameter("writer");
		String content = multi.getParameter("content");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		BoardService service = new BoardService();
		service.insertBoard(board);
		
		
		return "redirect:/board/list.do";
	}

	
}
