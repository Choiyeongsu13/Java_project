package com.mnu.exam02;

public class ADto {
	int bun;
	int kor,eng,mat;
	public ADto() {}
	
	public ADto(int bun, int kor, int eng, int mat) {
		this.bun=bun;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
