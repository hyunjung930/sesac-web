package kr.co.mlec.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionFactory {

	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.35.5:1521:xe";
	         String user = "hello";
	         String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}

