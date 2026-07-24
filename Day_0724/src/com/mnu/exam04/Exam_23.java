package com.mnu.exam04;

public class Exam_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,4,9,7,3,2,8};
		int s=0;
		int n = arr.length; //7
		for(int i=0; i<n; i++) {
			if(arr[i]%2 ==0) {
				continue;
			}s+=arr[i];
		}
		System.out.println(s);
	}

}
