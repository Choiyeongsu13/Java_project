import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//80이상이면 합격 아니면 불합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		String str ="";
		
		if(score>=80) {
			str = "pass";
			System.out.println("합격");
		}else {
			str = "no";
			System.out.println("불합격");		
			}
		System.out.println(str);

	}

}
