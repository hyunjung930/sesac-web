package com.sesac.springBootMVCProject;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sesac.springBootMVCProject.vo.CarVO;

@SpringBootTest
class SpringBootMvcProjectApplicationTests {

	
	@Test	//@RequiredArgsConstructor사용해서 출력하는 예시
	public void test3() {
		
		IntStream.range(1, 10).forEach(i->{
			System.out.println(i +"-----------------------");
			CarVO car = CarVO.builder().model("bbb").price(9999).build();	
			CarVO car2 = CarVO.builder().model("bbb").price(9999).build();	
			System.out.println(car);
			System.out.println(car.equals(car2));
		});
		
	}
	
	//@Test	//요즘 추세
	public void test2() {
		
		IntStream.range(1, 10).forEach(i->{
			System.out.println(i +"-----------------------");
			CarVO car = CarVO.builder()	//값을 준적이 없어 디폴트로 만들어짐
					.model("자동차" + i)
					.build();	
			System.out.println(car);
		});
		
	}
	
	//@Test
	void contextLoads() {
	}
	
	//@Test
	public void test1() {
		//lombok 연습하기
		/*
		 * CarVO car1 = new CarVO(); //CarVO car2 = new CarVO("제네시스",1000);
		 * car1.setModel("car1 모델"); car1.setPrice(1000); System.out.println(car1);
		 */
		
		CarVO car2 =new CarVO("car2 모델", 2000);
		System.out.println(car2);
		
		CarVO car3 = CarVO.builder()
				.model("Car3 모델")
				.price(5000)
				.build();
		System.out.println(car3);
	}

}
