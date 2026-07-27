package com.mnu.exam01;




public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sg1 = Singleton.getInstance();
		sg1.count();
		Singleton sg2 = Singleton.getInstance();
		sg2.count();
		Singleton sg3 = Singleton.getInstance();
		sg3.count();
		
		System.out.print(sg1.getCount());

	}

}
