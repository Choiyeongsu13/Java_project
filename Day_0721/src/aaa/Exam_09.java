package aaa;

public class Exam_09 {
	public static void main(String[] args) {
		person p = new person();
		p.setSsn("123");
		p.setName("sdf");
		p.setGender(true);
		p.setAge(24);
		
		
		System.out.println("이름 : "+ p.getName());
		System.out.println("주민 : "+ p.getSsn());
		System.out.println("나이 : "+ p.getAge());
//		if(p.isGender()) {
//			System.out.println("이름 : "+ p.getSsn());
//			
//		}
		
	}

}
