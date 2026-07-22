package com.mnu.sawon;


public class sawonDAO {

	//싱글톤 패턴
	
	private sawonDAO() {
		
	}
	
	//클래스 자신의 객체를 자신이 생성
	private static sawonDAO instance = new sawonDAO(); 
	
	//오픈 /static : 인스턴스 메소드를 사원이라는 이름으로 접근해라
	public static sawonDAO getinstance() {
		return instance;
	}
	
	
	//1. 메소드 생성(객체생성 후 반환)
	public sawon getsawon(int sabun,String saname, int gender, int grade, int time) {
		
		sawon sawon = new sawon(sabun,saname,gender,grade,time);
		
		return sawon;
		
	}
	
	//2. 성별을 구하는 메소드
//	
//	public void gender(int gender) {
//		String gender1 = "남자";
//		if(gender == 2 || gender ==4) {
//			gender1="여자";
//		}
//		
//	}
	
	//2. 주간급여를 계산 후 반환하는 메소드
	
	//급여는 시간x시급 , 등급이 1이면 만원, 2면 5천, 3이면 2000
	//36시간 초과근무는 시급 1.5배 최대 50까지만 인정
	
	public int weekPayprocess(sawon sw, int weekpay) {
		int pay=0; //주간급여
		int overtime = 0 ; //초과근무 시간
		int basetime  = sw.getTime(); //28
		if(basetime>50) {
			basetime=50;
		}
		//초과근무시간
		if(basetime>36)
		{
			overtime = basetime - 36;
			basetime = 36;
		}
		
		pay = basetime * weekpay+(int)(overtime * overtime * 1.5);
		
		return pay;
	}
//	
//	public void sawonOutput(sawon sw) {
//		int salary;
//		if(sw.getGrade() == 1) {
//			
//			salary = sw.getTime()*10000;
//		}
//		else if (sw.getGrade() == 2) {
//			salary = sw.getTime()*5000;
//		}
//		else if (sw.getGrade() == 3) {
//			salary = sw.getTime()*2000;
//		}
//		
//		
//		
//		
//
//	}
	
	
}
