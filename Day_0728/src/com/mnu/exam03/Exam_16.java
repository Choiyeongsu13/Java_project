package com.mnu.exam03;

import java.util.Arrays;

public class Exam_16 {

	public static void main(String[] args) {
		//문자열 배열을 문자열로 변환
		String arr[] = {"김학생","이학생","장학생","오학생","강학생"};
		String str="";
		
		for(int x=0; x<arr.length; x++) {
			str= str+ arr[x];
			if(x!=arr.length-1) {
				str = str + ",";
			}
		}
		System.out.println(str);
		
		//문자열을 배열로 전환
		
		String arrStr [] = null;
		if(!str.isEmpty()) { //문자열이 비어있지않으면
			arrStr = str.split(","); 
		}else {
			arrStr= new String[1];
		}
		//			System.out.println("학생수 : " +  arrStr.length);
		if(str.contains("오학생")){
			System.out.println("ok");
		}
		
		for(int x = 0; x<arrStr.length; x++) {
			System.out.println(arrStr[x]);
		}
		
		System.out.println(Arrays.toString(arrStr));
//		String name[] = str.split(",");
//		System.out.println(Arrays.toString(name));
		
	
	}


}
