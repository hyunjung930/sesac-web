package kr.co.mlec.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.lib.vo.bookVO;
import kr.co.mlec.util.connectionFactory;
import kr.co.mlec.util.JDBCClose;

public class searchBookDAO {
	/**
	 * 1. 도서검색
	 * 
	 * @return
	 */
	// 0. 전체 도서 조회
	public List<bookVO> selectByAll() {

		Connection conn = null;
		PreparedStatement pstmt = null;

		List<bookVO> BookListAll = new ArrayList<>();

		try {
			conn = new connectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select book_n, title, author, publisher, price ");
			sql.append("from t_book ");
			sql.append("order by to_number(book_n)");
			pstmt = conn.prepareStatement(sql.toString());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String book_n = rs.getString("book_n");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String price = rs.getString("price");

				bookVO book = new bookVO(book_n, title, author, publisher, price);

				BookListAll.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return BookListAll;
	}

	// 1. 도서 번호 조회
	public List<bookVO> selectByNo(String boardNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		List<bookVO> BookListAll = new ArrayList<>();

		try {
			conn = new connectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select book_n, title, author, publisher, price ");
			sql.append("  from t_book ");
			sql.append(" where instr(book_n, ?)>0");
			//
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boardNo);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String book_n = rs.getString("book_n");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String price = rs.getString("price");

				bookVO book = new bookVO(book_n, title, author, publisher, price);

				BookListAll.add(book);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return BookListAll;
	}

	// 2.책제목------------------------------------------------------------------------------
	public List<bookVO> selectByTitle(String boardNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		List<bookVO> BookList = new ArrayList<>();

		try {
			conn = new connectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select book_n, title, author, publisher, price ");
			sql.append("  from t_book ");
			sql.append(" where instr(title, ?)>0 ");
			sql.append(" order by title");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boardNo);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String book_n = rs.getString("book_n");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String price = rs.getString("price");

				bookVO book = new bookVO(book_n, title, author, publisher, price);
				BookList.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return BookList;
	}

	// 3.저자--------------------------------------------------------------------------------
	public List<bookVO> selectByAuthor(String boardNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		List<bookVO> BookAuthor = new ArrayList<>();

		try {
			conn = new connectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select book_n, title, author, publisher, price ");
			sql.append("  from t_book ");
			sql.append(" where instr(author, ?)>0 ");
			sql.append(" order by author ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boardNo);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String book_n = rs.getString("book_n");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String price = rs.getString("price");

				bookVO book = new bookVO(book_n, title, author, publisher, price);
				BookAuthor.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return BookAuthor;
	}

	// 4.출판사-------------------------------------------------------------------------------
	public List<bookVO> selectByPublisher(String boardNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		List<bookVO> BookPublisher = new ArrayList<>();

		try {
			conn = new connectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("select book_n, title, author, publisher, price ");
			sql.append("  from t_book ");
			sql.append(" where instr(publisher, ?)>0");
			sql.append(" order by publisher");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, boardNo);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String book_n = rs.getString("book_n");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String publisher = rs.getString("publisher");
				String price = rs.getString("price");

				bookVO book = new bookVO(book_n, title, author, publisher, price);
				BookPublisher.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}

		return BookPublisher;
	}

}
