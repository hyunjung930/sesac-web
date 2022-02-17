package com.sesac.springBootMVCProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesac.springBootMVCProject.repository.BoardRepository;
import com.sesac.springBootMVCProject.vo.BoardVO;
import com.sesac.springBootMVCProject.vo.CarVO;

@RestController	//@Controller + @ResponseBody
public class RestFullController {

	@Autowired
	BoardRepository bRepo;
	
	@RequestMapping("/board/list2")	//조회하기 
	public Iterable<BoardVO> selectByWriter(String writer){	//Iterable:반복자 
		return bRepo.findByWriter(writer);
	}
	
	
	@RequestMapping("/board/list")	//조회하기 
	public Iterable<BoardVO> selectAll(){	//Iterable:반복자 
		return bRepo.findAll();
	}
	
	@RequestMapping("/hello3.do")
	public String test3() {
		return "@RestController에서 return되는 문자";
		
	}
	@RequestMapping("/hello4.do")
	public CarVO test4() {
		CarVO car = CarVO.builder()
				.model("소나타")
				.price(8888)
				.build();
		return car;
		
	}

	@RequestMapping("/hello5.do")
	public List<CarVO> test5() {
		List<CarVO> carlist = new ArrayList<>();
		CarVO car = CarVO.builder()
				.model("소나타")
				.price(8888)
				.build();
		
		carlist.add(car);
		carlist.add(new CarVO("아우디", 2222));
		return carlist;
		
	}

}
