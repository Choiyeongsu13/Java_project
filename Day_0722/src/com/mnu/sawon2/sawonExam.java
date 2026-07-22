package com.mnu.sawon2;

import java.util.Scanner;


public class sawonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력(사원정보)
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("사원등록 : ");
		int sabun = scn.nextInt(); //사원번호
		String saname = scn.next(); // 사원이름
		int gender = scn.nextInt(); //성
		int grade = scn.nextInt(); // 사원등급
		int time = scn.nextInt();// 근무시간
		
		sawonDAO dao = sawonDAO.getinstance();
		
		//1. 사원객체 생성
		sawonDTO sw = dao.getsawon(sabun,saname,gender,grade,time);
			
		
		System.out.println("사원번호\t사원이름\t성\t사원등급\t시급\t근무시간\t주간급여");
		System.out.print(sw.getSabun()+"\t" + sw.getSaname()+"\t" + sw.getGenderStr() +"\t" 
		+ sw.getGrade() +"\t" + sw.getWeekPay()+"\t"+ sw.getTime()+"\t"+sw.getWeekMoney());

	}

}
