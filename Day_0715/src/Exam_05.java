import java.util.Arrays;

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//버블 정렬
		int score[] = {90,60,80,70,55,88,77,65};
		
		int sc[] = score.clone();
		
		for(int i = 0 ; i< sc.length-1; i++) {
			for(int j =0 ; j<sc.length-i-1; j++) {
				if(sc[j] >sc[j+1]) {
					int imsi = sc[j];
					sc[j] = sc[j+1];
					sc[j+1] = imsi;
					}
			}

		}
		System.out.println("정열 전 : " + Arrays.toString(score));
		
		System.out.println("정열 후 : " + Arrays.toString(sc));
}
}