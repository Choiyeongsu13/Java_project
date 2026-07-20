package prac;

class hakseng{
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	hakseng(){}
	hakseng(int num,String name, int kor, int eng, int math, int total, double avg )
	{
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	
	
	void totave() {
		total = kor + eng + math;
		avg = total/3.;
	}
	void haksengprint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(num + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(total + "\t");
		System.out.print(avg + "\t");
	}
	
	
}

//성적처리 (번호 이름 국어 영어 수학 총 평균)
public class Exam_12 {
	public static void main(String[] args) {
		hakseng p1 = new hakseng();
		p1.num = 101;
		p1.name="sdf";
		p1.kor =90;
		p1.math = 94;
		p1.eng = 30;
		p1.totave();
		
		
		p1.haksengprint();
		
		
		System.out.print("\n");
		hakseng p2 = new hakseng(1102,"dsf",21,34,45, 0, 0);
		p2.totave();
		p2.haksengprint();
		
		
		
		
	}

}
