package com.mnu.exam04;

import java.util.Arrays;

/*
 * 배열에는 95,75,85,100,50
 * 배열에는 저장된 값을 오름차순으로 정렬
 */

public class Exam_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int E [] = {95,75,85,100,50};
		int i =0; int temp=0;
		do {
			int j = i; //0
			do {
				if( E[i]>E[j]) {//95>75 0 0
					temp = E[i]; //temp =95 0
					E[i]=E[j]; // i = 75 00
					E[j]= temp; // j = 95 
				}
				j++;
			}while(j<5);
			i++;
		}while(i<4);
		for(int a=0; a<5; a++) {
			System.out.print(Arrays.toString(E));
		}
		
		

	}

}
