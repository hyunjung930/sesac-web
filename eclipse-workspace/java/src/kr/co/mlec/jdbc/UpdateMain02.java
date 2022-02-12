package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

/*
 	검색할 ID를 입력하세요 : hong
 	수정할 이름을 입력하세요 : 홍개똥
 	총 1개의 행이 수정되었습니다
*/

public class UpdateMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();
			
			conn = new ConnectionFactory().getConnection();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql  = "update t_test ";
				   sql += "   set name = ? ";
				   sql += " where id = ? ";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			System.out.println("총 " + cnt + "개 행이 수정되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}













