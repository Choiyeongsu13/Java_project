//1~10 까지 홀수합을 반환하는 함수
public class Exam_18 {
	static int sum(int a) {
		if(a%2==1) {
			if(a==1) {
				return 1;
			}
			return a + sum(a-1);
		}	else {
			return sum(a-1);
		}
		

			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sum(10));

	}

}
