import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 자바 기본타입 : 8종류 
		 [논리 타입 : boolean(1byte) 
		 정수 타입 : byte(1byte), short(2byte), char(2byte,65000)
		 , int(4byte,20억), long(8byte)
		 실수 타입 : float(4byte) ,double(8byte) ]
		 				1byte = 8비트  
		 작은거는 큰것으로 갈때 형변환이 일어난다 
		 형변환 (자동, 강제)
		 참조 타입 : class(String),Array				
		 */
		
		boolean bool = true; 
		byte by = 120; // -128 ~ 127
		//byte by2 =130; 
		short sh= 22000;  // -32000 ~ 32000
		
		char ch1 = 68;  //+ 정수가능 0~65000
		char ch2 = 'f'; //문자만
		
		int in1 = 700000; // -20 ~ 20 억
		int in2 = 'a'; //자동 형변환
		int in3 = 65;
		System.out.println(in2);
		
		// float fl1 = 3.14; //실수의 기본은 double
		float fl2 = 3.14f;
		float fl3 = (int)3.14; //강제 형변환
		
		double do1 = 3.14;
		
		System.out.println("boole 값: " + bool);
		System.out.println("by 값 : " + by);
		System.out.println("sh 값 : " + sh);
		System.out.println("ch1 값 : " + ch1);
		System.out.println("ch2 값 : " + ch2);
		
		System.out.println("float 값 : " + fl2);
		System.out.println("float 값 : " + fl3);
		System.out.println("double 값 : " + do1);
		
	}

}
