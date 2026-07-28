package com.mnu.exam02;

import java.io.IOException;

public class Exam_08 {

	public static void main(String[] args) throws IOException {
		System.out.print("1문자 입력");
		try { //예외가 날 법한 곳을 try로 묶어줌
		int ch = System.in.read(); //실행전부터 에러 발생 => 체크드 인셉션
		}catch(IOException e) {
			e.printStackTrace();// 
		}
		}
}
