//가변인자

public class Exam_11 {
	//메소드 오버로딩 =  하나의 클래스에 이름이 동일한 메소드가 여러개인 경우
	//조건 = 메소드 이름은 동일 (매개변수 개수, 타입, 순서/ 는 달라야 함)
	static void add(int a, int b) { //매개변수 2개
		
	}
	static void add(int b, int a, int c) { // 3개
		
	}
	static void add(int a, double b, char c,int d) { // 4개
		
	}
	
	static void sum(int ... a) { // 가변인자는 딱 하나만 쓸수있음
		int s= 0; //배열을 넘길수 있음
		for(int i =0; i<a.length;i++) {
			s+=a[i];}
		System.out.println("s = " + s);}
	static void sum(String s, int ... a) { // 가변인자는 딱 하나만 쓸수있지만 다른건 괜찮음
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2,3);
		sum(1,23,4,5,5);
		
		
		
		
	}

}
