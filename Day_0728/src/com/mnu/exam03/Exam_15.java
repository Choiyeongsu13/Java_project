package com.mnu.exam03;

import java.util.Arrays;

public class Exam_15 {

	public static void main(String[] args) {
		String str="Java&JSP Programming 프로그래밍";
		System.out.println(str.indexOf('a')); //1
		System.out.println(str.indexOf('프')); //21
		System.out.println(str.indexOf('a',2)); //지정 위치부터 뒤로 찾기 3 (없으면 -1)
		
		String str1 = "abcabc"; 
		System.out.println(str.lastIndexOf("문자 문자열 위치 c ")); //문자열의 마지막 c 인덱스는 5
		System.out.println(str1.lastIndexOf("문자 문자열 위치 c ",2)); //문자열에서 인덱스 2부터 거꾸로 탐색을 했을 때, 처음나오는 c인덱스는 2
		
		String str2="";
		if(str2.isEmpty()) { //문자열이 비어있는지의 유무
			System.out.println("문자열의 유무OK");
		}
		String str3;
		str3=str2.replace("AAA", "BBB");
		System.out.println("문자열 대치 replace : "+str3);
		
		String str4="1,aaaa,90,80,90";
		String hak[] = str4.split(",");
		System.out.println("문자열분리 split : "+ Arrays.toString(hak));
		
		String str5 = "Java Programmin";
		String str6 = str5.toLowerCase();
		String str7 = str5.toUpperCase();
		System.out.println("알파벳 대문자 toUpperCase : " + str7); 
		System.out.println("알파벳 소문자 toLowerCase : " + str6); 
		
		String str8 = "  Java  Programmin  ";
		String str9 = str8.trim();
		System.out.println("앞뒤 공백 자르기 trim() : " + str9);
		
		
		String str10 = String.valueOf(true);
		System.out.println("지정 값 문자열 변환 valueOf : " +str10);
		
		String str11 = String.valueOf('a');
		System.out.println("지정 값 문자열 변환 valueOf: " + str11);
	}

}
