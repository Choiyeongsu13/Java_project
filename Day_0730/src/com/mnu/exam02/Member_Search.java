package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.Member_DAO;
import com.mnu.model.Member_DTO;


public class Member_Search {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("회원정보 입력 : ");
		int custno = scn.nextInt();
		
		
		
		//회원이 있는경우(번호,이름,전화,성별,등급,등록일 출력)
		//없으면 "등록이 되지않은 회원"
		
		Member_DAO mbl= Member_DAO.getInstance();
		Member_DTO mto = mbl.memberSearch(custno);
		
		
		System.out.println("회원번호" + mto.getCustno());
	}

}
