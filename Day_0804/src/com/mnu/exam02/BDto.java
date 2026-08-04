package com.mnu.exam02;

public class BDto {
	int bun;
	String name;
	
	public BDto()  {}
	
	public BDto(int b, String n) {
		bun=b;
		name=n;
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
	
}
