package com.mnu.exam;

class DD{
	int a=10;
	void exam() {
		System.out.println("a= " +a);
	}
}

class ChDD extends DD{
	int b=20;
	//오버라이딩
	void exam() {
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
	
	void test() {
		
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
