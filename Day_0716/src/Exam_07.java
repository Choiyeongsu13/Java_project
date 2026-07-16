
class aa{
	void aaa() {}
}


public class Exam_07 {
	//1.반환타입 x 매개변수 x
	static void method_1() {
		
	}
	//2. 반환타입 x 매개변수  o
	static void method_2(int a, int b) {
		
	}
	
	//3. 반환타입 o 매개변수 x
	static int method_3() {
		return 1;
	}
	//4. 반환타입 o 매개변수 o
	static int method_4(int[] a) {
		return 1; //return 정수값또는 변수 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메소드 호출
		method_1();
		//2. 
		method_2(15,33);
		//3.
		int s = method_3();
		//4.
		int n[] = {3,234,1};
		int k = method_4(n);
		

	}

}
