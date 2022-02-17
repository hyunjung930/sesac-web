package com.sesac.springBootMVCProject.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sesac.springBootMVCProject.vo.FreeBoard;

//Wrapper class
// int -> Integer
//long ->Long
//PagingAndSortingRepository ==> 기본에 다음이 제공된다. findAll(),findAll(Pageable paging);
//CrudRepository ==> 기본에 다음이 제공된다. boardRepo.findAll();
public interface FreeBoardRepository extends PagingAndSortingRepository<FreeBoard, Long> {

	List<FreeBoard> findByTitleContaining(String title);	//타이틀로 찾기
	
	//특정작성자가 작성한 Board정보를 페이지정보와 한께 return하기
	//List면 다음페이지 및 여러가지 페이지에 대한 내용을 가져올 수 없다.
	Page<FreeBoard> findByWriter(String writer, Pageable paging);
}
