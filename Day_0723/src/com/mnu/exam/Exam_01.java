package com.mnu.exam;

class Super{
	private int a = 10;
	int b=100;
}

class child extends Super{
	//int b=1200; //변수 2개 super b , child b
	int b=10;
	int d= 10;
	void test() {
		System.out.println("b =" +b);
		System.out.println("Super b =" + super.b);
		System.out.println("d =" +d);
	}

	
}



public class Exam_01 {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println(s1.b);
		child s2 = new child();
		
		System.out.println(s2.b);
		s2.test();
		
	
		
		
		
		
		
	}

}
