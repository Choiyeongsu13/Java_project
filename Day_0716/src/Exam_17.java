//1~10 합계
public class Exam_17 {
	
	static int sum(int a) {
		if(a==1) {
			return 1;
		}
		return a + sum(a-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		sum(a);
		System.out.print(sum(a));

	}

}
