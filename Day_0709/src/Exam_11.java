import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //조건연산자
		// 키보드로 정수를 입력 홀수 또는 짝수를 판별하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		//결과를 짝수이면서 true 홀수 이면 false 
		
		boolean bool =num%2==0;
		
		System.out.println(bool);
		
		//결과가 짝수이면 false 홀수이면 true
		
		boolean boola =num%2==1;
		System.out.println(boola);
		
		boolean boolb = num%2==1;
		
		String str = (boolb)? "홀수":"짝";
		
		System.out.println("결과는 : "+str);
		
		String str2 = (num%2==1)? "홀수":"짝수";
		
		System.out.println("결과는 : "+str2);
	}

}
