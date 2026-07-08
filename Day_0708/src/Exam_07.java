import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력하시오");
		String str1 = sc.next(); //문자열1 문자열2 (공백을 보지않음)
		String str2 = sc.next();
		
		System.out.print("2. 입력하시오");
		String str3 = sc.nextLine(); //srt1 srt2//치고나서 공백부터 끝까지 
		
		System.out.println("1번 " + str1 + " 2번 "+str2);
		System.out.println("3번 " + str3);
		
	}

}
