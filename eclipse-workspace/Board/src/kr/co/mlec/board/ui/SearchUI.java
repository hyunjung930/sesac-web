package kr.co.mlec.board.ui;

import java.util.List;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class SearchUI extends BaseUI {

	@Override
	public void execute() {

		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.selectAll();
		//List 순서가 있고 중복 허용(배열과 유사/ArrayList사용)
		//
		System.out.println("---------------------------------------");
		System.out.println("번호\t글쓴이\t등록일\t제목");
		System.out.println("---------------------------------------");
		if(list.isEmpty()) {
			System.out.println("조회할 게시물이 없습니다");
		} else {
			for(BoardVO board : list) {
				System.out.println(board.getNo() + "\t" 
							+ board.getWriter() + "\t"
							+ board.getRegDate() + "\t"
							+ board.getTitle());
			}
		}
		System.out.println("---------------------------------------");
	}

}
