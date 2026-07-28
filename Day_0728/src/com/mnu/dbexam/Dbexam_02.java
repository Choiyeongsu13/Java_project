package com.mnu.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mnu.util.DBManager;

public class Dbexam_02 {
	public static void main(String[] args) {
		Connection conn = null; //연결담당
		PreparedStatement pstmt = null; //sql 명령문 처리 담당
		ResultSet rs = null; // Query 결과 담당
		
		conn = DBManager.getConnection();
		
		String sql="select * from emp";
		try {
		pstmt = conn.prepareStatement(sql); //아래 방법으로도 가능
//		pstmt = conn.prepareStatement("select * from dept");
		
		rs = pstmt.executeQuery(); //명령실행후 결과를 rs 저장 (sql에서 컨트롤 + 엔터)
		
		//결과 출력
		
		System.out.println("직원번호\t직원명\t업무\t상사\t입사일\t임금\t커미션\t부서번호");
		while(rs.next()) { //rs에 값이 존재하면 반복
			System.out.print(rs.getInt("eno")+ "\t");
			System.out.print(rs.getString("ename")+ "\t");
			System.out.print(rs.getString("job")+ "\t");
			System.out.print(rs.getString("manager")+ "\t");
			System.out.print(rs.getString("hiredate")+ "\t");
			System.out.print(rs.getInt("salary")+ "\t");
			System.out.print(rs.getString("commission")+ "\t");
			System.out.print(rs.getInt("dno")+ "\n");
		}
		
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
	
	}
		

}
