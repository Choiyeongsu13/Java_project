package prac;

class person{
	int num;
	String name;
	int age;
	
	person(){
		this(9,"dddd",5); //자신의 생성자(메소드)
	} //처음에 한번만 사용가능
	
	
	person(int num, String name, int age){ //매개변수 3개
		this.num = num; //this. 은 멤버 변수를 의미함
		this.name = name;
		this.age= age;
	}
	
	void personprint() {
		int num = 50;
		System.out.println("번호 : " + num); //지역 변수 50
		System.out.println("번호 : " + this.num); //멤버 변수 
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
}


public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1 = new person(1,"a",23); //
		person p2 = new person(2,"ab",24); //
		
		person p3 = new person(3,"abc",25); //
		
		p1.personprint();
		p2.personprint();
		
		p3.personprint();
		
	}

}
