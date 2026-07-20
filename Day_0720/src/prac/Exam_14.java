package prac;

import java.util.Arrays;

class chejo{
	String name;
	int[] score;
	int max,min;
	
	
	chejo(String name, int[] score){
		this.name =name;
		this.score =score;
		maxMin();
	}
	
	void maxMin() {
		max =  score[0];
		min = score[0];
		for(int i =0; i<score.length; i++) {
			if(max <score[i]) {
				max = score[i];
			}if(min > score[i]) {
				min = score[i];
			}
		}
	}
	
	
void dataprint()	{
	System.out.println("이름 : " + name);
	System.out.println("점수 : " + Arrays.toString(score));
	System.out.println("최대 값 : " + max);
	System.out.println("최소 값 : " + min);
}
	
	
}

public class Exam_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chejo c1 = new chejo("김학",new int[] {9,37,6,5,4,8,78});
		c1.dataprint();
		c1 = new chejo("오김0학",new int[] {9,7,6,2,3,8,78});
		c1.dataprint();
		c1 = new chejo("김상학",new int[] {1,27,5,5,48,78});

		c1.dataprint();
		
		
		
	}

}
