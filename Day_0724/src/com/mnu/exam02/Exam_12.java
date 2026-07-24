package com.mnu.exam02;

public class Exam_12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//입력값이 c인경우
		char ch = (char)System.in.read(); // read를 입력하려면 ^ throws Exception 입력
		switch (ch) { // 하나의 문자를 입력받기위한 방법
		case 'a':
			System.out.println("one");
		case 'b':
			System.out.println("two");
		case 'c':
			System.out.println("three");
			break;
		case 'd':
			System.out.println("four");
			break;
		}
		

	}

}
