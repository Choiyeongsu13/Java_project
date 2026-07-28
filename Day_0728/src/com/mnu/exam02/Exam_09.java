package com.mnu.exam02;
class Sawon{
	String name;
	void print() { //메소드
		try {
		if(name.equals("aaaa")) {
			System.out.println("name = " + name);
		}else {
			System.out.println("name = null");
		}
		}catch(NullPointerException e) {
			System.out.println("이름이 없으면 flase");
		}
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		Sawon sa = new Sawon();
		sa.print();
		

	}

}
