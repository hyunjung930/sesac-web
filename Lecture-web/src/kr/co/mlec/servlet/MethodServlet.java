package kr.co.mlec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet{

	//http://loclahost:9999/Lexture-web/method?id=aaa
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getMethod();
		String uri = request.getRequestURI();
		String id = request.getParameter("id");
		
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();		//I/O 입력
		
		out.println("<HTML>");		
		out.println("	<HEAD>");		
		out.println("		<TITLE>메소드 호출결과</TITLE>");	
		out.println("	<HEAD>");		
		out.println("	<BODY>");		
		out.println("==============================================<br>");		
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;출 력 결 과 <br>");		
		out.println("==============================================<br>");		
		out.println("요청 메소드 : " + method + "<br>");		
		out.println("요청 URI : " + uri + "<br>");		
		out.println("파라미터 (ID)" + id + "<br>");		
		out.println("==============================================<br>");		
		out.println("	</BODY>");		
		out.println("==============================================<br>");		//클라이언트에게 전달
		out.println("</HTML>");		
		
		out.flush();
		out.close();
		
		
		System.out.println("요청메소드 :"  + method);
		System.out.println("요청 URI : " + uri); 
		System.out.println("ID : " + id);
		 
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		String method = request.getMethod();
		String uri = request.getRequestURI();
		String id = request.getParameter("id");

		System.out.println("요청메소드 :"  + method);
		System.out.println("요청 URI : " + uri); 
		System.out.println("ID : " + id);
		
	}

}
