package com.mnu.exam01;

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,1,2};
		int b=1, c=2;
		int r=func(func(b,c),3,func(a));
		System.out.print(r);

	}
	static int func(int x, int y) {
		return x+y; //3
	}
	static int func(int x, int y, int z) {
		return x-y-z;  //0
	}
	static int func(int x[]) {
		int s=0;
		for(int i =0; i<x.length; i++) {
			s = s +x[i]; 
		}
			return s; //2
		
	}

}
