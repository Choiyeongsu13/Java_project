package com.mnu.exam01;

interface animal3{
	void sound(); //추상메소드만
}

class dog3 implements animal3{ //구현(implements)체 만들기
	@Override 
	public void sound() { 
		System.out.println("멍멍");
	}
}


public class Exam_04 {

	public static void main(String[] args) {
		

	}

}
