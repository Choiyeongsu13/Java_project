package com.mnu.exam03;

public class Exam_17 {

	public static void main(String[] args) {
		String str = "951027-1234567"; //주민번호
		int len = str.length();
		System.out.println("문자열 길이 : " + len); //14
		
		//나이계산
		int year = Integer.parseInt(str.substring(0,2)) +1900;
		int age = 2026-year;
		System.out.println("나이 = " + age); 
		
		//성별 체크
		String g = str.substring(7,8);
		String gender="여자";
		if(g.equals("1")) {
			gender="남자";
		}
		System.out.println("성별 1 = " + gender );
		//성별 체크2 문자열 위치
		int index = str.indexOf("-");
		
		//7번부터 8번전까지
		String g2 = str.substring(index +1 , index +2);
		String gender2 ="여자";
		if(g2.equals("1")) {
			gender2="남자";
		}System.out.println("성별 2 = " + gender2); //남자
		
		//성별체크 charAt(index) => char
		int index2 = str.indexOf("-"); //6
		char gen = str.charAt(index2+1);
		String gender3="여자";
		if(gen=='1') {
			gender3="남자";
		}else {
			System.out.println("성별 3 = " +  gender3);
		}
		
	}

}
