package kr.co.mlec.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HandlerMapping {	// 원하는 beans properties를 찾아오는 역할을 수행한다.

	private Map<String, Controller> mappings = null;
	
	public HandlerMapping(String propLoc) {
		
		Properties prop = new Properties();
		mappings = new HashMap<>();
		
		try {
			//InputStream is = new FileInputStream("D:\\Lecture\\web-workspace\\Mission-Web-MVC\\bean.properties");
			InputStream is = new FileInputStream(propLoc);
			//inputStream은 데이터를 읽어와
			prop.load(is);
	
			Set<Object> keys = prop.keySet();	//key: key의 값만 출력
			for(Object key : keys) {
				
				String className = prop.getProperty(key.toString());
				System.out.println(key + " : " + className);
				
				Class<?> clz = Class.forName(className);
				//클래스의 정보를 얻기위한 클래스 
				//forName():물리적인 클래스 파일명을 인자로 넣어주면 이에 해당하는 클래스를 반환해줍니다.
				mappings.put(key.toString(), (Controller)clz.newInstance());
			
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Controller getController(String uri) {
		return mappings.get(uri);
	}
/*	
	public static void main(String[] args) throws Exception {
		
		
//		java.util.Random r = new java.util.Random();
//		int random = r.nextInt(100);
//		System.out.println("추출된 난수 : " + random);
		
		
		
//		Class<?> clz = Class.forName("java.util.Random");
//		java.util.Random obj = (java.util.Random)clz.newInstance();
//		int random = obj.nextInt(100);
//		System.out.println("추출된 난수 : " + random);
		
		
		// BoardListController obj = new BoardListController();
		Class<?> clz = Class.forName("kr.co.mlec.controller.BoardListController");
		BoardListController obj = (BoardListController)clz.newInstance();
		System.out.println(obj.handleRequest(null, null));
	}
*/
}