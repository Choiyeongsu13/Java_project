package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.Member_DAO;
import com.mnu.model.Member_DTO;

public class MemberWrite {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.print("회원번호: ");
		int custno = scn.nextInt();
		System.out.print("회원성명: ");
		String custname = scn.next();
		System.out.print("회원전화: ");
		String phone = scn.next();
		System.out.print("회원성별: ");
		String gender = scn.next().toUpperCase();
		System.out.print("회원등급: ");
		String grade = scn.next().toUpperCase();
		System.out.print("도시코드: ");
		String city = scn.next();
		
		
		//DAO, DTO 객체 생성
		Member_DAO dao = Member_DAO.getInstance();
		Member_DTO dto = new Member_DTO();
		dto.setCustno(custno);
		dto.setCustname(custname);
		dto.setPhone(phone);
		dto.setGender(gender);
		dto.setGrade(grade);
		dto.setCity(city);
		
		int row = dao.memberWrite(dto);
		if(row==1) {
			System.out.println("가입성공");
		}else {
			System.out.println("실패");
		}
		
	}

}
