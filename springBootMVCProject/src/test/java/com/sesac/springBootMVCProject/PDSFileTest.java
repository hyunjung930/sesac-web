package com.sesac.springBootMVCProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.sesac.springBootMVCProject.repository.PDSBoardRepository;
import com.sesac.springBootMVCProject.repository.PDSFileRepository;
import com.sesac.springBootMVCProject.vo.PDSBoard;
import com.sesac.springBootMVCProject.vo.PDSFile;

import lombok.extern.java.Log;

@Commit
@SpringBootTest
@Log
public class PDSFileTest {

	@Autowired
	PDSBoardRepository boardRepo;
	@Autowired
	PDSFileRepository fileRepo;
	
	@Test
	public void test6() {
		log.info("----------OneToMany연습:One은 수정하고 Many는 추가하고자한다.---------");
		boardRepo.findById(156L).ifPresentOrElse(b->{
			System.out.println(b);
			System.out.println(b.getFiles2().size() + "건");
			System.out.println("======수정========");
			b.setPname("따듯한 콜드브루");
			b.setPwriter("바껴줘라제발!");
			b.getFiles2().add(PDSFile.builder().pdsfilename("곧 45분.png").build());
			boardRepo.save(b);
		}, ()->{
			System.out.println("해당board는 존재하지 않습니다.");
		});
	}
	//@Transactional
	//@Test
	public void test5() {
		boardRepo.updatePDSFile(160L, "오늘 점심 육회비빔밥.jpg");
		boardRepo.updatePDSFile(161L, "내일 점심 육회비빔밥.jpg");
		boardRepo.updatePDSFile(162L, "모레 점심 육회비빔밥.jpg");
		boardRepo.updatePDSFile(164L, "글피 점심 육회비빔밥.jpg");
		boardRepo.updatePDSFile(165L, "다음주 점심 육회비빔밥.jpg");
	}
	
	//@Test
	public void test4() {
		log.info("===============OneToMany 연습: 삭제============");
		fileRepo.deleteById(130L);
		fileRepo.deleteById(150L);
		fileRepo.deleteById(167L);
		fileRepo.deleteById(168L);
		fileRepo.deleteById(169L);
	
	}
	//@Test		//아이디당 파일이 몇개씩 있는지 출력
	public void test3() {
		log.info("===============OneToMany 연습: Eager, Lazy============");
		boardRepo.findAll().forEach(b->{	
			System.out.println(b +"==>" + b.getFiles2().size());
			//System.out.println(b);
		});
	}
	
	
	//@Test
	public void test2() {
		log.info("===============OneToMany 연습: Eager============");
		boardRepo.findAll().forEach(b->{
			System.out.println(b);
		});
	}
	
	//@Test
	public void test1() {
	
		log.info("===============OneToMany============");
		IntStream.rangeClosed(1, 10).forEach(i->{
			
			List<PDSFile> fileList = new ArrayList<>();
			IntStream.range(100, 106).forEach(j->{
				fileList.add(PDSFile.builder().pdsfilename("파일" + i +"-"+ j +".jpg").build());
			});
			
			PDSBoard board = PDSBoard.builder()
					.pname("새싹"+i)
					.pwriter("독고"+ i%2)		//2명이 여러개의 보드를 넣었다.
					.files2(fileList)
					.build();
			boardRepo.save(board);
		});
		
	}
}
