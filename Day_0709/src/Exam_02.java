
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //형변환 예제
		  char ch = 'A'; //문자(''), 정수(65000)
		  int in1 = 65; 
		  double do1 = 3.14;
		  
		  int chint = ch; //문자를 정수로 형변환(자동)
		  System.out.println("chint : " + chint );
		  
		  char intch = (char)in1;
		  System.out.println("intch: " + intch);
		  int a = 3202;
		  char intch1 = (char)a;
		  System.out.println("intch1: " + intch1);
		  
		  int inta = 100;
		  double intdouble = inta;
		  System.out.println("intdouble: "+ intdouble);
		  
		  double doublea = 3.14;
		  int doubleint = (int)doublea;
		  System.out.println("doubleint : " + doubleint);

	}

}
