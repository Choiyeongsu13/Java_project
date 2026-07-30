package com.mnu.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 키보드로 학생정보를 입력 학생객체를 생성 List에 저장후
 * 총점,평균,핟점을 구하여 출력
 * [입력형식]
 * 학생정보 입력 : 1101 이학생 90 80 90
 * 
 * [출력 형식]
 * 번호 이름 국어 영어 수학 총점 평균
 * 
 * [처리 조건]
 * 5명 입력, 동일한 번호가 있는 경우 "이미 등록된 학생입니다" 출력 후 재입력
 */
public class Exam_06 {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int tot ;
		int avg;
		
		for(int i =0 ; i<3; i++) {
		System.out.print("학생 정보 입력 : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		//중복 검사
		boolean bool = false;
		for(int x=0;x<stu.size(); x++) {
			if(bun==stu.get(x).getBun()) {
				System.out.println("같은 학번 입력 확인, 재입력 ");
				bool = true;
				break;
			}
			}
			if(bool) {
				i--;
				continue;
			}
			Student stu1 = new Student(bun, name, kor, eng, math);
			stu.add(stu1);
		}

		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for(Student s : stu) {
		
		System.out.print(s.getBun() + "\t");
		System.out.print(s.getName() + "\t");
		System.out.print(s.getKor() + "\t");
		System.out.print(s.getEng() + "\t");
		System.out.print(s.getMath() + "\t");
		tot = s.getKor() + s.getEng()+ s.getMath(); 
		avg = tot/3;
		System.out.print(tot+ "\t");
		System.out.print(avg+ "\t");
		}
	}

}
