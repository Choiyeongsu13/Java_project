
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//++,--
		int a =5, b= 0;
		
		b= a++ + a++ + a++;
		System.out.printf("a= %d  b = %d \n", a,b);
		
		a = 5;
		b= ++a + ++a + ++a;
		System.out.printf("a= %d  b = %d \n", a,b);
		
		int k = 5;
		int x = k++ +5;
		System.out.printf("x = %d  k = %d ", x ,k);
		
	}

}
