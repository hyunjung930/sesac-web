package com.sesac.springBootMVCProject.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

//@Getter
//@Setter
////@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Builder
//@RequiredArgsConstructor


@Data
@Builder
@AllArgsConstructor
public class CarVO {

	@NonNull
	String model;
	int price;
	
	
}
