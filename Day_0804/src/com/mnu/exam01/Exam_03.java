package com.mnu.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet();
		Set<String> set2 = new HashSet();
		
		set.add(1);
		set.add(new Integer(2));
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		System.out.println(set);
		
		set2.add("A");
		set2.add("b");
		set2.add("C");
		set2.add("D");
		set2.add("F");
		
		System.out.println(set2);
		System.out.println(set2.contains("A"));
	}

}
