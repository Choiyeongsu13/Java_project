package prac;
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 및 사용
		Student st; //참조변수 or 레퍼런스 변수
		
		st = new Student(); //객체 생성
		
		System.out.println("st " + st );
		System.out.println("구분 " + st.gubun );
		System.out.println("이름 " + st.name );
		System.out.println("성별 " + st.max );
		
		st.gubun = 1;
		st.name = "쟤";
		st.max = true;
		
		System.out.println("st " + st );
		System.out.println("구분 " + st.gubun );
		System.out.println("이름 " + st.name );
		System.out.println("성별 " + st.max );

		st.studentPr();
	}

}
