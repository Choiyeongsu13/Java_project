package com.mnu.exam04;

public class Exam_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] rank = new int [5];
		int [] arr = {75,32,20,99,55};
		
		for(int i=0; i<5; i++) {
			rank[i]=1; //0 //1 // 2 //3 //4
			for(int j=0; j<5; j++) {
				if(arr[i]<arr[j]) { 
					rank[i]++; //[0]2 [1]4 [2] 5 [3] 1 [4] 3
				}
			}
		}
		for(int k=0;k<5; k++) {
			System.out.println(rank[k]);
		}
		
		

	}

}
