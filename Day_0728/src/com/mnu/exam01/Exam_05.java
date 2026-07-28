package com.mnu.exam01;

interface Remote{
	void powerOn();
}

class Tv implements Remote{
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("tv 전원 on");
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		Remote r = new Tv();
		r.powerOn();

	}

}
