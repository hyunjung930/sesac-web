package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 작업순서
 * 1. JDBC드라이버 로딩
 * 2. DB 접속하여 연결객체 얻어오기
 * 3. SQL 쿼리 생성
 * 4. 쿼리 실행 및 결과 얻어오기
 * 5. 접속 해제
 */

public class DBTestMain {
	
	public static void main(String[] args) {
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로딩 성공...");
			
			// 2. DB 접속
			Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@localhost:1521:xe", 
									"hr", 
									"hr");
			System.out.println("DB 접속 성공 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}










