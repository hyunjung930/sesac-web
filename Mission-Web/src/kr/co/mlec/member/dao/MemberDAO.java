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
				String email_id = rs.getString("email_id");
				String email_domain = rs.getString("email_domain");
				String tel1 = rs.getString("tel1");
				String tel2 = rs.getString("tel2");
				String tel3 = rs.getString("tel3");
				String post = rs.getString("post");
				String basic_addr = rs.getString("basic_addr");
				String detail_addr = rs.getString("detail_addr");
				String type = rs.getString("type");
				String reg_date = rs.getString("reg_date");

				MemberVO member = new MemberVO(id, name, password, email_id, email_domain, tel1, tel2, tel3, post,
						basic_addr, detail_addr, type, reg_date);

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
			sql.append("insert into tbl_member(id, name, password, email_id, email_domain, tel1, tel2, tel3, post, basic_addr, detail_addr, type, reg_Date ");
			sql.append(" values( ?, ?, ?, ?, ?, ?, ?,?,?,? , ?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}
