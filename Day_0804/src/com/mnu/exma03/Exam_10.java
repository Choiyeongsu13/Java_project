package com.mnu.exma03;

import java.util.Stack;

//학생 객체 생성
//스택에 저장 후 출력
public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Student> stu = new Stack<Student>();
		
		//stk.push(111,"김학생",100,100,100);
		stu.push(new Student(1,"김학생",100,100,100));
		stu.push(new Student(2,"저학생",100,100,100));
		stu.push(new Student(3,"이학생",100,100,100));
		stu.push(new Student(4,"소학생",100,100,100));
		stu.push(new Student(5,"고학생",100,100,100));
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		while(!stu.isEmpty()) {
		Student st = stu.pop();
		System.out.print(st.getBun()+"\t");
		System.out.print(st.getName()+"\t");
		System.out.print(st.getKor()+"\t");
		System.out.print(st.getEng()+"\t");
		System.out.print(st.getMath()+"\t");
		int tot= st.getKor()+st.getEng()+st.getMath();
		System.out.print(tot+"\t");
		double avg = (double)tot/3;
		System.out.printf("%.2f \n",avg);
		}
	}

}
