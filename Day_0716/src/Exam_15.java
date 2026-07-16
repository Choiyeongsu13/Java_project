//재귀 함수 : 자기가 자신을 호출하는 것
public class Exam_15 {
	static void test(int a) {
		if(a==0) {
			return;
		}
		System.out.println("f");
		test(a-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(5);
	}

}
