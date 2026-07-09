
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a= 3.14567;
			//1 (3.14567) * 100 ) = > 314.567 + 0.5 => 315.067
			//(int(315.067)) = 315 , 315/100. = > 3.14
			
			a= (int)(a * 100 + 0.5) / 100.;
			System.out.println("a" + a);
			
			double aa = 3.14567;
			System.out.println("aa= " + String.format("%f", aa) );
			System.out.println("aa= " + String.format("%.2f", aa) );
			System.out.println("aa= " + String.format("%7.2f", aa) );//f는 실수 .2는 소수점자리 계산
			//x.af에서 x는 미리 앞자리 공간확보 (공백) a는 소수점자리
			
			
	
	
	}	

}
