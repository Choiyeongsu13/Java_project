package com.mnu.exam03;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chArr[] = new int[26];

		while(true) {
		String write = sc.next().toUpperCase();

		if (write.equals("END")) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }
		
		for(int x=0; x<write.length(); x++) {
			
			char store = write.charAt(x);
			int index= store-65;
			chArr[index]++;
		
		}
		
		}
		for(char store= 'A'; store<='Z'; store++) {
			System.out.printf("%3c",store);
		}
		System.out.print("\n");
		
		for(int i=0; i<chArr.length; i++) {
			System.out.printf("%3d", chArr[i]);
			}
		System.out.print("\n");
		
		int max  = chArr[0];
		char maxChar='A';
		for(int i=1; i<chArr.length; i++) {
			if(max<chArr[i]) {
				max= chArr[i];
				maxChar = (char)(i+65);
			}
		}
		System.out.println("최대 발생 문자 : " + maxChar + "("+max+")");
	}

}
