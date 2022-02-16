package com.saesac.education.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sesac.vo.MemberVO;


@Service
public class MemberService {
	
	@Autowired
	MemberDAO_Mybatis mdao;
	
	public List<MemberVO> selectAll(){
		return mdao.selectAll();
	}
	
	public MemberVO selectById(String id) {
		return mdao.selectById(id);
	}
	// 추가
	public int insertMember(MemberVO member) {
		return mdao.insertMember(member);
	}
	// 수정
	public int updateMember(MemberVO member) {
		return mdao.updateMember(member);
	}
	// 삭제
	public int deleteMember(String id) {
		return mdao.deleteMember(id);
	}
	
}
