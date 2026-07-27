package com.mnu.exam01;

public class Exam_02 {
	
	static int mp(int base, int exp) { //2, 10
		int res=1;
		for(int i=0; i<exp; i++) { //10
			res *= base; // 
		}
			return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		res = mp(2,10);
		System.out.print(res);

	}

}
