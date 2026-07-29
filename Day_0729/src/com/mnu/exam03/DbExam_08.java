package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mnu.util.DBManager;

public class DbExam_08 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		//dno,dname,job,hiredate,salary
		int eno = 1234;
//		String ename = "김시원";
//		String job = "영업";
//		String hiredate = "2026/07/29";
		int salary = 2750*10;
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = ("update emp set salary = ?  where eno= ?\r\n");
		
;		try {
			conn = DBManager.getConnection();
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			pstmt.setInt(2, eno);
			
			
			int row = pstmt.executeUpdate();
			System.out.print(row);

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			DBManager.close(conn, pstmt);
		}
		
	}

}
