package com.mnu.exam01;

class Static {
	public int a=20;
	static int b =0;
}



public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		Static.b=a; //10
		Static st= new Static(); 
		
		System.out.println(Static.b++); //10
		System.out.println(st.b); //11
		System.out.println(a); //10
		System.out.println(st.a); //20
	}

}
