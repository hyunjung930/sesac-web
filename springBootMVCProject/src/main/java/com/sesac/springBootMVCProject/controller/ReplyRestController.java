package com.sesac.springBootMVCProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesac.springBootMVCProject.repository.FreeBoardReplyRepository;
import com.sesac.springBootMVCProject.repository.FreeBoardRepository;
import com.sesac.springBootMVCProject.vo.FreeBoard;
import com.sesac.springBootMVCProject.vo.FreeBoardReply;



@RestController
public class ReplyRestController {

	@Autowired
	FreeBoardReplyRepository replyRepo;
	
	@Autowired
	FreeBoardRepository boardRepo;
	
	
	@PostMapping("/replies/add/{bno}")		//댓글 추가
	public List<FreeBoardReply> insert(
			@RequestBody FreeBoardReply reply, @PathVariable("bno") Long boardNo){
		System.out.println(reply);
		System.out.println("보드번호:" + boardNo);
		
		FreeBoard board =boardRepo.findById(boardNo).orElse(null);
		if(board==null) return null;
		
		reply.setBoard(board);
		replyRepo.save(reply);
		
		
		List<FreeBoardReply> replyList = replyRepo.findByBoard(board);
		return replyList;
	}

	@RequestMapping("/replies/list/{bno}")		//댓글 조회
	//RequestMapping 형식
	public List<FreeBoardReply> selectAllByBoard(@PathVariable("bno") Long boardNo) {
		FreeBoard board = boardRepo.findById(boardNo).orElseThrow(null);	//댓글 번호가 아닌것은 null값으로 넘긴다
		if(board==null) return null;
		List<FreeBoardReply> replyList = replyRepo.findByBoard(board);
		return replyList;
	}
}
