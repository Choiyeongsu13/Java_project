
public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec=1234;
		String con="";
		int mok = dec/1000; //1
		con = mok + con; //1+"" (문자열을 만남으로써 형변환)
		
		dec =dec%1000; //234
		mok=dec/100; //2
		con= mok+con; //2 + 1""
		
		dec=dec%100; // 34
		mok=dec/10; // 3
		con=mok+con; //3 + 21""
		
		dec=dec%10; //4
		mok=dec/1; //4
		con= mok+con; // 4+ 321""
		
		System.out.printf(con);
		

	}

}
