package kr.co.mlec.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionFactory {

	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@helloworld_high?TNS_ADMIN=/Users/hyunjungchoi/Wallet_helloworld";
	         String user = "admin";
	         String password = "Oracle8245652";
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}


