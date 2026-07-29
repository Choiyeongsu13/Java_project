package com.mnu.exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(new File("src/테이블.txt"));
		String line =null;
		while(sc.hasNextLine()) {
		line=  sc.nextLine();
		System.out.println(line);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
