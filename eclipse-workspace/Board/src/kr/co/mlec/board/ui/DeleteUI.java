package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() {

		int no = scanInt("삭제할 글번호를 입력하세요 : ");

		// -------------------------
		BoardDAO dao = new BoardDAO();
		BoardVO board = new BoardVO();
		board.setNo(no);
		dao.deleteBoard(board);
		
		//------------------------------

		System.out.println("[" + no + "]번 게시글이 삭제되었습니다");
	}

}
