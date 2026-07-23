package com.mnu.exam;

//계산기
//접근제어자 private(같은 클래스내) 디폴트(같은패키지) protected(같은패키지,상속)  public
public class Cal2 {
	private int a;	
	private int b; //멤버 변수(인스턴스 변수)
	
	//생성자(클래스 이름과 동일한 메소드(), 반환 타입X)
	
	public Cal2(){} //객체 생성이 목적 , 디폴트 생성자 (아무일도 하지않음)
	//싱글톤은 private
	
	//오버로딩 : 이름은 같고 , 매개변수 (개수,타입,순서)가 다름
	public Cal2(int a) {
		this.a = a;
		//this 멤버 = 매개
		//b=a;
	}
	public Cal2(int a, int d) {
		this.a =a;
		b=d;		
	}
	//기능(메소드) 추가
	
	public void add(){
		double result = a+b;
		System.out.printf("%f + %f  = %f\n" ,a,b,result);
	}

	//static 클래스 메소드 new를 쓰기전에 생성
	//static은 힙에 저장 x, 정적 메소드 ,객체가아닌  클래스에 속한다.
	public static void add(int a, int b){
		int result = a+b;
		System.out.printf("%d + %d  = %d\n" ,a,b,result);
	}

	
	

}
