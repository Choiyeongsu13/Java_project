import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,8 , 16진수 변환
		Scanner sc =new Scanner(System.in);
	
		while(true) {
			System.out.println("10 진수 입력");
			int dec = sc.nextInt(); // 예: 30입력
			if(dec==0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("변환 (2,8,16) ");
			int con = sc.nextInt(); //예 : 2 입력
			
			//진법 변환
			String str=""; //변환값
			int imsi = dec; //몫
			while(imsi !=0) {
				//int mok = imsi/con;  // 30 /2 = 15(몫)
				int na = imsi%con;  // 나머지
				switch(na) {
				case 10:
					str = "A" + str;
					break;
				case 11:
					str = "B" + str;
					break;
				case 12:
					str = "C" + str;
					break;
				case 13:
					str = "D" + str;
					break;
				case 14:
					str = "E" + str;
					break;
				case 15:
					str = "F" + str;
					break;
					
					default:
						str = na+ str; // 나머지 0~9
				}
				
				//imsi = mok; // 한차례 입력후 다시 나누기
				imsi = imsi/con; 
				//출력
				System.out.println("10진수 : " + dec);
				System.out.println(con + " 진수 : " + str );
				
			}
			}
			

			
			
	}
		
		

}


