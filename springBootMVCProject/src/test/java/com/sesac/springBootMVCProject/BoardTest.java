package com.sesac.springBootMVCProject;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.sesac.springBootMVCProject.repository.BoardRepository;
import com.sesac.springBootMVCProject.vo.BoardVO;

@SpringBootTest
public class BoardTest {

	
	@Autowired
	BoardRepository bRepo;
	
	@Test
	public void jpqlTest3() {
		bRepo.findByTitle5( 10L, "새싹9").forEach(b->{
			System.out.println(b);
		});;
		
	}
	
	//@Test
	public void jpqlTest2() {
		bRepo.findByTitle3( 10L, "새싹9").forEach(b->{
			System.out.println(b);
		});;
		
	}
	//@Test
	public void jpqlTest1() {
		bRepo.findByTitle2("새싹9", 10L).forEach(b->{
			System.out.println(b);
		});;
		
	}
	//@Test
	public void pagingTest3() {
		
		Pageable paging = PageRequest.of(0, 10,Sort.by("bno").descending());
			
		Page<BoardVO> result = bRepo.findByBnoGreaterThan(10L, paging);
		
		List<BoardVO> blist = result.getContent();
		System.out.println("page size " + result.getSize());
		System.out.println("page getTotalElements " + result.getTotalElements());
		System.out.println("page getTotalPages " + result.getTotalPages());
		System.out.println("다음페이지 정보 : " + result.nextPageable());
		blist.forEach(b->{
			System.out.println(b);
		});
	}
	//@Test
	public void pagingTest2() {
		
		IntStream.range(0, 10).forEach(p->{
			System.out.println("==========" + p + "페이지===========");
			Pageable paging = PageRequest.of(p, 10,Sort.by("bno").descending());
			bRepo.findAll(paging).forEach(b->{
				System.out.println(b);
			});;
		});
	}
	//@Test
	public void pageTest1() {
		String content ="학습";
		Pageable paging = PageRequest.of(2, 5, Sort.by(Sort.Direction.DESC, "bno"));
		bRepo.findByContentContaining(content, paging).forEach(b->{
			System.out.println(b);
		});;
	}
	/*
	 * sql 문장
	 * select * from ( select row_.*, rownum rownum_ from 
	 * ( select boardvo0_.bno as bno1_0_, boardvo0_.content as content2_0_, boardvo0_.regdate as regdate3_0_, boardvo0_.title as title4_0_, boardvo0_.updatedate as updatedate5_0_, boardvo0_.writer as writer6_0_ 
	 * from tbl2_boards boardvo0_ where boardvo0_.content like ? escape ? order by boardvo0_.bno desc ) row_ where rownum <= ?) where rownum_ > ?
	 * 
	 */
	//@Test
	public void test33() {	
		String content ="학습 3";
		Long bno = 10L;
		bRepo.findByContentContainingAndBnoGreaterThanOrderByBnoDesc(content, bno).forEach(b->{
			System.out.println(b);
		});
		}
	
	//@Test
	public void ff() {	// content에 순두부가 있는 애들을 wirter를 desc한다.
		String content = "순두부";
		
		bRepo.findByContentContainingOrderByWriterDesc(content).forEach(board->{
			System.out.println(board);
		});
		}
	
	//@Test
	public void ee() {	//content에 순두부가 있고 writer가 제갈로 시작하는 사람들 찾기 
		String content = "순두부";
		String writer = "제갈";
		
		bRepo.findByContentContainingAndWriterStartingWith(content, writer).forEach(board->{
			System.out.println(board);
		});
		
	
	}
	//@Test
	public void dd() {
		List<BoardVO> blist =  bRepo.findByContentContainingAndBnoGreaterThan("학습 3",50L);
		for(BoardVO board:blist) {
			System.out.println(board);
		}
	}
	
	//@Test
	public void countByWriter() {
		String writer = "user7";
		long count = bRepo.countByWriter(writer);
		System.out.println(count);
	}
	
	//@Test
	public void cc() {
		List<BoardVO> blist =  bRepo.findByContentContaining("학습 3");
		for(BoardVO board:blist) {
			System.out.println(board);
		}
	}
	
	//@Test
	public void bb() {
		List<BoardVO> blist =  bRepo.findByContentLike("%학습 3%");
		for(BoardVO board:blist) {
			System.out.println(board);
		}
	}
	
	//@Test
	public void aa() {
		List<BoardVO> blist =  bRepo.findByBnoBetween(10L,15L);
		for(BoardVO board:blist) {
			System.out.println(board);
		}
	}
	
	//@Test		
	public void findByTitleAndWriter() {
		String title = "새싹수정";
		String writer = "user7";
		bRepo.findByTitleAndWriter(title,writer).forEach(board->{
			System.out.println(board);
		});
	}
	
	//@Test		//SpringBoot학습 0의 내용을 가진 애들만 조회 
	public void findByContent() {
		String content = "SpringBoot학습 0";
		bRepo.findByContent(content).forEach(board->{
			System.out.println(board);
		});
	}
	
	//@Test		//user7이 작성한 게시물만 출력 
	public void findByWriter() {
		String writer = "user7";
		bRepo.findByWriter(writer).forEach(board->{
			System.out.println(board);
		});
	}
	
	//@Test		//새싹 수정이라는 제목을 가진 게시물만 조회
	public void findByTitle() {
		String title = "새싹수정";
		bRepo.findByTitle(title).forEach(board->{
			System.out.println(board);
		});
	}
	
	//@Test
	public void boardCount() {
		Long cnt =bRepo.count();
		System.out.println("전체 건수: " + cnt);
		
	}
	
	//@Test
		public void boardDelete() {
			Long bno =11L;
			bRepo.deleteById(bno);
			
		}
	
	//@Test
	public void boardUpdate() {
		Long bno =10L;
		
		bRepo.findById(bno).ifPresent(board->{
			board.setTitle("긴가민가한...;;");
			board.setWriter("나야나");
			board.setContent("오늘 북창동순두부 먹음");
			bRepo.save(board);	//update set...
		});
		
	}
	//@Test	//10번만 조회하기
	public void test3() {
		int i = 10;
		Long bno =11L;
		
		bRepo.findById(bno).ifPresent(board->{
			System.out.println(board);
		});
		System.out.println("===============================");
		bRepo.findById(bno).ifPresentOrElse(board->{
			System.out.println("잡았다 요놈 " + board);
		},()-> {
			System.out.println(bno + "존재하지 않는 번호입니다만;");
		});
		
		
	}
	
	//@Test	//조회하기(이런게 추세입니다.)
	public void test2() {
		bRepo.findAll().forEach(board->{
			System.out.println(board);
		});
		
	}
	
	//@Test	//삽입
	public void test1() {
		IntStream.rangeClosed(1, 100).forEach(i->{
			
			BoardVO board = BoardVO.builder()
					.title("새싹" + i)
					.writer("user" + i%10)	//10명만 있게 한다
					.content("SpringBoot학습 "+ i%10 )
					.build();
			bRepo.save(board);	//insert 
		});
	}
}
