package kr.co.mlec.day02;

import java.util.ArrayList;
import java.util.List;

/*
 * List : 순서(O), 중복(O)
 *   - ArrayList
 *   - LinkedList
 *   
 * Wrapper class (기본자료형 -> 참조자료형)
 *   기본자료형		참조자료형
 *   boolean		Boolean
 *   char			Character
 *   byte			Byte
 *   short			Short
 *   int 			Integer
 *   long			Long
 *   float			Float
 *   double			Double
 * 
 * 
 * class Integer {
 * 	private int data;
 * }
 */

public class ListMain {
	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		
		System.out.println("원소의 총개수 : " + list.size());
		
		System.out.println("0번지 위치한 데이터 : " + list.get(0));
		
		String removeStr = list.remove(0);
		
		System.out.println("0번지 삭제 데이터 : " + removeStr);
		
		System.out.println("0번지 삭제 후 0번지 위치한 데이터 : " + list.get(0));
		
		boolean bool = list.contains("three");
		if(bool) {
			System.out.println("three는 존재합니다");
		} else {
			System.out.println("three는 존재하지 않습니다");
		}
		
		if(list.remove("three")) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
		bool = list.contains("three");
		if(bool) {
			System.out.println("three는 존재합니다");
		} else {
			System.out.println("three는 존재하지 않습니다");
		}
		
		// 전체 데이터 출력
		System.out.println("< 데이터 출력-1 >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("< 데이터 출력-2 >");
		for(String str : list) {
			System.out.println(str);
		}
		

		
	}

}












