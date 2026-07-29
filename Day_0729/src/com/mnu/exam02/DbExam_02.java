package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_02 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		
		int dno = 10;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select eno,ename,hiredate,salary,salary*12 YEARSALARY,dname from emp join dept on emp.dno = dept.dno \r\n"
				+ "where dept.dno=? order by hiredate desc";
;		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+ "\t");
				System.out.print(rs.getString("ename")+ "\t");
				System.out.print(rs.getString("hiredate")+ "\t");
				System.out.print(rs.getInt("salary")+ "\t");
				System.out.print(rs.getInt("YEARSALARY")+ "\t");
				System.out.print(rs.getString("dname")+ "\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
	}

}
