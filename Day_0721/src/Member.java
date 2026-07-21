
public class Member {
	//멤버변수 
	String name;
	String id;
	String pwd;
	String phone;

	
	public Member() { 
		
	}
	
	public Member(String name, String id, String pwd, String phone) {
		this.name =name;
		this.id =id;
		this.pwd =pwd;
		this.phone =phone;
	}
	
	//회원가입
	boolean memberregister() {
		if(name != null && id != null && pwd != null && phone != null) {
			return true;
		}
		else {
			return false;
		}
	}

	
	//로그인
	boolean memberLogin(String id , String pwd){
		if(id == "user" && pwd =="1234") {
			return true;
		}
		else {
			return false;
		}
}
	//로그아웃
	String memberlogout() {
		this.name = null;
		this.id = null;
		this.pwd = null;
		this.phone= null;
		
		return "로그아웃 성공";
	}

}	

