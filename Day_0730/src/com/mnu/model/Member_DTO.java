package com.mnu.model;

public class Member_DTO {
	
	private int custno;
	private String custname;
	private String phone;
	private String gender;
	private String joindata;
	private String grade;
	
	private String city;
	private String cityname;
	
	public Member_DTO() {}
	
	public Member_DTO(int custno,String custname, String phone, String gender, String grade, String city) {
		this.custno=custno;
		this.custname=custname;
		this.phone=phone;
		this.gender=gender;
		this.grade=grade;
		this.city= city;
		
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoindata() {
		return joindata;
	}

	public void setJoindata(String joindata) {
		this.joindata = joindata;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
}
