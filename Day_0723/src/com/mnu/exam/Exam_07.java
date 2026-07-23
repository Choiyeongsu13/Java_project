package com.mnu.exam;

class EE{
	
}

class ChEE extends EE{
	
}


public class Exam_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EE e = new ChEE();
		//객체 타입 확인 instanceof 연산자
		if (e instanceof ChEE) { //앞은 변수 뒤는 클래스
			System.out.println("같은 타입") ;
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("다른 타입");
		}
		
		if (e instanceof EE) { //앞은 변수 뒤는 클래스
			System.out.println("같은 타입") ;
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("다른 타입");
		}
		

	}

}
