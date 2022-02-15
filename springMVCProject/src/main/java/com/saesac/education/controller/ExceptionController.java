package com.saesac.education.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;
//2.@ControllerAdice를 이용해서 전역 Exception처리

@ControllerAdvice	//전역 Exception
public class ExceptionController {

	
//	@ExceptionHandler(NoHandlerFoundException.class)
//	public String handler500(HttpServletRequest request, Model model) {
//			model.addAtrribute("aaa","문법오류");
	//		return "error/errorPage404";
//	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String handler404(HttpServletRequest request, Model model) {
		model.addAttribute("message","존재하지 않는 페이지 입니다.");
		model.addAttribute("url", request.getRequestURI());
		return "error/errorPage404";
	}
}
