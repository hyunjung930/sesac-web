package com.saesac.education.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sesac.vo.BoardFileVO;
import kr.co.sesac.vo.BoardVO;


@Service
public class BoardService {
	
	@Autowired
	BoardDAO_Mybatis dao;	//Mybatis를 이용함
	//BoardDAO dao;			//JDBC 직접 이용함 
	
	public List<BoardVO> selectAllBoard(String keyword, String contents) {
		
		return dao.selectAllBoard(keyword,contents);		//dao 받아서 리턴 시켜줘
	}
	
	public int selectBoardNo() {
		
		return dao.selectBoardNo();
	}
	
	//게시글 추가
	public int insertBoard(BoardVO board) {
		return dao.insertBoard(board);
	}
	//조회수
	public int viewCnt(int boardNo) {
		return dao.viewCnt(boardNo);
	}
	
	public BoardVO selectBoardByNo(int boardNo) {
		return dao.selectBoardByNo(boardNo);
	}
	
	//수정하기
	public int updateBoard(BoardVO board) {
		return dao.updateBoard(board);
		
	}
	//삭제하기
	public int deleteByNo(int boardNo) {
		return dao.deleteByNo(boardNo);
	}
	//게시글 갯수
	public int boardCnt() {
		return dao.boardCnt();
	}
	//파일 첨부
	public int insertFile(BoardFileVO fileVO) {
		return dao.insertFile(fileVO);
	}
	
	public List<BoardFileVO> selectFileByNo(int boardNo) {
		return dao.selectFileByNo(boardNo);
	}	
}
