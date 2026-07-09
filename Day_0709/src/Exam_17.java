import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("정수 입력(1~200)");
	
		int str = scn.nextInt();
		
		if(str<1 || str>200) {
			System.out.println("입력오류");
			System.exit(1);
		}
		if ( str>=65 && str<=90) {
		
		char ch = (char)str;
		System.out.println("str : " + ch);
		}
		if ( str>=97 && str<=112) {
			
		char ch = (char)str;
		System.out.println("str : " + ch);
		}
		
		
		
		
		
		
		

	}

}
