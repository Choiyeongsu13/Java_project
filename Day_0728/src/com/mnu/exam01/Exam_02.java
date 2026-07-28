package com.mnu.exam01;

abstract class animal{ //추상메소드가 하나라도 있다면 추상 클래스로 만들어져야 함
	abstract void sound(); //추상메소드
}				//인터페이스는 일반 멤버변수, 일반메소드를 포함할수 없음 ,추상메소드와 상수만 가능

class cat extends animal{
	@Override
	void sound() {
		
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		animal a = new cat();
		
	}

}
