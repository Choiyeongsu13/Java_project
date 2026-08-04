package com.mnu.exma03;

public class Student {
	int bun;
	String name;
	int kor,math,eng;
	int tot;
	double avg;
	
	public Student() {}
	
	public Student(int bun, String name, int kor, int math, int eng) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;	
	}


	



	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
