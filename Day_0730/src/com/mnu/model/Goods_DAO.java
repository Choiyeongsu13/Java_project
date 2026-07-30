package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class Goods_DAO {
	private Goods_DAO() {}
	private static Goods_DAO instance = new Goods_DAO();
	public static Goods_DAO getInstance() {
		return instance;
	}
	
	//멤버변수
	Connection conn=null;
	PreparedStatement pstmt =null;
	ResultSet rs = null;
	
	public int GoodsWrite(Goods_DTO gdto) {
		//반환 타입
		int row=0;
		String sql = "INSERT INTO TBL_GOODS(pcode,pname,pcost,stock)\r\n"
				+ "VALUES(?,?,?,?)";
		
		try { conn = DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, gdto.getPcode());
		pstmt.setString(2, gdto.getPname());
		pstmt.setInt(3, gdto.getPcost());
		pstmt.setInt(4, gdto.getStock());
		
		row= pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	public List<Goods_DTO> Goodslist(){
		//반환타입
		List<Goods_DTO> gList = new ArrayList<Goods_DTO>();
		// 쿼리
		
		String sql="select pcode,pname,pcost,stock from TBL_GOODS";
		
		try {
			conn=DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Goods_DTO gto = new Goods_DTO();
				gto.setPcode(rs.getString("pcode"));
				gto.setPname(rs.getString("pname"));
				gto.setPcost(rs.getInt("pcost"));
				gto.setStock(rs.getInt("stock"));
				
				gList.add(gto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt,rs);
		}
		return gList;
		
	}
	

}
