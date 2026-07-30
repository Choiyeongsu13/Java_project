package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public String
	

}
