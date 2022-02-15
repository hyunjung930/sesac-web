package com.saesac.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.saesac.education.model.MemberService;

import kr.co.sesac.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService mService;

	@GetMapping("/member/list") // get으로 요청했다
	// 멤버 조회
	public String memberlist(Model model) {

		model.addAttribute("memberList", mService.selectAll());
		return "member/memberList";
	}
	
	@GetMapping("/member/detail")
	//상세조회
	public String memberDetail(String mid, Model model) {

		model.addAttribute("member", mService.selectById(mid));
		return "member/detailMember";
	}
	
	@GetMapping("/member/update")
	//수정
	public String memberUpdate(MemberVO member, Model model) {

		mService.updateMember(member);
		return "redirect:/member/list";
	}
	
	@GetMapping("/member/insert")
	//추가
	public String memberinsert(String mid, Model model) {

		model.addAttribute("member",mService.selectById(mid));
		return "/member/addMemberForm";
		
	}@GetMapping("/member/delete")
	//추가
	public String memberinsertPost(MemberVO member, Model model) {

		mService.insertMember(member);
		return "redirect:/member/list";
	}
}
