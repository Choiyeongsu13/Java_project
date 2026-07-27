package com.mnu.exam02;


abstract class BB{
	abstract int a(int a, int b); //10 , 20
	abstract void b(int a);//100
}

class subBB extends BB{
	int r;
	@Override
	int a(int a, int b) {
		 r = a+b;
		
		 return r;
	}
	@Override
	void b(int a) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new subBB();
		int s= b.a(10, 20);
		System.out.println(s);
		b.b(100);

	}

}
