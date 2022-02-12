package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() {

		int no = scanInt("수정할 글번호를 입력하세요 : ");
		// ---------------------------

		BoardDAO dao = new BoardDAO();
		BoardVO result = dao.selectByNo(no);

		System.out.println("------------------------------------");
		
		if (result == null) {
			System.out.println("조회된 게시물이 없습니다");
			return;
		} else {
			String title = scanStr("변경할 제목을 입력하세요 : ");
			String writer = scanStr("변경할 글쓴이를 입력하세요 : ");

			BoardVO board = new BoardVO();
			board.setTitle(title);
			board.setWriter(writer);
			dao.updateBoard(board);

			// ---------------------------

			System.out.println("[" + no + "]번 게시글이 수정되었습니다");
		}
	}
}
