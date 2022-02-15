package com.saesac.education.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.saesac.education.model.BoardService;

import kr.co.sesac.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService bService;
	
	@RequestMapping("/board/list.do")
	//@ResponseBody : 응답문서에 데이터 보내기 
	public String boardList(Model model, HttpServletRequest request,
			@RequestParam(value= "keyword", required = false) String keyword,
			@RequestParam(value= "contents", required = false)String contents ) {
		System.out.println(keyword +"----->" + contents);
		Map<String,?> map = RequestContextUtils.getInputFlashMap(request);	//map 
		
		if(map !=null) {	//map이 null이 아니면(map에 값이 있는 것으로 새글에 작성된 데이터가 들어갔을 때) 메세지 나오게 해줌
			model.addAttribute("message", map.get("message"));
		}
		model.addAttribute("list",bService.selectAllBoard(keyword,contents));	//
		model.addAttribute("boardCnt",bService.boardCnt());
		
		if(keyword == null) return "board/list";	//화면이 다 비어있을 때는 이렇게 
		return "board/list_table";			// 아니면 list_table로 간다 
	}
	
	//상세보기, 조회수
	@RequestMapping("/board/detail.do")
	public String detail(int no, Model model) {
		
		bService.viewCnt(no);
		
		model.addAttribute("fileList",bService.selectFileByNo(no));
		model.addAttribute("board",bService.selectBoardByNo(no));
		
		
		return "board/detail";
	}
	
	@RequestMapping("/board/writeForm.do")
	public String formView( Model model) {
		
		//model.addAttribute("userVO",l);
		return "board/writeForm";
	}
	//새글 등록
	@RequestMapping(value ="/board/write.do", method = RequestMethod.POST)
	public String insert(BoardVO board, RedirectAttributes attr  ) {
		
		int result = bService.insertBoard(board);
		attr.addFlashAttribute("message", result>0?"입력성공":"입력실패");
		return "redirect:/board/list.do";
	}
	
	//수정하기(폼)
	@RequestMapping(value ="/board/update.do"
			, method = RequestMethod.GET)
	public String updateForm(int no, Model model  ) {
		
		model.addAttribute("board",bService.selectBoardByNo(no));
		return "board/update";
	}
	//수정하기(실제)
	@RequestMapping(value ="/board/update.do"
			, method = RequestMethod.POST)
	public String updateProcess(BoardVO board, RedirectAttributes attr  ) {
		
		int result = bService.insertBoard(board);
		attr.addFlashAttribute("message", result>0?"수정성공":"수정실패");
		
		return "redirect:/board/list.do";
	}
	
	//삭제하기
		@RequestMapping(value ="/board/delete.do"
				, method = RequestMethod.GET)
		public String delete(int no, RedirectAttributes attr  ) {
			
			int result = bService.deleteByNo(no);
			attr.addFlashAttribute("message", result>0?"삭제 성공":"삭제 실패");
			
			return "redirect:/board/list.do";
		}
	
}
