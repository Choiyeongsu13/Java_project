package prac;



public class Exam_06 {
	BB b = new BB(); //멤버
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b2= new BB(); //객체 생성 또는 인스턴스
		b2.bun = 10;
		b2.name = "가가";
		b2.score=95;
		
		b2.bbprint();
		
		if(b2.score>90) {
			
			System.out.println("합격");
			
			
		}
	}

}
