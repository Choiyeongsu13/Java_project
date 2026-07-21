//로그인 로그아웃
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m2 = new Member("이사람","user","1234","010-1234-1234");
		
		//키보드로 입력
		String id ="user";
		String pwd = "4321";
		boolean bool  = m2.memberLogin(id,pwd);
		if(bool) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("아이디 혹 비밀번호 오류");
			
		}
		
		//로그아웃(회원 탈퇴)
		if(bool) {
			String str = m2.memberlogout();
			System.out.println(str);
		}
		
		//다시 로그인
		
		id ="user";
		pwd = "1234";
		bool  = m2.memberLogin(id,pwd);
		if(bool) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("아이디 혹 비밀번호 오류");
			
		}

	}

}
