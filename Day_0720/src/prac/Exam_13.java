package prac;

class person2{
	String name;
	int age;
	String gender;



person2(String name, int age,String gender){
	this.name = name;
	this.age = age;
	this.gender = gender;
	
 }


void person2print() {
	
	if(this.gender == "1") {
		this.gender = "남성";
		}
	else{
		this.gender = "여성";
	}
	
	System.out.println("이름 : " + name);
	System.out.println("나이 : " + age);
	System.out.println("성별 : " + gender);
}

}

// 출력
// 이름 : 이사람
// 나이 : 25
// 성별 : 남성
//
public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person2 p1 = new person2("이사람",28,"1");

		p1.person2print();
		
	}

}
