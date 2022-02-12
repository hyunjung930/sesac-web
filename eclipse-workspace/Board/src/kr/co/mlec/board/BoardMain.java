package kr.co.mlec.board;

import kr.co.mlec.board.ui.BoardUI;		//게시판 만들기 

public class BoardMain {

	public static void main(String[] args) {

		BoardUI board = new BoardUI();
		board.execute();		
		//게시판에서 만드는 모든 실행메소드를 실행시키기 위해 만든 클래
	}
}
