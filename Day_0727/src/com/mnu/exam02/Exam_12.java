package com.mnu.exam02;

abstract class AA{
	int a=10;
	void test() {
		 //일반클래스 
	}
	abstract void add(int a, int b); //상속자가 오버라이딩을 안하면 에러, 강제
}

class subaa extends AA{
	@Override //어노테이션
	void add(int a, int b) {
	
		
		
	}
	
}


public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스 abstract는 new를 쓸수없음 (미완성 클래스)
		AA a= new subaa();
		
	}

}
