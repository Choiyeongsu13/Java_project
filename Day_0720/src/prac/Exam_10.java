package prac;

class student{
	int bun;
	String name;
	int age;
	
	//오버로딩
	student(){}

	student(int bun){}
	
	student(int bun, String name){}
	
	student(int bun, String name , int age){}
	
	
	
	
	void studentprint() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
}
public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.bun = 1;
		s1.name ="마";
		s1.age = 20;
		s1.studentprint();
		
		student s2 = new student();
		s2.studentprint();
		
		student s3 = new student();
		s3.studentprint();

	}

}
