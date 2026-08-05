package com.mnu.exam01;
//회원정보 검색
//회원번호  이름  전화  성별  가입일자  고객등급  거주도시(명)

import java.util.List;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

public class Exam_3_1 {
	public static void main(String[] args) {
		
		MemberDAO mbdo = MemberDAO.getInstacne();
		
		List<MemberDTO> list = mbdo.memberList();
		System.out.println("회원번호\t이름\t연락처\t성별\t가입일자\t등급\t도시명");
		if(list.size()==0) {
			System.out.println("등록된 회원이 없음");
		}else {
			for(MemberDTO mdto : list) {
				if("M".equals(mdto.getGender())) {
					mdto.setGender("남자");
				}else {
					mdto.setGender("여자");
				}
				if("A".equals(mdto.getGrade())) {
					mdto.setGrade("VIP");
				}
				else if("B".equals(mdto.getGrade())) {
					mdto.setGrade("회원");
					}
				else {
					mdto.setGrade("일반");
				}
				
//				if(mdto.getJoindate().contains("26/")) {
//					mdto.setJoindate("26년");
//				}else if(mdto.getJoindate().contains("07/")){
//					mdto.setk
//				}

				
					
				System.out.print(mdto.getCustno()+"\t");
				System.out.print(mdto.getCustname()+"\t");
				System.out.print(mdto.getPhone()+"\t");
				System.out.print(mdto.getGender()+"\t");
				System.out.print(mdto.getJoindate()+"\t");
				System.out.print(mdto.getGrade()+"\t");
				System.out.print(mdto.getCityname()+"\n");
			}
		}
	}

}
