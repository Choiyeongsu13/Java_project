package com.mnu.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class oracleConn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. JDK 드라이버 로딩 : 오라클 사이트에서 다운 (ojdbc8.jar)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공 ");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패 ");
		}
		
		//2. Connection (java와 oracle 연결)
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##TEST", "1234");
			System.out.println("connection : " + conn);
			System.out.println("커네션 연결 성공 ");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
			while(rs.next()) { //next 한줄씩 아래로 내려가라
				System.out.print(rs.getInt("ENO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getString("JOB")+"\t");
				System.out.print(rs.getInt("MANAGER")+"\t");
				System.out.print(rs.getString("HIREDATE")+"\t");
				System.out.print(rs.getInt("SALARY")+"\t");
				System.out.print(rs.getInt("COMMISSION")+"\t");
				System.out.print(rs.getInt("DNO")+"\n");
			}
		}catch(Exception e) {
			System.out.println("커네션 연결 실패 ");
			}
		//3. SQL 명령 수행
						
		
		//4. 종료
	}

}
