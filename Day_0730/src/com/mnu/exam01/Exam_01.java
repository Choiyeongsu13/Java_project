package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_01 {

	public static void main(String[] args) {
		List alist = new ArrayList();
		
		//비어 있는지 검사
		if(alist.isEmpty()) {
			System.out.println("비어있음");
		}
		if(alist.size() == 0 ) {
			System.out.println("비어있음");
		}
		
		//객체 추가
		boolean bool = alist.add(1234);
		if(bool) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		alist.add(1234); //(object)int 1234
		alist.add("java");
		alist.add(false);
		alist.add('a');
		
		System.out.println(alist); //모든 타입이 다 들어가지만 object 객체임
		//객체 수
		int cnt = alist.size();
		
		System.out.println("List에 저장된 객체 수 : " +  cnt);		
		//객체 꺼내오기
		
		System.out.println("0번째 위치 객체 : " + alist.get(0));
		
		//전체 객체 꺼내기 : 기본 for 
		for(int i = 0 ; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		for(Object x : alist) { //확장 for문 사용법
			System.out.println(x);
		}
		
		
		
	}	

}
