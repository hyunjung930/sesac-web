package com.sesac.springBootMVCProject.vo;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter // 자동생성....setter는 직접구현함
@AllArgsConstructor
@Builder
@ToString
public class PageVO {
	private static final int DEFAULT_SIZE = 10;		//10페이지씩 
	private static final int DEFAULT_MAX_SIZE = 50;		//전체는 50페이지

	int page;
	int size;
	String type;
	String keyword;

	public PageVO() {
		this.page = 1;		//새로운 페이지는 1로 시작
		this.size = DEFAULT_SIZE;
	}

	public void setPage(int page) {
		this.page = page < 0 ? 1 : page;		//page는 set으로 직접 구현했다.
	}

	public void setSize(int size) {
		this.size = size < DEFAULT_SIZE || size > DEFAULT_MAX_SIZE ? DEFAULT_SIZE : size;
	}

	public Pageable makePaging(int direction, String... props) {		//들어오는 방법을 makePaging으로
		//direction asc, desc
		//String... : 컬럼이 여러개기 때문에 ...(배열: 전개연산자)로 만들어준다. 
		Sort.Direction dir = direction == 0 ? Direction.DESC : Direction.ASC;
		return PageRequest.of(this.page - 1, this.size, dir, props);	//자바에서는 0시작이라 -1시작 
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
