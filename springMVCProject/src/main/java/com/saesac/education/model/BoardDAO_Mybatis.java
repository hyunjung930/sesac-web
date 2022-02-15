package com.saesac.education.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sesac.vo.BoardFileVO;
import kr.co.sesac.vo.BoardVO;

/**
 * 게시판 DB(tbl_board) CRUD
 * @author user
 *
 */
@Repository
public class BoardDAO_Mybatis {
	
	@Autowired
	SqlSession session;
	//sqlSession : SQL문 실행단위
	final String namespace = "com.saesac.board.";	//상수로 저장,final은 변경 불가
	
	/* 전체게시글 조회 */
	public List<BoardVO> selectAllBoard(String keyword, String contents) {
		
		Map<String, String> mymap = new HashMap<>();
	
		mymap.put("keyword", keyword);		//put으로 mymap에다가 값을 넣어줌!
		mymap.put("contents", "%"+contents+"%");	//contents에 검색시 내용 포함 다 
		
		
		return session.selectList(namespace+"selectAllBoard", mymap);
	}
	
	/* 게시물번호 추출(seq_tbl_board_no)*/
	public int selectBoardNo() {
		
		return session.selectOne(namespace + "selectBoardNo");
		//한건만 받고 바로 리턴
	}
	
	/* 새글등록 */
	public int insertBoard(BoardVO board) {
		
		return session.insert(namespace + "insertBoard", board);
		//파라미터 타입이 보드 타입으로 board 사용
	}
	
	/** 조회수 증가 */
	public int viewCnt(int boardNo) {
		
		return session.update(namespace + "viewCnt", boardNo);
		//파라미터로 넘겨주기 때문에 boardNo
	}
	
	/**
	 * 게시글 상세 보기
	 * @param boardNo
	 * @return
	 */
	public BoardVO selectBoardByNo(int boardNo) {
		
		return session.selectOne(namespace +"selectBoardByNo", boardNo);
	
	}
	
	/* 게시물 삭제	 */
	public int deleteByNo(int boardNo) {
		
		return session.delete(namespace +"deleteByNo", boardNo);
	}
	
	/* 게시물 수정 (제목, 작성, 내용)*/
	public int updateBoard(BoardVO board) {
		
		return session.update(namespace +"updateBoard", board);
	}
	/** 게시글 갯수*/
	public int boardCnt() {
		
		return session.selectOne(namespace+"boardCnt");
		//파라미터가 없어서 하나로만 한다. 
	}
	
	/**
	 * 첨부파일 CRUD
	 */
	public int insertFile(BoardFileVO fileVO) {
		
		return session.insert(namespace+"insertFile", fileVO);
	
	}
	
	public List<BoardFileVO> selectFileByNo(int boardNo) {
	
		return session.selectList(namespace+"selectFileByNo", boardNo);
	
	}
	
}
