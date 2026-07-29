package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_05 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno = 50;
		String loc = "ソウル";
		String dname = "人事部";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "UPDATE DEPT SET DNAME=?,LOC=? WHERE DNO =?";
;		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(3, dno);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			
			int row = pstmt.executeUpdate(); //INSERT UPDATE DELETE
			
			System.out.print(row);
//			System.out.print(row.etInt("dno")+"\t");
//			System.out.print("dname"+"\t");
//			System.out.print("loc"+"\n");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			DBManager.close(conn, pstmt);
		}
		
	}

}
