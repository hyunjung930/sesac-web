package kr.co.mlec.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.member.vo.MemberVO;
import kr.co.mlec.util.JDBCClose;
import kr.co.mlec.util.connectionFactory;

public class MemberDAO {
	/*
	 * /** 전체회원 조회
	 */
	public List<MemberVO> selectAllmember() {

		List<MemberVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select id, name, password, email_id, email_domain, tel1, tel2, tel3, post, basic_addr, detail_addr, type, reg_Date ");
			sql.append(" from tbl_member ");
			sql.append(" order by no desc ");
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String emailId = rs.getString("email_id");
				String emailDomain = rs.getString("email_domain");				
				String tel1 = rs.getString("tel1");
				String tel2 = rs.getString("tel2");
				String tel3 = rs.getString("tel3");
				String post = rs.getString("post");
				String basicAddr = rs.getString("basic_addr");
				String detailAddr = rs.getString("detail_addr");
				String type = rs.getString("type");
				String regDate = rs.getString("reg_date");

				MemberVO member = new MemberVO(id, name, password, emailId, emailDomain, tel1, tel2, tel3, post,
						basicAddr, detailAddr, type, regDate);

				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		return list;
	}
/**
 * 회원등록
 */
	public void insertMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_member(id, name, password, email_id, email_domain, tel1, tel2, tel3, post, basic_addr, detail_addr ");
			sql.append(" values( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			pstmt.setString(4, member.getEmail_id());
			pstmt.setString(5, member.getEmail_domain());
			pstmt.setString(6, member.getTel1());
			pstmt.setString(7, member.getTel2());
			pstmt.setString(8, member.getTel3());
			pstmt.setString(9, member.getPost());
			pstmt.setString(10, member.getBasic_addr());
			pstmt.setString(11, member.getDetail_addr());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(pstmt, conn);
		}
	}
	/**
	 * 회원 조회
	 */
	public MemberVO selectMemberByNo(String memberNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		MemberVO member = null;
		
		try {
			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select id, name, password, email_id, email_domain, tel1, tel2, tel3, post, basic_addr, detail_addr, type, reg_Date ");
			sql.append(" from tbl_member ");
			sql.append(" where id = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, memberNo);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String emailId = rs.getString("email_id");
				String emailDomain = rs.getString("email_domain");
				String tel1 = rs.getString("tel1");
				String tel2 = rs.getString("tel2");
				String tel3 = rs.getString("tel3");
				String post = rs.getString("post");
				String basicAddr = rs.getString("basic_addr");
				String detailAddr = rs.getString("detail_addr");
				String type = rs.getString("type");
				String regDate = rs.getString("reg_date");
				
				member = new MemberVO(id, name, password, emailId, emailDomain, tel1, tel2, tel3, post,
						basicAddr, detailAddr, type, regDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(pstmt, conn);
		}return member;
	} 
/**
 * 회원 수정(이름, 비번, 이메일 아이디, 도메인, 번호123, 우편번호, 기본주소, 상세주소)
 */
	public void updateMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new connectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("update tbl_member ");
			sql.append("	set name = ?, password = ?, email_id = ?, email_domain = ?, tel1 = ?, tel2 = ?, tel3 = ?, post = ?, basic_addr =?, detail_addr =? ");
			sql.append(" where id = ? ");
			
			pstmt.setString(11, member.getId());
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getEmail_id());
			pstmt.setString(4, member.getEmail_domain());
			pstmt.setString(5, member.getTel1());
			pstmt.setString(6, member.getTel2());
			pstmt.setString(7, member.getTel3());
			pstmt.setString(8, member.getPost());
			pstmt.setString(9, member.getBasic_addr());
			pstmt.setString(10, member.getDetail_addr());
			
			pstmt.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}
