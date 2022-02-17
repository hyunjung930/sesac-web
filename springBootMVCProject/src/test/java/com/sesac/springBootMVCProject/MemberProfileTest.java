
package com.sesac.springBootMVCProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sesac.springBootMVCProject.repository.MemberRepository;
import com.sesac.springBootMVCProject.repository.ProfileRepository;
import com.sesac.springBootMVCProject.vo.MemberRole;
import com.sesac.springBootMVCProject.vo.MemberVO;
import com.sesac.springBootMVCProject.vo.ProfileDTO;

import lombok.extern.java.Log;



@SpringBootTest
@Log
public class MemberProfileTest {

	@Autowired
	MemberRepository mRepo;
	
	@Autowired
	ProfileRepository pRepo;
	
	@Test
	public void test6() {
		List<Object[]> mylist = mRepo.getProfileCountByMember2();
		mylist.forEach(row->{
			System.out.println(Arrays.toString(row));
			for(Object obj:row) {
				System.out.println(obj + "=========");
				System.out.println(row[0] + "--->" + row[1]);
			}
		});
		
	}
	
	//@Test
	public void test5() {
		MemberVO member  = mRepo.findById("aaa3").get();
		List<ProfileDTO> plist = pRepo.findByMember(member);
		plist.forEach(p->{
			//System.out.println(p);
			log.info(p.toString());
		});
	}
	
	
	@Test
	public void test4() {
		//특정멤버 조회
		System.out.println("-특정멤버 조회------------------------");
		MemberVO member = mRepo.findById("aaa3").get();
		System.out.println(member);
		//특정프로파일 조회... 멤버 정보가 온다. 
		System.out.println("-특정프로파일 조회------------------------");
		ProfileDTO profile =pRepo.findById(111L).get();
		System.out.println(profile);
		System.out.println("프로파일의 멤버정보만 보기: " + profile.getMember());
	}
	
	//@Test		//프로파일 넣기...
	public void test3() {
		//MemberVO member = mRepo.findById("aaa3").orElseThrow();
		MemberVO member = mRepo.findById("aaa2").get();
		IntStream.rangeClosed(1, 3).forEach(i->{
			ProfileDTO profile = ProfileDTO.builder()
					.fname("내 사진" + i)
					.currentYn(i==10?true:false)
					.member(member)
					.build();
			pRepo.save(profile);
		});
	}
	
	//@Test		//테이블 생성뒤 프로파일에 데이터 넣기 
	public void test2() {
		
		IntStream.rangeClosed(1, 5).forEach(i->{
			MemberVO member = MemberVO.builder()
					.mid("aaa" + i)
					.mname("최" + i)
					.mpassword("1234")
					.mrole(i%2==0?MemberRole.Manager:MemberRole.User)
					.build();
			mRepo.save(member);
		});
	}
	
	
	//@Test
	public void test1() {
		MemberVO m1 = MemberVO.builder().mid("gg").mname("독고").build();
		MemberVO m2 = MemberVO.builder().mid("gg").mname("독고").build();
		System.out.println(m1==m2);	// 주소비교
		System.out.println(m1.equals(m2));	//내용비교(mid가 같으면 true로)
	}
}
