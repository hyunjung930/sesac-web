package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class AddUI extends BaseUI {

	@Override
	public void execute() {	// BaseUI 상속 받아서 실행파일 열어 오버라이딩해서 다시 재정의 

		String title = scanStr("등록할 제목을 입력하세요 : ");		
		//scanStr 스캔 받은 애들 sql developer에 넣어
		String writer = scanStr("등록할 글쓴이를 입력하세요 : ");
		//scanStr 스캔 받은 애들 sql developer에 넣어
		
		//////////////
		BoardDAO dao = new BoardDAO();
		// dao 다시 재정의해서 추가 내용 삽입 
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		dao.insertBoard(board);
		
		/////////////
		
		System.out.println("게시글 등록을 완료하였습니다");                          
		
	}

}







