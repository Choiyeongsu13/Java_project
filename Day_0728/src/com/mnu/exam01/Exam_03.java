package com.mnu.exam01;

abstract class animal2{
	abstract void sound();
	
	void move() { //오버라이딩을 해도 되고 안해도 된다, 일반 메소드는 자유
		System.out.println("동물 이동");
	}
}

class dog extends animal2{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	void move() { //오버라이딩이 된게 호출
		System.out.println("동물 이동2");
	}
}


public class Exam_03 {

	public static void main(String[] args) {
		animal2 a = new dog();
		a.move();
		a.sound();
		
	}

}
