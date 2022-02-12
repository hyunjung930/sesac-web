package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.JDBCClose;

public class SelectMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("급여를 입력하세요 : ");
			int salary = sc.nextInt();
		
			String sql  = "select job_title, avg(salary) as 평균급여 ";
			       sql += "  from ( ";
			       sql += "         select e.employee_id, e.first_name, e.salary, j.job_title ";
			       sql += "           from employees e,  jobs j ";
			       sql += "          where salary >= ? ";
			       sql += "            and e.job_id = j.job_id ";
			       sql += "       ) ";
			       sql += " group by job_title ";
			       sql += " order by 평균급여 desc ";
			       
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			
			ResultSet rs = pstmt.executeQuery();
			
			int cnt = 0;
			while(rs.next()) {
				String title = rs.getString("job_title");
				int avgSalary = rs.getInt(2);
				
				System.out.printf("[%s] 평균급여 : %d\n", title, avgSalary);
				cnt++;
			}
			System.out.println("총 [" +  cnt + "]명이 검색되었습니다");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}
}












