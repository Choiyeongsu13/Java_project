package com.mnu.exam03;

public class Test_01 {
	public static void main(String[] args) {
		String ssn = "910207-1234567";
		String date = "991202";
		String priva;
		//년 월 일
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		
		//성별
		int s = ssn.charAt(7)-48;
		System.out.println(s);

		int ss =Integer.parseInt(ssn.substring(7, 8));
		System.out.println(ss);
		
		//나이 계산
		int age;
		if(s == 1 || s ==2) {
		
		 age = 2026 - (1900+Integer.parseInt(year));
		}else {
			 age = 2026 - (2000+Integer.parseInt(year));	
		}
		System.out.println(year + month + day + age);
		}	

}
