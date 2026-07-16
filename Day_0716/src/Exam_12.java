//가변인자를 이용하여 n개의 자료중에서 최대값을 구하여 반환하는 메소드

import java.util.Arrays;
import java.util.Scanner;

public class Exam_12 {
	
	static int sum(int ... a) {
		int max= a[0];
		for(int i =1; i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
			
		}
		return max;
//		System.out.println(Arrays.toString(a));
//		System.out.println(max);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max[] = {1,10,3,4,5};
		
		sum(max);
		
		int a[] = {121,12,12,1,2};
		System.out.println("max : " + sum(a));
		
		System.out.println("max : " + sum(new int[] {3,4,5}));

	}

}
