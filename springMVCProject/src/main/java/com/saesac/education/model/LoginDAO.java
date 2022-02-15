package com.saesac.education.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sesac.vo.LoginVO;

@Repository
public class LoginDAO {
	
	@Autowired
	DataSource ds;
	
/**
 * 로그인 서비스
 * @param loginVO ( 사용자가 입력한 id, password 저장)
 * @return userVO (id, password로 조회된 회원 정보)
 * 			조회된 정보가 없다면 null 반환
 */
	
	public LoginVO login(LoginVO loginVO) {
		
		LoginVO userVO = null;	// 
		
		StringBuilder sql = new StringBuilder();	
		sql.append("select id, password, type ");
		sql.append("	from tbl_member ");
		sql.append("where id =? and password = ? ");
		
		try(
			Connection conn = ds.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
				
				) {	//1.7버전의 for문
				pstmt.setString(1, loginVO.getId());
				pstmt.setString(2, loginVO.getPassword());
		

				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) { //아이디가 안맞거나 맞는거 하나니까 0~1개
					userVO = new LoginVO();
					//String id = rs.getString("id");
					//userVO.setId(id);
					userVO.setId(rs.getString("id"));
					userVO.setPassword(rs.getString("password"));
					userVO.setType(rs.getString("type"));
					
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userVO;
	}
	
}
