package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Money_DAO {
	private Money_DAO() {}
	private static Money_DAO instacne = new Money_DAO();
	public static Money_DAO getInstace() {
		return instacne;
	}
	
	PreparedStatement pstmt =null;
	Connection conn = null;
	ResultSet rs = null;
	
	public int MoneyWrite(Money_DTO md) {
		int row=0;
		String sql="";
	}
	

}
