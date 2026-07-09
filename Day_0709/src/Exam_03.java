import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 객체 생성
		 Scanner sc = new Scanner(System.in);
		 메소드 = next(); 문자열 입력
		 		nextInt(); 정수 입력
		 		nextBoolean()
		 		nextDouble() 실수 입력
		 		nextLine() 한줄 전체 , 공백 인식 x
		 
		 */
		//이름 국어 영어 수학 점수 입력, 총점, 평균(실수) 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String st = sc.next();
		System.out.print(st +"\n");
		
		System.out.print("국어,영어,수학 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		System.out.print(" = "+ kor +" "+ eng+" " + math+" " + "\n");
		
		int tot = kor+eng+math;
		
		//double avg = tot/3 //정수
		double avg = (double)tot/3.; // 결과가 실수
		
		
		System.out.print("총점 : " + tot + " 평균 : "+avg);
	}


}
