package com.mnu.exam03;

public class Exam_18 {

	public static void main(String[] args) {
		String str = "90,70,88,89,67,89,90";
		
		//문자열분리 split()= 배열전환
		String score[] = str.split(",");
		
		//총점 평균 
		int tot=0;
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			tot = tot +Integer.parseInt(score[i]);
		}
		System.out.println("===");
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + (double)tot/score.length);
		System.out.println("평균 : " + String.format("%.2f", (double)tot/score.length));
	}

}
