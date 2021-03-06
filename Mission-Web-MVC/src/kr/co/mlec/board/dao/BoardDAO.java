package kr.co.mlec.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.board.vo.BoardFileVO;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.util.JDBCClose;
import kr.co.mlec.util.connectionFactory;

/**
 * 게시판 유(tbl_board) CRUD
 * 
 * @author user
 */
public class BoardDAO {
	/**
	 * 전체 게시글 조회
	 */
	public List<BoardVO> selectAllboard() {

		List<BoardVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
			sql.append(" from tbl_board ");
			sql.append(" order by no desc ");
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				BoardVO board = new BoardVO(no, title, writer, regDate);

				// Systme.out.println(board);

				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		return list;
	}

	/**
	 * 게심시물 번호 추출(seq_tbl_board_no)
	 * 
	 */
	public int selectBoardNo() {
		String sql = "select seq_tbl_board_no.nextval from dual "; // dual: 가상의 테이블
		// 한줄로 끝나서 스트링 빌더 안씀
		int boardNo = 0;

		try (Connection conn = new connectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			boardNo = rs.getInt(1); // 첫번째 컬럼에 있는 것을 가져온

		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardNo;
	}

	/**
	 * 새글등록
	 */
	public void insertBoard(BoardVO board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new connectionFactory().getConnection(); // private 으로 묶어서 올려버린다.
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_board(no, title, writer, content) ");
			sql.append(" values(?, ?, ?, ?) ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, board.getNo());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getWriter());
			pstmt.setString(4, board.getContent());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
	}

	/**
	 * 게시판 번호에 대한 조회
	 * 
	 * @param boardNo
	 * @return
	 */
	public BoardVO selectBoardByNo(int boardNo) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		BoardVO board = null;

		try {
			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select no,title,writer, content, view_cnt ");
			sql.append(" 	, to_char(reg_date, 'yyyy-mm-dd') reg_Date ");
			sql.append("   from tbl_board ");
			sql.append(" where no =?");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				int viewCnt = rs.getInt("view_cnt");
				String regDate = rs.getString("reg_date");

				board = new BoardVO(no, title, writer, content, viewCnt, regDate); // 상세조회된 애들을 board로 묶는다.
			}
			// rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		return board;
	}

	/**
	 * 게시물 수정(제목, 작성자, 내용)
	 */
	public void updateBoard(BoardVO board) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("update tbl_board ");
			sql.append("	set title = ?, writer = ?, content = ? ");
			sql.append(" where no = ? ");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getNo());
			pstmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

	}

	/**
	 * 조회수 올리기
	 */
	public void updateCnt(int no) {

		StringBuilder sql = new StringBuilder();
		sql.append("update tbl_board ");
		sql.append("	set view_cnt = (view_cnt + 1) ");
		sql.append(" where no = ? ");
		try (Connection conn = new connectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	///////////////////////////////////////////////////////////////////
	// 첨부파일 CRUD //
	///////////////////////////////////////////////////////////////////

	public void insertFile(BoardFileVO fileVO) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_board_file(no, board_no, file_ori_name ");
		sql.append("         ,file_save_name, file_size) values(seq_tbl_board_file_no.nextval, ?, ?, ?, ?) ");

		try (Connection conn = new connectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setInt(1, fileVO.getBoardNo());
			pstmt.setString(2, fileVO.getFileOriName());
			pstmt.setString(3, fileVO.getFileSaveName());
			pstmt.setInt(4, fileVO.getFileSize());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<BoardFileVO> selectFileByNo(int boardNo) {
 
		List<BoardFileVO> fileList = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append("select no, file_ori_name, file_save_name, file_size ");
		sql.append(" from tbl_board_file ");
		sql.append("where board_no = ? ");

		try (Connection conn = new connectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				BoardFileVO fileVO = new BoardFileVO();

				fileVO.setNo(rs.getInt("no"));
				fileVO.setFileOriName(rs.getString("file_ori_name"));
				fileVO.setFileSaveName(rs.getString("file_save_name"));
				fileVO.setFileSize(rs.getInt("file_size"));

				fileList.add(fileVO);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		return fileList;
	}

}
