package com.mnu.exam01;

import java.util.Scanner;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

//회원정보 입력 회원정보 삭제
public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstacne();
		MemberDTO dto = new MemberDTO();
		
		System.out.println("회원번호 : ");
		dto.setCustno(scn.nextInt());
		
		
		//등록 메소드
		int row = dao.memberdelete(dto);
		if(row==1) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("실패");
		}
	}

}
