package com.mnu.exam01;

import java.util.List;
import java.util.Scanner;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

//tbl_member 테이블에 새로운 회원등록
//회원번호는 마지막 회원번호 +1 
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstacne();
		MemberDTO dto = new MemberDTO();
		
		int custno = dao.memberWrite(dto)+1;
		
		if(custno==0) {
			custno=100001;
		}else {
			custno=custno+1;
		}
		
		System.out.println("회원번호 : " +custno);
		dto.setCustno(custno);
		System.out.println("회원성명 : ");
		dto.setCustname(scn.next());
		System.out.println("전화번호 : ");
		dto.setPhone(scn.next());
		System.out.println("성별 : ");
		dto.setGender(scn.next().toUpperCase());
		System.out.println("회원등급 : ");
		dto.setGrade(scn.next().toUpperCase());
		System.out.println("거주지역 : ");
		dto.setCity(scn.next());
		
		//등록 메소드
		int row = dao.memberWrite(dto);
		if(row==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}

}
