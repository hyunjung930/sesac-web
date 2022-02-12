package kr.co.mlec.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapMain02 {

	public static void main(String[] args) {
		
		
		Map<String, String> members = new HashMap<>();
		members.put("aaa", "1111");
		members.put("bbb", "2222");
		members.put("ccc", "3333");
		members.put("ddd", "4444");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 비밀번호 변경서비스 >");
		System.out.print("회원님의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(!members.containsKey(id)) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("변경서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!members.get(id).equals(password)) {
			System.out.println("패스워드가 일치하지 않습니다");
			System.out.println("변경서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		members.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		System.out.println("< 회원 정보 출력 >");
		System.out.println("------------------------------");
		System.out.println("\tID\tPASSWORD");
		System.out.println("------------------------------");
		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println("\t" + key + "\t" + members.get(key));
		}
		System.out.println("------------------------------");
		
		
	}
	
	
}
/*
class Member {
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password
	}
}


List<Member> members = new ArrayList<>();
members.add(new Member("aaa", "1111"));
members.add(new Member("bbb", "2222"));
members.add(new Member("ccc", "3333"));
members.add(new Member("ddd", "4444"));

*/






