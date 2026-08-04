package com.mnu.exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set 인터페이스 ; 클래스 : HashSet
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		set.add("이가랑");
		set.add("김가랑");
		set.add("김가랑");
		set.add("사가랑");
		set.add("고가랑");
		
		//해시 출력법
		System.out.println("객체 확인"+ set);
		//1 확장 for()
		for(Object obj : set) {
			System.out.print(obj);
		}
		//2 반복자 Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {//존재하면
			System.out.print(iter.next());
		}
		
		//3 ArrayList 변환 후
		List list = new ArrayList(set);
		
		
	
	}
	

}
