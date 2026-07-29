package com.mnu.util;

import java.sql.*;

public class DBManager {
	public static Connection getConnection() {
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		
		
		try {//1. JDBC 드라이버 로딩 
			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("오라클 드라이버 로딩 성공 ");
			
			//2. Connection 객체 생성
			conn = DriverManager.getConnection(myURL,"C##TEST","1234");
//			System.out.println("커넥션 연결 로딩 성공 ");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
			System.out.println("드라이버 로딩 실패 ");
		} 
		
		return conn;
		
	}
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	public static void close(Connection conn, PreparedStatement pstmt,ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

}
