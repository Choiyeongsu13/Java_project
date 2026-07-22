package practice;

public class movieDTO {
	
	private String moname; //영화이름
	private int price ; //영화 가격
	private int age ; //손님 나이
	
	
	public movieDTO() {
		
	}
	
	public movieDTO(String moname, int price, int age) {
		this.moname = moname;
		this.price = price;
		this.age= age;
		
	}

	public String getMoname() {
		return moname;
	}

	public void setMoname(String moname) {
		this.moname = moname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
