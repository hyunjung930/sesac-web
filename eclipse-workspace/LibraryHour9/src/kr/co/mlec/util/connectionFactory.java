package kr.co.mlec.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionFactory {

	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@DB202201081250_high?TNS_ADMIN=/Users/hyunjungchoi/Wallet_DB202201081250";
			String user = "admin";
			String password = "Chj824565245397930";
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return conn;
		
	}
}


