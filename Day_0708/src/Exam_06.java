import java.util.Scanner;

public class Exam_06 {
	
	/*
	 이름 :
	 국어 :
	 영어 :
	 수학 :
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String na = sc.next();
		
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		double avg = (double)tot/3; //int 인 tot를 double 실수형으로 바꾸는 형 변환
		
		System.out.println("이름은\t" + na + "\n국어 점수는 : "+kor+"\n영어 점수는 : "+eng+"\n수학 점수는 : "+math+"\n");
		System.out.println("총점은\t" + tot);
		System.out.println("평균은\t" + avg);
		
		
		
		

	}

}
