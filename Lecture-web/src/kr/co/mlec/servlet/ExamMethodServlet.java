package kr.co.mlec.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/examMethod")
@WebServlet(urlPatterns = {"/examMethod"})
public class ExamMethodServlet extends HttpServlet{

	
	//http://localhost:9999/Lecture-web/examMethod?name=hong&hobby=reading&hobby=movie
	//어노테이션으로 만들어줌
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("name");
	//	String hobby =request.getParameter("hobby");		//취미는 취미 하나만 가져온다 취미 여러개이면
		String [] hobby = request.getParameterValues("hobby");	//여러개의 취미들 
		
		System.out.println("name: " + name);
		System.out.println("hobby: " + Arrays.toString(hobby));
		}

}
