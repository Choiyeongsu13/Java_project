package com.mnu.exam01;

interface Number{
	int add(int[] v, boolean odd);
}

class NaturalNumber implements Number{
	@Override
	public int add(int[] v, boolean odd) { //배열을 넘기면 주소가 감, 공유방식
		int sum =0;
		for(int i = 0; i<v.length; i++) { //9까지
			if((odd && v[i]%2!=0) || (!odd && v[i]%2 ==0)) { //13579, 2468
				sum +=v [i];
			}
		}
		return sum;
	}
}

public class Exam_06 {

	public static void main(String[] args) {
		int v[] = {1,2,3,4,5,6,7,8,9}; 
		NaturalNumber num = new NaturalNumber();
		System.out.println(num.add(v, true)+ " , " + num.add(v, false)); //25/20
		
	}

}
