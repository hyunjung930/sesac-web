package com.sesac.springBootMVCProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.sesac.springBootMVCProject.repository.FreeBoardReplyRepository;
import com.sesac.springBootMVCProject.repository.FreeBoardRepository;
import com.sesac.springBootMVCProject.vo.FreeBoard;
import com.sesac.springBootMVCProject.vo.FreeBoardReply;

@SpringBootTest
public class FreeBoardReplyTest {

	@Autowired
	FreeBoardRepository boardRepo;
	@Autowired
	FreeBoardReplyRepository replyRepo;
	
	
	@Test	//보드 전부 조회
	public void test9() {
		boardRepo.findAll().forEach(b->{
			System.out.println(b);
		});
	}
	@Test	//페이징 하기
	public void test8() {
		
		Pageable paging = PageRequest.of(0, 5, Sort.by("bno").descending());	//한페이지에 5건씩 출력
		
		Page<FreeBoard> result = boardRepo.findByWriter("오트밀크", paging);
		System.out.println("size : " +result.getSize());
		System.out.println("totalElements: " + result.getTotalElements());
		System.out.println("totalPages : " + result.getTotalPages());
		System.out.println("next page : " + result.nextPageable());
		
		List<FreeBoard> blist =result.getContent();
		blist.forEach(b->{
			System.out.println(b);
		});
	}
	@Test//건수 가져오기
	public void test7() {
		//Board정보와 댓글의 건수를 가져오기
		FreeBoard board = boardRepo.findById(281L).get();
		System.out.println(board);
		System.out.println("댓글의 개수 : " + board.getReplies().size() +"개");
		board.getReplies().forEach(reply->{
			System.out.println(reply);
		});
		
	}
	
	@Test	//특정 보드에 대한 댓글 조회
	public void test6() {
		FreeBoard board = boardRepo.findById(281L).get();
		replyRepo.findByBoard(board).forEach(b->{
			System.out.println(b.getBoard().getWriter() + "작성자의 댓글 정보 ==>" + b);
		});
	}
	
	//@Test
	public void test5() {
		//FreeBoardReply에 삽입(insert)
		FreeBoard board = boardRepo.findById(281L).get();
		FreeBoardReply reply = FreeBoardReply.builder()
				.reply("금천로 70")
				.replyer("신혜")
				.board(board)
				.build();
		replyRepo.save(reply);
	}
	
	//@Test	// 타이틀로 조회
	public void test4() {
		boardRepo.findByTitleContaining("목").forEach(b->{
			System.out.println(b);
		});
	}
	
	//@Test	// 보드에 추가 됐는지 확인
	public void test3() {
		boardRepo.findAll().forEach(b->{
			System.out.println(b);
		});
	}
	//@Test
	public void test2() {
		//board만 추가
		IntStream.rangeClosed(1, 5).forEach(i->{
			FreeBoard board = FreeBoard.builder()
					.title("목요일" + i)
					.writer("오트밀크")
					.content("비대면 수업하고싶어요" + i)
					.build();
			boardRepo.save(board);
		
		});
	}
	
	//@Test
	public void test1() {
		System.out.println("-----board 추가....reply도 추가------");
		
		IntStream.rangeClosed(1, 5).forEach(i->{
		
		
			FreeBoard board = FreeBoard.builder()
					.title("수요일" + i)
					.writer("jung")
					.content("집에 가고싶어요" + i)
					.build();
			
			List<FreeBoardReply> replies = new ArrayList<>();
			for(int j=1; j<=3 ; j++) {
				replies.add(FreeBoardReply.builder()
						.reply("내가 먼저")
						.replyer("bob" + j)
						.board(board)
						.build());
			}
			board.setReplies(replies);
			boardRepo.save(board);
			
		});
	}
}
