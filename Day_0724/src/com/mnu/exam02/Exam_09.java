package com.mnu.exam02;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=3 , x=4, y=3, z=6; //11 , 100, ,11 , 110
		if((w==2 | w==y)& !(y>z)&(1==x^y !=z)) { // 2 , 3 (10 , 11) ,1111
			// 3     and     T		1      -7
			w= x+y;
		}else {
			w = y +z;
		}
		System.out.println(w);

	}

}
