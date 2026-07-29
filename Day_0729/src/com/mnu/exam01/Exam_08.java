package com.mnu.exam01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		LocalTime time = LocalTime.now();
		LocalDate time1 = LocalDate.now();
		System.out.println(now);
		System.out.println(time);
		System.out.println(time1);

	}

}
