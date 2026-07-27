package com.mnu.exam02;

interface cc{ //인터페이스는 안에들어가는것들이 전부 추상메소드
	static final double PI=3.14; //상수
	void test(); // 추상은 이것이 들어가야 하지만 public abstract 이 생략가능
	int a(int a, int b); 
	public abstract int s(int a, int b);
}

//인터페이스 구현하여 클래스 생성 
class ExamCCC implements cc { //implements 는 구현 , 인터페이스를 실제 클래스로만드는 구현체
	@Override
	public int a(int a, int b) {
		// TODO Auto-generated method stub
		return 0;}
	@Override
	public int s(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}

interface CCC_1 extends cc{
	void size();
	
}

public class Exam_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc a = new ExamCCC();
		
		

	}

}
