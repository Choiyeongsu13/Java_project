package com.mnu.exam03;

public class Exam_13 {
//for,while,do~while
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,sum;
		a=b=1; //ab1
		sum = a+b; //sum 2
		
		for(int i =3; i<=5; i++) {
			c = a+b;//c 2 // c 3 // c 5
			sum+=c;// sum 4 // sum 7 // //12
			a=b; // a=1 // a=2
			b=c; // b=2 // b=3
			
		}
		System.out.println(sum);
	}

}
