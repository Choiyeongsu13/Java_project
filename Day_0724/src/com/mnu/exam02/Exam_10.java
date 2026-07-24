package com.mnu.exam02;

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 71, eng =98, mat =87; 
		int sum = kor +eng +mat;
		//정수,문자,문자열
		switch(sum/30) { //8
		case 10:
		case 9:	System.out.println("A");
		case 8: System.out.println("B");
		case 7: 
		case 6: System.out.println("C");
			default : System.out.println("D");
		}//BCD
		

	}

}
