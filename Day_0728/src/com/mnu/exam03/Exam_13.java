package com.mnu.exam03;

public class Exam_13 {

	public static void main(String[] args) {
		String str1 = "korea";
		String str2 = "korea";
		String str3 = new String("korea");
		String str4 = new String("korea");
		
		
		System.out.println("str1==str2 :" +(str1==str2));
		System.out.println("str1.equal(str2) : " +(str1.equals(str2)));
		System.out.println("str1==str3 :" +(str1==str3));
		System.out.println("str1.equal(str3) :" +(str1.equals(str3)));
		System.out.println("str3==str4 :" +(str3==str4));
		System.out.println("str3.equal(str4) :" +(str3.equals(str4)));
	}

}
