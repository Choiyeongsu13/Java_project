/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Exam_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*키보드로 이름 국어 영어 수학점수를 입력 총점 평균 판정을 구하여 출력
		1. 입력은 한줄로 입력
		 입력 : 이학생 99 88 79
		2. 평균은 소수이하 3째자리에서 반올림
		3. 판정은 3과목 모두 60점 이상, 평균 80 이상 합격 아니면 불합격
		4. 불합격 사유 출력
			- 한과목이라도 60 미만 인 경우 "과락"
			- 세과목 모두 60 이상이거나 평균이 80미만이면 "평균미만"
		5. 출력은 다음처럼
		이름	총점	평균	판정
		이학생	xx	xx	합격
		*/
		
		Scanner sc = new Scanner(System.in);
		String str = ""; //판정
		String str2 = ""; //불합격 이유
		
		
		System.out.print("이름, 국어, 영어, 수학 점수를 입력해주세요 : ");
		String na = sc.next();
		int kor =sc.nextInt();
		int eng =sc.nextInt();
		int math =sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total/3;
		
		//double avg = (int)(total /3. * 100 + 0.5 /100.;
		
		if(kor>=60 && eng >=60 && math >=60) { //60점 미만 확인
			if(avg >= 80) { // 평균 미만 확인
				
				str2 ="합격";
				str ="사유 없음";
				
			}else{
				str2 = "불합격";
				str="평균 미만";
				}
		
		}else{
			str2 = "불합격";
			str = "과락";
		}
		
		
		
		// str = (avg>=80)? "합격":"불합격";
		
		System.out.println("이름\t총점\t평균\t판정\t불합격 사유");
		System.out.printf(na +"\t"+ total +"\t"+ String.format("%.2f", avg)+"\t" +str2+"\t" + str);
		
	}

}
