
public class Exam_08 {
//	//1~ 10 까지 정수 출력하는 메소드
//	static void add() {
//		int s=0;
//		for(int i=1 ; i<=10 ; i++) {
//			System.out.print(i + " ");
//			s+=i;
//		}
//		System.out.println("=" + s );
//	}
//	
//	//1~ n 까지 정수 출력하는 메소드
//	static void addn(int n) {
//		int s=0;
//		for(int i=1 ; i<=n ; i++) {
//			System.out.print(i + " ");
//			s+=i;
//		}
//		System.out.println("=" + s );
//	}
//	
	//1~ n 까지 정수 출력하는 메소드
	static int addsum(int n) {
		int s=0;
		for(int i=1 ; i<=n ; i++) {
			s+=i;
		}
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		add();
//		addn(50);
		System.out.println(addsum(10));

	}

}
