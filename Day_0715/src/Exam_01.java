import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,8진수 변환
		Scanner sc =new Scanner(System.in);
	
		while(true) {
			System.out.println("10 진수 입력");
			int dec = sc.nextInt(); // 예: 30입력
			if(dec==0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("변환 (2,8) ");
			int con = sc.nextInt(); //예 : 2 입력
			
			//진법 변환
			String str=""; //변환값
			int imsi = dec; //몫
			while(imsi !=0) {
				int mok = imsi/con;  // 30 /2 = 15(몫)
				int na = imsi%con;  // 나머지
				str = na+ str; // 나머지 입력
				imsi = mok; // 한차례 입력후 다시 나누기
				
				// imsi = imsi/con; 
				
			}
			
			//출력
			System.out.println("10진수 : " + dec);
			System.out.println(con + " 진수 : " + str );
			
			
			
	}
		
		

	}

}
