package com.mnu.exam01;

class Parent{
	void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	void show() {
		System.out.println("Child");
	}
}

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent pa = new Child();
		pa.show();

	}

}
