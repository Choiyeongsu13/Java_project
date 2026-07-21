//학번 이름 국어 영어 수학 입력

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st1 = new student();
		Scanner sc = new Scanner(System.in);
		
		//키보드 입력(학생 객체 생성)
		System.out.println("학번 입력");
		st1.hakbun =sc.nextInt();
		System.out.println("이름 입력");
		st1.name = sc.next();
		System.out.println("국어 입력");
		st1.kor = sc.nextInt();
		System.out.println("영어 입력");
		st1.eng = sc.nextInt();
		System.out.println("수학 입력");
		st1.mat = sc.nextInt();
		
		int tot = st1.kor + st1.eng +st1.mat;
		double ave = (double)tot/3;
		//총점 평균구하고 출력
		// 학번 이름 국어 영어 수학 총점 평균
		st1.studenttotal(st1.hakbun,st1.name,st1.kor,st1.eng,st1.mat);
		
		
		
		//학점을 구하여 출력(A,B,C,D,F)
		// 학번 이름 국어 영어 수학 총점 평균
		st1.studentavg(tot,ave);
		
		st1.studentgrade(ave);

	}

}
