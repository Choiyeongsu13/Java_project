package com.mnu.exam01;
//키보드로 회원번호, 이름(수정불가),전화, 성별, 등급,지역코드를 입력
//수정

import java.util.Scanner;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstacne();
		MemberDTO dto = new MemberDTO();
		
		System.out.println("회원번호 : ");
		dto.setCustno(scn.nextInt());
		
		System.out.println("전화번호 : ");
		dto.setPhone(scn.next());
		System.out.println("성별 : ");
		dto.setGender(scn.next().toUpperCase());
		System.out.println("회원등급 : ");
		dto.setGrade(scn.next().toUpperCase());
		System.out.println("거주지역 : ");
		dto.setCity(scn.next());
		
		//등록 메소드
		int row = dao.memberalterSeq(dto);
		if(row==1) {
			System.out.println("수정성공");
		}else {
			System.out.println("실패");
		}

	}

}
