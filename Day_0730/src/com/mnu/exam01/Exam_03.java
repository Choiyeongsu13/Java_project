package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList<Integer>(); //위와 같은 방법
		
		list.add(10);
//		list.add("20"); 에러, 처음부터 정수로 선언함
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println("전체 객체 : " + list);
		
		//합계
		int s=0;
		int data;
		for(int i = 0 ; i<list.size(); i++) {
			data = list.get(i);
			data += data;
			System.out.println(" f " +data);
			System.out.print(list.get(i));
			
		
		}
		
	}

}
