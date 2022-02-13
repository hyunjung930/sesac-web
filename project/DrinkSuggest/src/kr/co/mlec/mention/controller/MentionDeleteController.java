package kr.co.mlec.mention.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.controller.Controller;
import kr.co.mlec.mention.service.MentionService;

public class MentionDeleteController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		  int commentNo = Integer.parseInt(request.getParameter("commentNo"));	
		
		  MentionService service = new MentionService();
		  service.deleteMention(commentNo);
		
		 return "/jsp/board/replyResult.jsp";
	}
}

