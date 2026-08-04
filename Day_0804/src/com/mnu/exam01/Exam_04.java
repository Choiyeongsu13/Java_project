package com.mnu.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<DeptDTO> set = new HashSet();
		
		set.add(new DeptDTO(10,"AAA","BBB1"));
		set.add(new DeptDTO(20,"AAA","BBB1"));
		set.add(new DeptDTO(30,"AAA","BBB1"));
		set.add(new DeptDTO(30,"AAA","BBB1"));
		set.add(new DeptDTO(40,"AAA","BBB1"));

		System.out.println(set.size());
	} 

}
