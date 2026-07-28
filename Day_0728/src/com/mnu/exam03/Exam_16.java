package com.mnu.exam03;

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
			
			System.out.println(str);
		}
	}

}
