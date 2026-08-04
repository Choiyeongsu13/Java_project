package com.mnu.exma03;

import java.util.LinkedList;
import java.util.Queue;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.offer(100); //삽입
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);
		System.out.println("큐 객체 수 : " + queue.size());
		
		while(!queue.isEmpty()) {
			int a = queue.poll(); //제거
			System.out.println("꺼낸 객체 : " + a);
			System.out.println("큐 객체 수 : " + queue.size());
			
		}
		
	}

}
