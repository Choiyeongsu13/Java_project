package com.mnu.exma03;


import java.util.*;

public class Exam_08 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		
		Deque<Integer> stack2 = new ArrayDeque();
		
		//삽입
		stack.push(123);
		stack.push(456);
		stack.push(789);
		stack.push(012); //0이 있기에 8진수로 인식함
		stack.push(0x12); //0이 있기에 16진수로 인식함
		
		stack2.push(123);
		stack2.push(456);
		stack2.push(789);
		stack2.push(012); //0이 있기에 8진수로 인식함
		stack2.push(0x12); //0이 있기에 16진수로 인식함
		
		System.out.println("전체 : " + stack); //1
		System.out.println("객체 수  :" + stack.size());
		
		System.out.println("마지막 입력 객체 : " + stack.peek());

		System.out.println("마지막 입력 객체 꺼내기 : " + stack.pop());
		System.out.println("객체 수  :" + stack.size());
		//확장 for
		for(Integer data : stack) { // 꺼낸오는 작업이아닌 확인하는 작업 1과 동일
			System.out.println(data); //확장 for문 의미 x
		}
		System.out.println("객체 수  :" + stack.size());
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}System.out.println("객체 수  :" + stack.size());
		
		for(Integer data : stack2) { // 꺼낸오는 작업이아닌 확인하는 작업 1과 동일
			System.out.println(data); //확장 for문 의미 x
		}
		System.out.println("객체 수  :" + stack2.size());

	}
	
	

}
