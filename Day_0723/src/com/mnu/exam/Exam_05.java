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
		DD d= new ChDD(); //업 케스팅
		System.out.println(d.a);
//		System.out.println(d.b); //접근불가
		
		d.exam(); //오버라이딩된 메소드가 호출
		

	}

}
