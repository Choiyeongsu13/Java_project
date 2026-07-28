package com.mnu.exam02;
class Sawon2{
	String name;
	void print() throws NullPointerException{ //메소드 
		
			//1. 예외처리를 떠넘김 , 
			//throws : 미루기 (떠넘기기)
			//throw : 예외발생 (예외를 임의로 만들어냄)
		if(name.equals("aaaa")) {
			System.out.println("name = " + name);
		}else {
			System.out.println("name = null");
		}
		}
	
}

public class Exam_10 {
	public static void main(String[] args) {
		Sawon2 sa = new Sawon2();
		
		try {
		sa.print(); //2.  void print()가 필요한 쪽에 예외가 떠넘겨짐
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
