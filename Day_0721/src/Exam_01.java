
//회원가입 로그인 로그아웃 
public class Exam_01 {
//JVM 힙 스택 메소드 런타입 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		boolean bool = m1.memberregister();
		if(bool) {
			System.out.println("가입 성공");
		}
		else {
			System.out.println("가입 실패");
		}
		m1.name = "강";
		m1.id= "ad";
		m1.pwd = "1234";
		m1.phone = "123-123-123";
		
		bool = m1.memberregister();
		
		if(bool) {
			System.out.println("가입 성공");
		}
		else {
			System.out.println("가입 실패");
		}
		
		Member m2 = new Member("이사람","user","1234","010-1234-1234");
		bool = m2.memberregister();
		if(bool) {
			System.out.println("가입 성공");
		}
		else {
			System.out.println("가입 실패");
		}
	}

}
