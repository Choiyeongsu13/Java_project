package com.mnu.exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_04 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		
		a.add("김");
		a.add("이");
		a.add("박");
		a.add("강");
		a.add("홍");
		a.add("최");
		
		//리스느 출력 -1 기본 for
		for(int i = 0 ; i<a.size(); i ++) {
			System.out.println(a.get(i)+" ");
		}
		
		//리스트 출력 -2 확장 for
		
		for(String x : a) {
			System.out.print(x);
		}
		
		
		//리스트 출력 -3 반복자 Iterator 인터페이스
		System.out.println("반복자");
		
		Iterator<String> iter = a.iterator();
		while(iter.hasNext()) { // 존재하면
			System.out.println(iter.next() + " ");
			
		}
		
	}

}
