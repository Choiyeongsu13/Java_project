class SS{
	int a=10;
}
//싱글톤
class Sin {
	//외부접근불가
	private Sin() {}
		static Sin s = new Sin(); //자신 스스로 객체 생성
		
		static Sin getSin() {
			return s;
		}
}
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS s1 = new SS(); //객체(인스턴스) 생성
		SS s2 = new SS();
		SS s3 = new SS();
		
		System.out.println("s1: "+ s1);
		System.out.println("s2: "+ s2);
		System.out.println("s3: "+ s3);
		
		Sin s4 = Sin.getSin();
		Sin s5 = Sin.getSin();
		
		System.out.println("s4: "+ s4);	
		System.out.println("s5: "+ s5);
		
			
	}

}
