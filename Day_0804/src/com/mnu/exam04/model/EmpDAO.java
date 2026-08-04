package com.mnu.exam04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam04.util.DBManager;

public class EmpDAO {
	private EmpDAO() {}

	public static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
	}
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;

	//메소드정의

	// 전체 목록 (필터 없음)
	public List<commDTO> totalList(){
		List<commDTO> list = new ArrayList<commDTO>();

		String sql = "select eno,ename,hiredate,salary,e.dno,dname "
				+ "from dept d join emp e on e.dno= d.dno";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				commDTO dto = new commDTO();
				dto.empDTO.setEno(rs.getInt("eno"));
				dto.empDTO.setEname(rs.getString("ename"));
				dto.empDTO.setHiredate(rs.getString("hiredate"));
				dto.empDTO.setSalary(rs.getInt("salary"));
				dto.empDTO.setDno(rs.getInt("dno"));
				dto.deptDTO.setDname(rs.getString("dname"));

				list.add(dto);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, rs);
		}

		return list;
	}

	// 부서번호로 필터링한 목록
	public List<commDTO> deptList(int dno){
		List<commDTO> list = new ArrayList<commDTO>();

		String sql = "select eno,ename,hiredate,salary,e.dno,dname "
				+ "from dept d join emp e on e.dno= d.dno where e.dno=?";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);   // ? 자리에 값 채우기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				commDTO dto = new commDTO();
				dto.empDTO.setEno(rs.getInt("eno"));
				dto.empDTO.setEname(rs.getString("ename"));
				dto.empDTO.setHiredate(rs.getString("hiredate"));
				dto.empDTO.setSalary(rs.getInt("salary"));
				dto.empDTO.setDno(rs.getInt("dno"));
				dto.deptDTO.setDname(rs.getString("dname"));

				list.add(dto);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, rs);
		}

		return list;
	}

}