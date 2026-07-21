
public class student {
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String grade;
	
	student(){
	}
	student(int hakbun,String name, int kor, int eng, int mat){
		this.hakbun=hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat =mat;
		
		
		
	}
	
	void studenttotal(int hakbun2, String name2, int kor2, int eng2, int mat2){
		System.out.println("학번\t이름\t국어\t영어\t수학");
		System.out.print(hakbun +"\t"+ name+ "\t" +kor+ "\t" +eng+ "\t" +mat+ "\n");
	}
	
	//총점 평균 메소드
	
	void studentavg(int tot , double ave){
		this.tot = kor+eng+mat;
		this.ave = tot/3;
		System.out.println("총점\t평균");
		System.out.print(tot +"\t" + ave);
		
	}
	
	String studentgrade(double ave) { 
	    if (ave >= 90) {             
	        return "A";
	    } else if (ave >= 80) {       
	        return "B";
	    } else if (ave >= 70) {
	        return "C";
	    } else if (ave >= 60) {
	        return "D";
	    } else {
	        return "F";
	    }
	}

}
