package com.mnu.exam01;

public class Exam_02 {

	public static void main(String[] args) {
		// 'A'는 char 타입 기본 자료형(상수)
		// "A"는 String 클래스의 인스턴스(객체)
		// String 클래스는 new 키워드 없이 리터럴(" ") 방식으로도 객체 생성이 가능함
		// 문자열 리터럴은 힙 영역 내부의 'String Constant Pool(문자열 상수 풀)'이라는 별도 공간에 저장되어 재사용됨
		
//		System.gc();    // 가비지 컬렉터(Garbage Collector) 수동 호출 요청
//		System.exit(0); // 현재 실행 중인 자바 가상 머신(JVM) 강제 종료
		
		// StringBuffer 객체 생성 (기본 용량 16 + "Java" 길이 4 = 총 20 공간 할당)
		StringBuffer sb = new StringBuffer("Java");
		
		// capacity(): 현재 StringBuffer 객체에 할당된 메모리 용량(버퍼의 크기)을 반환
		System.out.println("capacity : " + sb.capacity()); // 출력: 20
		System.out.println(sb); // 출력: Java
		
		// append(): 기존 문자열의 맨 뒤에 새로운 문자열을 추가 (기존 객체 메모리 내부에서 직접 수정됨)
		sb.append("Program"); 
		System.out.println(sb); // 출력: JavaProgram
		
		// charAt(index): 해당 인덱스(위치)에 있는 문자를 단 한 개 가져옴 (0부터 시작)
		System.out.println("charAt  이후 :  " + sb.charAt(0)); // 출력: J
		
		// delete(start, end): start 인덱스부터 (end - 1) 인덱스까지의 문자열을 삭제
		// delete(0, 4) -> 0, 1, 2, 3번 인덱스인 "Java" 삭제
		sb.delete(0, 4); 
		System.out.println("delete 이후 : " + sb); // 출력: Program
		
		// deleteCharAt(index): 특정 인덱스 위치에 있는 단 하나의 문자만 삭제
		// deleteCharAt(0) -> 0번 인덱스인 'P' 삭제
		sb.deleteCharAt(0);
		System.out.println("deleteCharAt 이후  : " + sb); // 출력: rogram
		
		// insert(offset, str): 지정한 인덱스(offset) 위치에 새로운 문자열을 삽입
		// insert(0, "Java P") -> 맨 앞에 "Java P" 문자열을 끼워 넣음
		sb.insert(0, "Java P");
		System.out.println("insert 이후 : " + sb); // 출력: Java Program
		
		// length(): 버퍼의 전체 용량이 아닌, 현재 저장된 실제 문자열의 길이를 반환
		System.out.println("length 이후 :  " + sb.length()); // 출력: 12
		
		// setCharAt(index, ch): 지정한 인덱스 위치의 문자를 새로운 문자로 '변경(교체)'
		// setCharAt(0, 'A') -> 0번 인덱스의 'J'를 'A'로 변경
		sb.setCharAt(0, 'A');
		System.out.println("serCharAt 이후 : " + sb); // 출력: Aava Program
		
		// replace(start, end, str): start 인덱스부터 (end - 1) 인덱스까지의 구간을 지정한 문자열로 치환
		// replace(0, 3, "AAA") -> 0, 1, 2번 인덱스("Aav")를 "AAA"로 변경
		sb.replace(0, 3, "AAA"); // 현재 상태: AAAa Program
		
		// reverse(): 현재 저장된 문자열의 순서를 거꾸로 뒤집음
		sb.reverse();
		System.out.println("replace, reverse 이후 : " + sb); // 출력: margorP aAAA
	}

}