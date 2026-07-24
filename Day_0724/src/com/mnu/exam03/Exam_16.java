package com.mnu.exam03;

public class Exam_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, sum=0;
		while(a<10) { //9
			a++;
			if(a%2==1) { //1,3,5,7,9
				continue;}
				sum += a;//2,4,6,8,10
			
		}System.out.println(sum);
		
		

	}

}
