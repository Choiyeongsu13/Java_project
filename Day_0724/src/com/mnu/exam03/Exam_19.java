package com.mnu.exam03;

public class Exam_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		do {
			cnt++; //1
		}while(cnt<0); 
		if(cnt==1) { 
			cnt++;//1
		}else {
			cnt=cnt+3; //4
		}
		
		System.out.println(cnt);
	}

}
