import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int val = sc.nextInt();
		
		String str = "";
		if(val>=80) {
			if(val<=90) {
				str = "80 ~ 90 pass";
			}else {
				str = "80이상 90 초과 No";
			}
		}else {
			str = " 80미만 No";
		}
		System.out.println(val + " 점수 결과는 : " + str);
		

	}

}
