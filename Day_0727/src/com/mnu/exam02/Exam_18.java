package com.mnu.exam02;

abstract class Vehicle{
	String name;
	abstract public String getName(String val);
		public Vehicle(String val) {
			this.name=val;
		}
	
	public String getName() {
		return "Vehicle name : " + name;
	}
}

class Car extends Vehicle{
	public Car(String val) {
		super(val);
	}
	public String getName(String val) {
		return "Car name : " + name;
	}
	public String getName(byte val[]) {
		return "Car name : " + name;
	}
}

public class Exam_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Car("spark");
		System.out.println(obj.getName());
	}

}
