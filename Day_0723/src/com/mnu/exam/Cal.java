package com.mnu.exam;

//계산기
//접근제어자 private(같은 클래스내) 디폴트(같은패키지) protected(같은패키지,상속)  public
public class Cal {
	private int a;	
	private int b; //멤버 변수(인스턴스 변수)
	
	//생성자(클래스 이름과 동일한 메소드(), 반환 타입X)
	
	public Cal(){} //객체 생성이 목적 , 디폴트 생성자 (아무일도 하지않음)
	//싱글톤은 private
	
	//오버로딩 : 이름은 같고 , 매개변수 (개수,타입,순서)가 다름
	public Cal(int a) {
		this.a = a;
		//this 멤버 = 매개
		//b=a;
	}
	public Cal(int a, int d) {
		this.a =a;
		b=d;		
	}
	//기능(메소드) 추가
//	public void add() {
//		int result = a+b;
//		System.out.printf("%d + %d  = %d\n" ,a,b,result);
//	}
	
	public void add(double a, double b){
		double result = a+b;
		System.out.printf("%f + %f  = %f\n" ,a,b,result);
	}

	public void add(int a, int b){
		double result = a+b;
		System.out.printf("%d + %d  = %d\n" ,a,b,result);
	}
	
	public void add(int a, double b){
		double result = a+b;
		System.out.printf("%d + %f  = %f\n" ,a,b,result);
	}
	
	public void add(double a, int b){
		double result = a+b;
		System.out.printf("%f + %d  = %f\n" ,a,b,result);
	}
	
	
	
	

}
