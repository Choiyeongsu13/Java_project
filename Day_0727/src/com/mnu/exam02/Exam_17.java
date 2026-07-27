package com.mnu.exam02;

interface InterB{
	int add(int a, int b);
}


public class Exam_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명 구현체를 이용한 a ~ b 합계 계산
		InterB bc = new InterB() {
			
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				
				return a+b;
			}
		};
		System.out.println(bc.add(1,3));
		
	}

}
