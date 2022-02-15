package com.saesac.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sesac.vo.BookVO;

@Controller
@RequestMapping("/test") // type level에 요청주소 작성하기
// 공통적으로 주소가 있을 때 RequestMapping을 써준다.
public class HelloController {

	@RequestMapping("/hello1")	// method level에 요청주소 작성하기
	public String hello1() {

		System.out.println("Hello1요청");

		return "helloPage1"; // page로 forward 된다.
		/***
		 * 
		 * RequestDispatcher rd =
		 * request.getRequestDispacher("/WEB-INF/views/helloPage1.jsp")
		 * rd.forward(request, response) /WEB-INF/views/helloPage1.jsp
		 */
	}
	// RequestMapping: URL 을 컨트롤러의 메서드와 매핑할 때 사용하는 어노테이션
	@RequestMapping("/hello2")
	public ModelAndView Test2() {

		System.out.println("Hello2요청");
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "SprinfFrameWork학습");
		mv.addObject("price", "5000");
		mv.addObject("book", new BookVO(10, "java", "박명수", null, null));

		mv.setViewName("helloPage1");// page로 forward 된다.
		return mv;

	}
	
	@RequestMapping({"/hello3","/hello4.do","/hello4.test"})	//배열의 형식으로 줌... 
	public String hello3(Model model) {
		model.addAttribute("myname", "하하");
		model.addAttribute("phone", "010-1111-1111");
		return "helloPage3";	// 사용빈도가 더 높음.
	}
	
	@RequestMapping({"/hello5"})	//hello5.~
	public void hello5(Model model) {
		model.addAttribute("myname", "하하");
		model.addAttribute("phone", "010-1111-1111");
		///WEB-INF/views/test/hello5.jsp
	}
	
	//로그인 창 만들기
	//method = RequestMethod.GET생략가능(디폴트가 get)
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String loginGet() {
		
		return "user/loginForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String loginPost(String userid, String userpass, Model model) {
		
		System.out.println("userid: " + userid);
		System.out.println("userpass: " + userpass);
		
		if(userid == null) {
			model.addAttribute("message", "로그인아이디가 없습니다." );//model.addAttribute( 변수이름, 값)
		}else {
			model.addAttribute("message", "로그인 성공하였습니다." );
		}
		return "user/loginResult";
	}
	
	@RequestMapping(value = {"helloParam.do"},
			params = {"userid=sesac", "userpass","!email"},
			method = RequestMethod.GET)
	public String helloParam(Model model, String userid, String userpass) {

		System.out.println("userid: " + userid);
		System.out.println("userpass: " + userpass);
		
		model.addAttribute("message", "helloParam.do 로그인 성공하였습니다." );

		return "user/loginResult";
	}
	
}