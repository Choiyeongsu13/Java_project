package aaa;

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu1 = new student();
		
		//초기화
		stu1.setHak("1101");
		stu1.setName("홍");
		stu1.setAge(22);
		stu1.setKor(90);
		stu1.setEng(80);
		stu1.setMath(71);
		stu1.setGender(false);
		int total = stu1.getEng() + stu1.getMath() + stu1.getKor();
		double ave = (double)total/3;
		
//		if(stu1.isGender()) {
//			System.out.print("남");
//		}
//		else {
//			System.out.print("여");
//		}
		
		
		
		//출력
		//학번이름성별나이국어영어수학총평균
		System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.println(stu1.getHak()+ "\t" + stu1.getName() + "\t" +(stu1.isGender() ? "남":"여") + "\t" +stu1.getAge()+"\t" + 
							+ stu1.getKor() + "\t" +stu1.getEng()+ "\t" +stu1.getMath() +"\t"+ total +"\t" + ave);
	}

}
