package kr.co.mlec.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

/**
 * DAO : Data Access Object 데이터베이스의 t_board 테이블의 CRUD를 위한 클래스
 * 
 * @author user
 *
 */
public class BoardDAO {

	/**
	 * 전체게시글을 조회하는 기능 dao는 기능을 데이터베이스에 직접 넣으려고 만듬 그래서 JDBC 프로그램 순서대로 작성됨
	 */
	public List<BoardVO> selectAll() {
		// Collection은 자료분석을 위한 것.
		// 동적자료구조인 List(순서ㅇ,중복ㅇ) 를 사용하여 데이터 연
		Connection conn = null;
		PreparedStatement pstmt = null;

		// 전체게시글 저장하기 위한 list
		List<BoardVO> boardList = new ArrayList<>();
		// ArrayList는 동적자료로 내부적으로 배열을 이용해 데이터 관리
		// ArrayList 배열의 크기가 정해지있지 않아 유동적임

		try {
			conn = new ConnectionFactory().getConnection();
			//
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, reg_date ");
			sql.append(" from t_board ");

			pstmt = conn.prepareStatement(sql.toString());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				BoardVO board = new BoardVO(no, title, writer, regDate);

				boardList.add(board);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return boardList;
	}

	/**
	 * 특정 번호의 게시글을 조회하는 기능
	 */
	public BoardVO selectByNo(int boardNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			// StringBiuilder를통해 메모리 아끼고 효율적
			sql.append("select no, title, writer, reg_date ");
			// append를 사용하여 원래 문자열에서 sql문 더해줌
			sql.append("  from t_board ");
			sql.append(" where no = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			// toString을 통해 문자열로 인식하게 만들어
			pstmt.setInt(1, boardNo);
			// 1번쨰 행에 보드 넘버 넣음

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				BoardVO board = new BoardVO(no, title, writer, regDate);
				return board;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return null;
	}

	/**
	 * 새글을 등록하는 기능
	 */
	public void insertBoard(BoardVO board) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new ConnectionFactory().getConnection();
			//
			StringBuilder sql = new StringBuilder();
			sql.append("insert into t_board(no, title, writer) ");
			sql.append(" values(seq_t_board_no.nextval, ?, ?) ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

	}

	/**
	 * 게시물을 수정하는 기능
	 */
	public void updateBoard(BoardVO board) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("update t_board ");
			sql.append(" set title = ?, ");
			sql.append(" writer = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
	}

	/**
	 * 게시물을 삭제하는 기능
	 */
	public void deleteBoard(BoardVO board) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("delete from t_board ");
			sql.append(" where no = ? ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, board.getNo());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}
