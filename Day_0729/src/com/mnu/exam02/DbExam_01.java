package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_01 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "\r\n"
				+ "select eno,ename,hiredate,salary,salary*12 YEARSALARY,dname from emp join dept on emp.dno = dept.dno order by hiredate desc"
;		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("eno")+ "\t");
				System.out.println(rs.getString("ename")+ "\t");
				System.out.println(rs.getString("hiredate")+ "\t");
				System.out.println(rs.getInt("salary")+ "\t");
				System.out.println(rs.getInt("YEARSALARY")+ "\t");
				System.out.println(rs.getString("dname")+ "\n");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
