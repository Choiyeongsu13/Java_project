import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		/*
		 키보드로 입력 Scanner 클래스 도움으로 입력
		 정수, 실수, 문자열 구분하여 입력 가능
		 */
		// TODO Auto-generated method stub
		
		//객체 생성(클래스를 이용하여 객체 생성)
		
		Scanner scn = new Scanner(System.in);

		Scanner scn2 = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학 입력 : ");
		String name = scn2.next();
		int kor = scn2.nextInt();
		int eng = scn2.nextInt();
		int math = scn2.nextInt();
		double avg = (kor + eng + math)/3;
		
		System.out.println("이름은 : " + name + "\n국어 점수 : "+ kor +
				" 영어 점수 : " +  eng + " 수학 점수 : "+ math);
		System.out.println("총점은 : " + (kor+eng+math));
		System.out.println("평균은 : " + avg );
		
		
		
		
//		System.out.print("이름 입력 : ");
//		String na = scn.next();
//		System.out.print("국어 입력 : ");
//		int kor = scn.nextInt();
//		System.out.print("영어 입력 : ");
//		int eng = scn.nextInt();
//		System.out.print("수학 입력 : ");
//		int math = scn.nextInt();
//		
//		int tot = (kor + eng + math);
//		float ave = (tot/3);
//		
//		
//		System.out.println("이름은\t: " + na);
//		System.out.println("총점\t" +tot);
//		System.out.println("평균\t" + ave);
//				
//		
		

	}

}
