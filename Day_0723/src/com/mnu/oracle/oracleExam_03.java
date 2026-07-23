package com.mnu.oracle;

import java.sql.*;


public class oracleExam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//필수 클래스 3개 참조변수
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. 커넥션 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##TEST","1234");
			
			
			//3. 명령문 수행
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT ENO,ENAME,HIREDATE,SALARY FROM EMP WHERE DNO = 10 ORDER BY SALARY DESC");
			
			//4. 결과 출력
			while(rs.next()) {
				System.out.println(rs.getInt("ENO")+"\t");
				System.out.println(rs.getString("ENAME")+"\t");
				System.out.println(rs.getString("HIREDATE")+"\t");
				System.out.println(rs.getInt("SALARY")+"\n");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	
	}

}
