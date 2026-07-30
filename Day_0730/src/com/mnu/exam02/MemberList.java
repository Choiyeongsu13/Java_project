package com.mnu.exam02;
//회원정보 출력

import java.util.List;

import com.mnu.model.Member_DAO;
import com.mnu.model.Member_DTO;

public class MemberList {
	public static void main(String[] args) {
		Member_DAO dao = Member_DAO.getInstance();
		
		List<Member_DTO> list = dao.memberlist();
		//성별 m: 남자 , F 여자
		//등급 A = vip, b= 일반 c = 직원
		
		System.out.println("회원번호\t회원성명\t전화\t성별\t등급\t도시명\t가입일");
		if(!list.isEmpty()) {
			
			for(Member_DTO dto : list) {
				
				//등급 A = vip, b= 일반 c = 직원
				if("M".equals(dto.getGender())) {
				dto.setGender("남자");
				}
				if("F".equals(dto.getGender())) {
					dto.setGender("여자");
				}
				
				
				if("A".equals(dto.getGrade())) {
					dto.setGrade("VIP");
				}
				if("B".equals(dto.getGrade())) {
					dto.setGrade("일반");
				}
				if("C".equals(dto.getGrade())) {
					dto.setGrade("직원");
				}
				
				System.out.print(dto.getCustno()+ "\t");
				System.out.print(dto.getCustname()+ "\t");
				System.out.print(dto.getPhone()+ "\t");
				System.out.print(dto.getGender()+ "\t");
				System.out.print(dto.getGrade()+ "\t");
				System.out.print(dto.getCityname()+ "\t");
				System.out.print(dto.getJoindata()+ "\n");
			}
			
			
		
	}
	}
}

