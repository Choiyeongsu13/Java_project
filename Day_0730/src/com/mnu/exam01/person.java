package com.mnu.exam01;

public class person{ //DB에서 DTO
	String name;
	int age;
	boolean gender;
	person(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		String genderStr="여자";
		if(gender) { 
			genderStr ="남자";
		}
			return name + "," + age + "," + genderStr;
		
	}
}
