package kr.co.mlec.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	Map : key, value 쌍으로 구성된 데이터의 집합
	      순서(X), key에 대한 중복(X)
      - HashMap
      - TreeMap	      
 */

public class MapMain {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("1", "ONE");
		map.put("2", "TWO");
		map.put("3", "THREE");
		map.put("4", "FOUR");
		
		System.out.println("원소의 개수 : " + map.size());
		
		System.out.println("key : 1 ===> value : " +  map.get("1"));
		System.out.println("key : 5 ===> value : " +  map.get("5"));
		
		map.put("1", "하나");
		System.out.println("key : 1 ===> value : " +  map.get("1"));
		
//		key = 5인 데이터가 없으면 key : 5, value : "FIVE" 삽입
		if(!map.containsKey("5")) {
			map.put("5", "FIVE");
		}
		System.out.println("key : 5 ===> value : " +  map.get("5"));
		
	
		System.out.println("< 데이터 출력 - 1>");
		Set<Entry<String, String>> entry = map.entrySet();
		
		for(Entry<String, String> e : entry) {
			System.out.println("key : " + e.getKey() 
								+ ", value : " + e.getValue());
		}
		
		System.out.println("< 데이터 출력 - 2 >");
		Set<String> keys =  map.keySet();
		for(String key : keys) {
			System.out.println("key : " + key 
								+ ", value : " + map.get(key));
		}
	}
}











