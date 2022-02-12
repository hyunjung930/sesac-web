package kr.co.mlec.board.ui;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class SearchOneUI extends BaseUI {   	
	//2. 글번호 조회 class BaseUI 상속받는데 재정의함 

	@Override
	public void execute() {

		int no = scanInt("조회할 글번호를 입력하세요 : ");
		
		//--------------------------
		BoardDAO dao = new BoardDAO();
		//
		BoardVO result = dao.selectByNo(no);
		//
		//--------------------------
		
		System.out.println("------------------------------------");
		if(result == null) {	
			//조회된 글번호에서 게시물이 없을 시에 대한 출력
			System.out.println("조회된 게시물이 없습니다");
		} else {	
			// 
			System.out.println("\t번  호 : " + result.getNo());
			System.out.println("\t제  목 : " + result.getTitle());
			System.out.println("\t글쓴이 : " + result.getWriter());
			System.out.println("\t등록일 : " + result.getRegDate());
		}
		System.out.println("------------------------------------");
	}

}
