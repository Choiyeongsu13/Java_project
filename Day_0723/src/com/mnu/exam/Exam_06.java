package com.mnu.exam;

class SuperA{}

class ChildA extends SuperA{	}

public class Exam_06 {
	public static void main(String[] args) {
		//조상은 자식 객체 생성 가능
		SuperA s = new SuperA();
		SuperA sa= new ChildA(); //업 케스팅
		//자식은 조상 객체 생성 불가
		//ChildA sa2 = new SuperA();
		
		double dd = 100; //자동형변환
//		ChildA ca = (ChildA)s; //강제 형변환 //컴파일은 성공 , 런타입 오류 발생
		
		ChildA ca = (ChildA)sa; //다운 캐스팅 SuperA sa= new ChildA() //강제 형변환
	}

}
