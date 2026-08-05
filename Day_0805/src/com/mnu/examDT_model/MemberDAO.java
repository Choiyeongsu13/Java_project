package com.mnu.examDT_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.examDT_util.DBManager;

public class MemberDAO {
	private MemberDAO() {}
		public static MemberDAO instance = new MemberDAO();
		public static MemberDAO getInstacne() {
			return instance;
	}
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		public List<MemberDTO> memberwrite() {
//			//반환타입
//		List<MemberDTO> list =new ArrayList<MemberDTO>();	
//			
//			//쿼리
//			String sql="select custno,custname, phone, gender , joindate, grade, cityname\r\n"
//					+ "from tbl_member m join tbl_city c on m.city = c.city";
//			
//			
//			
//			try {
//				conn =DBManager.getConnection();
//				pstmt = conn.prepareStatement(sql);
//				
//				
//				
//				
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally {
//				DBManager.close(conn, pstmt);
//			}return list;
//		}
		
		public List<MemberDTO> memberList(){
			List<MemberDTO> mList = new ArrayList<MemberDTO>();;
			
			String sql="select custno,custname, phone, gender , joindate, grade, cityname\r\n"
					+ "from tbl_member m join tbl_city c on m.city = c.city";
			
			try {conn= DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO mdto = new MemberDTO();
				
				mdto.setCustno(rs.getInt("custno")); // 결과값이 하나일땐 1
				mdto.setCityname(rs.getString("cityname"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setGender(rs.getString("gender"));
				mdto.setJoindate(rs.getString("joindate"));
				mdto.setGrade(rs.getString("grade"));
//				mdto.setCity(rs.getString("city"));
				mdto.setCustname(rs.getString("custname"));
				
				mList.add(mdto);
				
			}
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}return mList;
		}
			
			public List<MemberDTO> memberList2(){
				List<MemberDTO> mList2 = new ArrayList<MemberDTO>();
				
				String sql="select custno,custname, phone, decode(gender,'M','남자',\r\n"
						+ "    'F','여자') as gender, joindate, \r\n"
						+ "    decode(grade,'A','VIP',\r\n"
						+ "    'B','일반',\r\n"
						+ "    'C','직원')as grade, cityname\r\n"
						+ "from tbl_member m join tbl_city c on m.city = c.city";
				
				try {conn= DBManager.getConnection();
				pstmt=conn.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					MemberDTO mdto1 = new MemberDTO();
					
					mdto1.setCustno(rs.getInt("custno")); // 결과값이 하나일땐 1
					mdto1.setCityname(rs.getString("cityname"));
					mdto1.setPhone(rs.getString("phone"));
					mdto1.setGender(rs.getString("gender"));
					mdto1.setJoindate(rs.getString("joindate"));
					mdto1.setGrade(rs.getString("grade"));
//				mdto.setCity(rs.getString("city"));
					mdto1.setCustname(rs.getString("custname"));
					
					mList2.add(mdto1);
					
				}
				
				
				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					DBManager.close(conn, pstmt, rs);
				}return mList2;
			}
			public List<MemberDTO> memberPhone(String phone){
					List<MemberDTO> mList3 = new ArrayList<MemberDTO>();
					
					String sql="select custno,custname, phone, decode(gender,'M','남자',\r\n"
							+ "    'F','여자') as gender, joindate, \r\n"
							+ "    decode(grade,'A','VIP',\r\n"
							+ "    'B','일반',\r\n"
							+ "    'C','직원')as grade, cityname\r\n"
							+ "from tbl_member m join tbl_city c on m.city = c.city where phone like ? ";
					
					try {conn= DBManager.getConnection();
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, "%" + phone); 
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						MemberDTO mdto1 = new MemberDTO();
						
						mdto1.setCustno(rs.getInt("custno")); // 결과값이 하나일땐 1
						mdto1.setCityname(rs.getString("cityname"));
						mdto1.setPhone(rs.getString("phone"));
						mdto1.setGender(rs.getString("gender"));
						mdto1.setJoindate(rs.getString("joindate"));
						mdto1.setGrade(rs.getString("grade"));
						mdto1.setCustname(rs.getString("custname"));
						
						mList3.add(mdto1);
						
					}
					
					
					
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						DBManager.close(conn, pstmt, rs);
					}return mList3;
				}
			public List<MemberDTO> memberName(String name){
				List<MemberDTO> mList3 = new ArrayList<MemberDTO>();
				
				String sql="select custno,custname, phone, decode(gender,'M','남자',\r\n"
						+ "    'F','여자') as gender, joindate, \r\n"
						+ "    decode(grade,'A','VIP',\r\n"
						+ "    'B','일반',\r\n"
						+ "    'C','직원')as grade, cityname\r\n"
						+ "from tbl_member m join tbl_city c on m.city = c.city where custname like ?";
				
				try {conn= DBManager.getConnection();
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, "%" + name); 
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					MemberDTO mdto1 = new MemberDTO();
					
					mdto1.setCustno(rs.getInt("custno")); // 결과값이 하나일땐 1
					mdto1.setCityname(rs.getString("cityname"));
					mdto1.setPhone(rs.getString("phone"));
					mdto1.setGender(rs.getString("gender"));
					mdto1.setJoindate(rs.getString("joindate"));
					mdto1.setGrade(rs.getString("grade"));
					mdto1.setCustname(rs.getString("custname"));
					
					mList3.add(mdto1);
					
				}
				
				
				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					DBManager.close(conn, pstmt, rs);
				}return mList3;
			}
			
			//회원번호로 최대값 찾기 
//			public int memberMax(){
//				int row=0;
//				String sql="";
//				
//				try {conn= DBManager.getConnection();
//				pstmt=conn.prepareStatement(sql); 
//				rs = pstmt.executeQuery(sql);
//				if(rs.next()) {
//					row =rs.getInt(1);
//					}
//				}
//				catch(Exception e) {
//					e.printStackTrace();
//				}finally {
//					DBManager.close(conn, pstmt, rs);
//				}return row;
//			}
			
			//회원등록 메소드
			public int memberWrite(MemberDTO dto) {
			int row = 0;
			String sql="insert into tbl_member(custno,custname,phone,gender,grade,joindate,city) values(?,?,?,?,?,sysdate,?)";
			
			try {
				conn=DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getCustno());
				pstmt.setString(2, dto.getCustname());
				pstmt.setString(3, dto.getPhone());
				pstmt.setString(4, dto.getGender());
				pstmt.setString(5, dto.getGrade());
				pstmt.setString(6, dto.getCity());
				row= pstmt.executeUpdate();
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt);
			}return row;
			}
			
			public int memberWriteSeq(MemberDTO dto) {
				int row = 0;
				String sql="insert into tbl_member(custno,custname,phone,gender,grade,joindate,city) values(tbl_member_custno_seq.nextval,?,?,?,?,sysdate,?)";
				
				try {
					conn=DBManager.getConnection();
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, dto.getCustname());
					pstmt.setString(2, dto.getPhone());
					pstmt.setString(3, dto.getGender());
					pstmt.setString(4, dto.getGrade());
					pstmt.setString(5, dto.getCity());
					row= pstmt.executeUpdate();
					
				}catch(Exception e){
					e.printStackTrace();
				}finally {
					DBManager.close(conn, pstmt);
				}return row;
			}
			
		
		
}

