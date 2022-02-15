package com.saesac.education.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sesac.vo.MemberVO;


@Service
public class LoginService {
	
	@Autowired
	MemberDAO_Mybatis mdao;
	
	public List<MemberVO> selectAll(){
		return mdao.selectAll();
	}
	
	public void signUp(MemberVO member){
	
	}
}
