import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 실수를 입력, 입력된 값이 85 ~ 95 사이면 "pass" 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		double num = sc.nextDouble();
		
		String str = ((95>num)&&(num>85))? "Pass":"No";
		System.out.println(str);
		
		
		
	}

}
