import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*키보드로 이름 국어 영어 수학점수를 입력 총점 평균 판정을 구하여 출력
		1. 입력은 한줄로 입력
		 입력 : 이학생 99 88 79
		2. 평균은 소수이하 3째자리에서 반올림
		3. 판정은 3과목 모두 60점 이상, 평균 80 이상 합격 아니면 불합격
		4. 출력은 다음처럼
		이름	총점	평균	판정
		이학생	xx	xx	합격
		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		System.out.print("이름, 국어, 영어, 수학 점수를 입력해주세요 : ");
		String na = sc.next();
		int kor =sc.nextInt();
		int eng =sc.nextInt();
		int math =sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total/3;
		
		//double avg = (int)(total /3. * 100 + 0.5 /100.;
		
		if(avg >= 80 && kor>=60 && eng >=60 && math >=60) {
			str = "합격";
		}else {
			str ="불합격";
		}
		// str = (avg>=80)? "합격":"불합격";
		
		System.out.println("이름\t총점\t평균\t판정\t");
		System.out.printf(na +"\t"+ total +"\t"+ String.format("%.2f", avg)+"\t" +str+"\t");
		
		
	}

}
