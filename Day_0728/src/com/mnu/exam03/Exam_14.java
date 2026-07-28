package com.mnu.exam03;

public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="자바 프로그래밍";
		char ch=str.charAt(1);
		
		System.out.println("문자추출 : " +ch);
		
		String ssn ="901211-1634422";
		char s = ssn.charAt(7);
		
		System.out.println(s);
		
		for(int x=0; x<str.length(); x++) {
			char c= str.charAt(x);
			System.out.println(c);
		}
		//-------------------------------
		String str2="";
		for(int x=0; x<10; x++) {
			str2 +=x;
		}
		System.out.println("문자열 결합 : " + str2);
		
		String str3="";
		for(int x=0; x<10; x++) {
			str3 +=str3.concat(""+x);
		}
		System.out.println("문자열 결합 concat : " + str3);
		//-------------------------------
		String str4= "HELLO 자바 WORLD 자바 프로그래밍";
		boolean bool =str4.contains("자바");
		System.out.println("문자열 포함유무contain : " +  bool);
		//-------------------------------
//		String str5 = String.format(" %d 더하기 %d 는 %d 입니다", 123456); // 세자리마다 ,
//		System.out.println("형식화된 문자열 format : " + str5);
		String str6 = String.format(" %d 더하기 %d 는 %d 입니다", 3,5,3+5);
		System.out.println("형식화된 문자열 format : " + str6);
		
		String str7 = String.format("%7.2f", 3.12567);
		System.out.println("형식화된 문자열 format : "+str7);
		
		
		
	}

}
