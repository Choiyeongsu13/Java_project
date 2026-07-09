import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
//키보드 정수 입력받아 80이상이면 "pass"
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
		
		String pass = (score>80)? "pass":"";
		if(score>=80) {
			System.out.println("합격");
		}
		System.out.print(pass);
		
		
	}

}
