package kr.co.mlec.day02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set : 순서(X), 중복(X)
 	  - HashSet
 	  - TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		boolean bool = set.add("one");
		System.out.println(bool ? "삽입성공" : "삽입실패");
		
		System.out.println("원소의 총개수 : " + set.size());
		
		// 1. 1.5버전의 for문이용
		System.out.println("< 전체 데이터 출력 - 1 >");
		for(String str : set) {
			System.out.println(str);
		}
		
		// 2. toArray() 메소드 이용
		System.out.println("< 전체 데이터 출력 - 2 >");
		Object[] arr = set.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
//		for(int i = 0; i < arr.length; i++) {
//			String str = (String)arr[i];
//			System.out.println("[" + str + "], length : " + str.length());
//		}
		
		/*
		 	Iterator(순환자) 주요메소드
		 	 - hasNext() : 다음데이터의 존재여부 판단
		 	 - next() : 데이터 접근
		 */
		System.out.println("< 전체 데이터 출력 - 3 >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
	}
	
}











