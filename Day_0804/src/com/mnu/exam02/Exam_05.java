package com.mnu.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map 인터페이스 : HashMap
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("A", "홍길동"); //값 집어넣을때 put
		map.put("B", "이길동"); 
		map.put("C", "고길동"); 
		map.put("C", "삼길동"); 
		map.put("D", "이길동"); 
		map.put("E", "통길동"); 
		
		
		System.out.println("객체 수 : " + map.size());
		System.out.println("객체 수 : " + map);
		
		System.out.println("키 A 값 : " + map.get("A"));
		
		// 키값만 추출
		Set keySet = map.keySet();
		System.out.println(keySet);
		
		for(Object obj : keySet) {
			System.out.println(obj + " " + map.get(obj));
		}
		//람다식을 이용한 출력
		map.forEach((key, value) ->{
			System.out.println(key + ":" + value);
		});
		
		
		
	}

}
