//5!
public class Exam_16 {
	static int num(int a) {
		
				
		if(a==0) {
			return 1;
		}
		num(a-1);
		return a * num(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		System.out.println(num(a));

	}

}
