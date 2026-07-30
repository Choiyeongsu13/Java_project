package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 사항
		List<person> plist = new ArrayList(); //person 클래스 만 저장
		String n = "감";
		int a = 30;
		boolean b =false;
		person p1 = new person(n,a,b);
		plist.add(p1);
		p1 = new person("소씨",123,true);
		plist.add(p1);
		
		
		plist.add(new person("삼씨",213,true));
		System.out.println("전체 사원 : " + plist);
		System.out.println("이름\t나이\t성별 : ");
		for(person p : plist) {
			System.out.print(p.name + "\t");
			System.out.print(p.age + "\t");
			if(p.gender)
			System.out.print("남자\n");
			else
			System.out.print("남자\n");
		}

	}

}
