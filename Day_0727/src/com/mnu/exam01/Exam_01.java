package com.mnu.exam01;

public class Exam_01 {
	static int nsize=4;
	public static void makeArray(int[] arr) {
		for(int i=0; i<nsize; i++) {
			arr[i]=i;
		}
	}
	

	public static void main(String[] args) { //main과 동급인 모든 메소드는 static을 붙여야한다. 
		// TODO Auto-generated method stub //static을 쓰는건 객체를 쓰지않겠다
		int[] arr = new int[nsize]; 
		makeArray(arr); //[0,1,2,3]
		for(int i=0; i<nsize; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
