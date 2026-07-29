package com.mnu.exam01;

class AA {
	int bun = 10;
	String name= "홍길동";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bun + name;
				}
}

//==,equals() 의차이 ==는 같은 주소 , equlas() 객체를 비교 면접에서 자주나옴

public class Exam_01 {
	public static void main(String[] args) {
		String str = new String("AAA"); // toString 오버라이드
		AA a = new AA(); //객체 , 참조변수 에는 주소가 원칙
		
		System.out.println("str =  " +str);
		System.out.println("a= " + a);
		
		
	}

}
