package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class Member_DAO {
	//싱글톤 패턴으로 제작
	private Member_DAO(){}
	private static Member_DAO instance = new Member_DAO();
	public static Member_DAO getInstance() {
		return instance;
	}
	//멤버변수
	Connection conn =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; //select에서만 필요
	
	//1. 등록 메소드 (회원가입)
	public int memberWrite(Member_DTO MbDTO) {
		//반환 타입 정의
		int row =0;
		
		//쿼리문장정의
		String sql ="INSERT INTO TBL_MEMBER(CUSTNO,CUSTNAME,PHONE,GENDER,GRADE,CITY)\r\n"
				+ "VALUES(?,?,?,?,?,?)";
		
		try { conn = DBManager.getConnection(); //db 연결
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,MbDTO.getCustno());
			pstmt.setString(2,MbDTO.getCustname());
			pstmt.setString(3,MbDTO.getPhone());
			pstmt.setString(4,MbDTO.getGender());
			pstmt.setString(5,MbDTO.getGrade());
			pstmt.setString(6,MbDTO.getCity());
			
			row = pstmt.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
				
	}
	
	
	
	
}
