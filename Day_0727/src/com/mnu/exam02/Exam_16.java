package com.mnu.exam02;

//익명 구현 객체 = 구현체 이름이없는것 별도의 클래스 x
interface  InterA{
	void exam(int a);
}
class Exaa implements InterA{
	@Override
	public void exam(int a) {
		// TODO Auto-generated method stub
		System.out.println("a = " + a);
	}
}
public class Exam_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exaa a = new Exaa();
		a.exam(100);
		InterA a2 = new Exaa();
		a2.exam(10);
		
		//익명 구현 객체 만들기 //일회성
		InterA a3 =new InterA() {
			
			@Override
			public void exam(int a) {
				// TODO Auto-generated method stub
				System.out.println("개졸려" + a);
			}
		};
		a3.exam(1000);
		
	}

}
