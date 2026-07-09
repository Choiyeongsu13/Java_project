
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자 (++,--)
		int a =5;
		int b= 0;
		
		
		a++; //후위 5+1 6
		++a; //전위 6+1 7
		System.out.println("a= "+ a);
		
		
		a=5;
		b= a++; //대입후 연산 
		System.out.printf("b : %d   a : %d \n" , b ,a);
		a=5;
		b = ++a;
		System.out.printf("b : %d   a :  %d \n" , b ,a);
		
	}

}
