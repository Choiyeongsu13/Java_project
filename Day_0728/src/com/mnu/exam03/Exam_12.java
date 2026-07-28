package com.mnu.exam03;

class CC{
	int bun;
	String name;
	
	CC(int bun, String name){
		this.bun = bun;
		this.name =name;
	}
	@Override
	public String toString() { //주소값이 아닌 원하는 값 출력을 위해 toString 사용, 일반은 객체의 주소를 반환
		// TODO Auto-generated method stub
		return bun + " " + name;
	}
	
	
}

public class Exam_12 {

	public static void main(String[] args) {
		CC c1 = new CC(1,"김학생");
		String na = new String("김학생"); 
		
		System.out.println("c1 = " + c1);
		System.out.println("name = " + na);
		
	}

}
