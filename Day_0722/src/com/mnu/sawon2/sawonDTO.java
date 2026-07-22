package com.mnu.sawon2;

public class sawonDTO {

	private int sabun; //사번
	private String saname; //사원이름
	private int gender; //성 1,3:남 2,4: 여
	private int grade; //사원등급
	private int time; //근무시간
	private int weekPay; //등급에 따른 시급
	private String genderStr; //성별 이름
	private int weekMoney;

	public sawonDTO() {}

	public sawonDTO(int sabun,String saname, int gender, int grade, int time){
		this.sabun = sabun;
		this.saname = saname;
		this.gender = gender;
		this.grade = grade;
		this.time = time;		
	}
	
	
	
	
	public int getWeekPay() {
		return weekPay;
	}

	public void setWeekPay(int weekPay) {
		this.weekPay = weekPay;
	}

	public String getGenderStr() {
		return genderStr;
	}

	public void setGenderStr(String genderStr) {
		this.genderStr = genderStr;
	}

	public int getWeekMoney() {
		return weekMoney;
	}

	public void setWeekMoney(int weekMoney) {
		this.weekMoney = weekMoney;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getSaname() {
		return saname;
	}

	public void setSaname(String saname) {
		this.saname = saname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	

}
