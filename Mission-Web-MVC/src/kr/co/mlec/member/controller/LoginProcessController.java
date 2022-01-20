package kr.co.mlec.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.controller.Controller;
import kr.co.mlec.member.service.LoginService;
import kr.co.mlec.member.vo.LoginVO;

public class LoginProcessController implements Controller {
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	
		LoginVO loginVO = new LoginVO(id, password);
		
		LoginService service = new LoginService();
		LoginVO userVO = service.login(loginVO);
		
		String url = "";
		if(userVO == null) {
			//로그인 실패
			url = "/login.do";
		}else {
			// 로그인 성공(인덱스로 간다)
			url = "";	//contextPath가 날라가서 / 안붙여도 됌
			//session.setAttribute("userVO", userVO);	// session객체를 몰라 세션 오류
			HttpSession session = request.getSession();	//request에서 getSession으로 얻어온다.
			session.setAttribute("userVO", userVO);
		}
		return "redirect: " + url;
	}
	
	/*
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	
		LoginVO loginVO = new LoginVO(id, password);
		
		LoginService service = new LoginService();
		LoginVO userVO = service.login(loginVO);
		
		if(userVO == null) {
			//로그인 실패
			
		}else {
			// 로그인 성공(인덱스로 간다)
			
		}
		return "aaa.jsp";
	}*/

}
