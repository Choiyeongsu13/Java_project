package com.mnu.exam03;


class AA{
	int a;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return true;
		}else {
			return false;
		}
	}
}
class BB{
	
}


public class Exam_11 extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a1 = new AA();
		AA a2 = new AA();
		BB b1 = new BB();
	
		
		System.out.println("a1주소 : " +a1);

		System.out.println("a2주소 : " +a2);
		if(a1==a2) { //주소가 같은가?
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		if(a1.equals(a2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");				
		}
		if(a1.equals(b1)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");				
		}
		
	}

}
