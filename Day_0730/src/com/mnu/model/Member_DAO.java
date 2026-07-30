package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	//2 회원전체 목록 검색 메소드
	
	public List<Member_DTO> memberlist(){
		// 반환타입
		List<Member_DTO> mList = new ArrayList();
		//쿼리
		String sql="select custno,custname,phone,gender,grade,c.cityname,joindate \r\n"
				+ "from tbl_member m join tbl_city c on m.city=c.city";
		try {conn= DBManager.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		rs= pstmt.executeQuery(); //select일 경우에만
		
		while(rs.next()) {
			Member_DTO dto = new Member_DTO();
			dto.setCustno(rs.getInt("custno"));
			dto.setCustname(rs.getString("custname"));
			dto.setPhone(rs.getString("phone"));
			dto.setGender(rs.getString("gender"));
			dto.setGrade(rs.getString("grade"));
			dto.setCityname(rs.getString("cityname"));
			dto.setJoindata(rs.getString("joindate"));
	
			
			
			
			mList.add(dto);
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
		
	}
	
	
	
	
}
