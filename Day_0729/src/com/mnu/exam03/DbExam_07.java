package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mnu.util.DBManager;

public class DbExam_07 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		//dno,dname,job,hiredate,salary
//		int eno = 1234;
//		String ename = "김시원";
//		String job = "영업";
//		String hiredate = "2026/07/29";
//		int salary = 2750;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = ("select eno,ename,job,hiredate,salary,emp.dno,dname from emp "
+ "join dept on  emp.dno = dept.dno where ename like '__A%'");
		
;		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //select
			while(rs.next()) {
			System.out.print(rs.getInt("ENO")+"\t");
			System.out.print(rs.getString("ENAME")+"\t");
			System.out.print(rs.getString("JOB")+"\t");
			System.out.print(rs.getString("HIREDATE")+"\t");
			System.out.print(rs.getInt("SALARY")+"\t");
			System.out.print(rs.getInt("DNO")+"\t");
			System.out.print(rs.getString("DNAME")+"\n");
			}
			
			
			System.out.print(rs);

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			DBManager.close(conn, pstmt,rs);
		}
		
	}

}
