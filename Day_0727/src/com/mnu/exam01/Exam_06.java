package com.mnu.exam01;


	class AAA{
		int a;
		AAA(int a) {//3 , 5
			this.a=a;
		}
		int func() { 
			int b=1;
			for(int i=1; i<a; i++) {
				b=a*i+b; // 
			}
			return a+b; //
		}
	}
	public class Exam_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA obj =new AAA(3);
		obj.a=5;
		int b=obj.func();
		System.out.print(obj.a + b);
		

	}

}
