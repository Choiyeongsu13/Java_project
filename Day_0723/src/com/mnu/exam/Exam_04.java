package com.mnu.exam;

class CC{
	int a=10;
	void exam() {
		System.out.println("a= " + a);
	}
}
//final : 클래스 -> 상속불가 , 메소드 -> 오버라이딩 불가, 변수 ->변경불가
//클래스에 붙으면 상속이안됨, 변수에붙으면 상수화됨
class ChCC extends CC{
	int b= 100;
	void test() {
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	}
	//오버 라이딩 = 재정의 
	void exam() {
		super.exam();
		System.out.println("a= " + a);
	}
	void exam(int a) { //오버로딩 : 매개변수
		System.out.println("a= " + a);
	}
	
}



public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
