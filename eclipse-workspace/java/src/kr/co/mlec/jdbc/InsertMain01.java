package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");	// checked exception(컴파일시점의 예외처리)
			
			// 2단계 : DB접속 및 Connection객체 얻어오기
			String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계 : SQL 실행 객체 얻어오기 & 쿼리 작성
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('park', '박길동') ";
			
			// 4단계 : 쿼리 실행 및 결과 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : DB접속 종료
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
}









