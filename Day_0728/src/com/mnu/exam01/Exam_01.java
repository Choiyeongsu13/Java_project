package com.mnu.exam01;

class AAA{
	int x=3;
	int getX() { //메소드
		return x*7;
	}
}
class BBB extends AAA{
	int x=7;
	int getX() { //오버라이딩
		return x*3; // x= 7 , super.x = 3
	}
}


public class Exam_01 {

	public static void main(String[] args) {
			AAA obj1= new BBB();
			BBB obj2 = new BBB();
			System.out.println(obj1.getX() + obj1.x + obj2.getX()+obj2.x); //21 3 21 7
	}

}
