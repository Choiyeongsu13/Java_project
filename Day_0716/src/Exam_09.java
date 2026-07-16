//키보드로 정수 연산자 정수 입력하면 사직연산를하는 프로그램

import java.util.Scanner;

public class Exam_09 {
	static void add(int a, int b) {
		System.out.println(a + "+" + b +'='+(a+b));
	}
	static void sub(int k1,int k2) {
		int r =k1 - k2;
		
		System.out.printf("%d - %d = %d\n",k1 , k2 , r);
	}
	
	static void mul(int k1,int k2) {
		int r =k1 * k2;
		
		System.out.printf("%d * %d = %d\n",k1 , k2 , r);
	}
	static void div(int k1,int k2) {
		int r =k1 / k2;
		
		System.out.printf("%d / %d = %d\n",k1 , k2 , r);
	}
	static void mod(int k1,int k2) {
		int r =k1 % k2;
		
		System.out.printf("%d %% %d = %d\n",k1 , k2 , r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next();
		int b =sc.nextInt();
		
		if(op.equals("+")){
		add(num,num2);	}
		
		else if(op.equals("-")) {
		sub(num,num2); }
		else if(op.equals("*")) {
		mul(num,num2);}
		else if(op.equals("/")) {
		div(num,num2);}
		else if(op.equals("%")) {
		mod(num,num2);}
		
		else {
			System.out.println("모름");
		}
	

 }
}	
