package com.mnu.dbexam;
/* JDBC program
 * 1. jdbc 드라이버로딩
 * 2. Connection 객체 생성
 * 3. Statement(명령문 처리)
 * 4. close
 * 
 */

import java.sql.Connection;

import com.mnu.util.DBManager;

public class Dbexam_01 {
	public static void main(String[] args) {
		Connection conn = DBManager.getConnection();
		
		System.out.println(conn);
		
		
	}

}
