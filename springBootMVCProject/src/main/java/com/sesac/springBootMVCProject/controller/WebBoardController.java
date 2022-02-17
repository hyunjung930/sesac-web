package com.sesac.springBootMVCProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesac.springBootMVCProject.repository.FreeBoardRepository;
import com.sesac.springBootMVCProject.vo.FreeBoard;
import com.sesac.springBootMVCProject.vo.PageMaker;
import com.sesac.springBootMVCProject.vo.PageVO;

@Controller
public class WebBoardController {

	@Autowired
	FreeBoardRepository boardRepo;

	@RequestMapping("/webboard/list")		//전체 조회
	public String boardList(PageVO pageVO, Model model) {		//model은 저장하는 역할
		
		if(pageVO == null) pageVO = new PageVO();
		Pageable pageable = PageRequest.of(pageVO.getPage(),pageVO.getSize(), Sort.by("bno").descending());		//0페이지부터 10개의 데이터 불러오기
		
		Page<FreeBoard> result = boardRepo.findAll(pageable);
		
		model.addAttribute("blist" , new PageMaker<>(result));	//전부조회한 애들을 다 페이징 해줘
		
		return "board/list";
	}
	@GetMapping("/webboard/detail") 	//상세조회
	public String boardDetail(Long bno, Model model) {
		
		model.addAttribute("board",boardRepo.findById(bno).get());
		
		return "board/detail";
	}
	
	@PostMapping("/webboard/update") 	//업데이트하기
	public String boardDetailUpdate(FreeBoard board) {
		
		boardRepo.findById(board.getBno()).ifPresent(b->{
			b.setTitle(board.getTitle());
			b.setWriter(board.getWriter());
			b.setContent(board.getContent());
			boardRepo.save(board);
		});
		
		return "redirect:/webboard/list";	//절대경로	:"redirect:/webboard/list"	상대경로 : "redirect: list"
	}
	
	@GetMapping("/webboard/delete") 	//삭제
	public String boardDelete(Long bno) {
		boardRepo.deleteById(bno);
		
		
		return "redirect:list";
	}
	
	@GetMapping("/webboard/insert") 	//삽입 form
	public String boardInsertForm() {
		
		return "board/insertForm";
	}
	
	@PostMapping("/webboard/insert") 	//매개변수가 있음 
	public String boardInsert(FreeBoard board) {
		boardRepo.save(board);
		return "redirect:list";
	}
	
}
