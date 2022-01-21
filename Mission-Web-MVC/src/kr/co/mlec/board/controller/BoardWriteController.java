package kr.co.mlec.board.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardFileVO;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.controller.Controller;
import kr.co.mlec.util.SesacFileNamePolicy;

public class BoardWriteController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String saveFolder = "D:\\Lecture\\web-workspace\\Mission-Web-MVC\\WebContent\\upload";
		
		
		MultipartRequest multi = new MultipartRequest
	            (request, saveFolder,1024*1024*3, "utf-8",new SesacFileNamePolicy());
		// 요청객체로 날라오는 데이터들을 파싱할거야 
				// 최대 3메가로 텍스트 파일 utf으로 인코딩하고 SesacFile~ 이걸로 이름을 새거로 만들어준다.  
				//저장 장치는 원래 이클립스 워크 폴더이지만 deploy판이 아니라
		
		// 제목, 작성자, 내용 추출-->tbl_board 저장
		String title = multi.getParameter("title");			//multi를 이용해서 사용힌디.
		String writer = multi.getParameter("writer");
		String content = multi.getParameter("content");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		//service.insertBoard(board);
		
		//multi.getFile("attachfile1");
		//multi.getFile("attachfile2");
		
		//첨부 파일 추출(file_ori_name, file_save_name, file_size) --> tbl_board_file 저장
		
		List<BoardFileVO> fileList = new ArrayList<>();
		
		
		
		Enumeration<String> files = multi.getFileNames();		//맨 처음부터 끝까지
		while(files.hasMoreElements()) {
			String fileName = files.nextElement();
			//System.out.println(fileName);
			
			File file = multi.getFile(fileName);		//파일 갯수가 많을 떄 이렇게 가져간다.
			// File 객체는 file이 어디에 있고 크기가 어떻고 실행하는건지 읽는건지 알아볼 수 있는 객체
			
			if(file != null) {	// 오리지널 네임과 
				String fileOriName = multi.getOriginalFileName(fileName);		//파일 오리지널 네임알기
				String fileSaveName = multi.getFilesystemName(fileName);	//파일 리네임 네임알기 
				int fileSize = (int)file.length();	//파일 크기 알기
				
				
				BoardFileVO fileVO = new BoardFileVO();
				fileVO.setFileOriName(fileOriName);
				fileVO.setFileSaveName(fileSaveName);
				fileVO.setFileSize(fileSize);
				
				fileList.add(fileVO);
			}
		}
		BoardService service = new BoardService();
		service.insertBoard(board,fileList);
		
		return "redirect:/board/list.do";
	}

	
}
