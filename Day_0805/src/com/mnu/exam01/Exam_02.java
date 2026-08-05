package com.mnu.exam01;
//tbl_member테이블에 새로운 회원등록
//회원번호는 자동증가

import java.util.Scanner;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstacne();
		MemberDTO dto = new MemberDTO();
		
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
		int row = dao.memberWriteSeq(dto);
		if(row==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

	}

}
