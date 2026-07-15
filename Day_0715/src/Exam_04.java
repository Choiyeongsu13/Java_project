import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90,60,80,70,55,88,77,65};
		int tol = score[0];
		int max = score[0];
		int min = score[0];
		
		System.out.println("Data : " + Arrays.toString(score));
		
		System.out.print("Data : ");
		for(int i : score) {
		System.out.print(i + " ");
		}
		System.out.print("\n");
		
		
		for(int i=1;i<score.length;i++) {
			tol = tol + score[i];
			if(max<score[i]) {
				max = score[i];
			}
			if(min>score[i]) {
				min = score[i];
			}
			}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min  + " 총값 : " + tol );
		System.out.print("평균 : " +  ((double)tol/score.length));
		
		//선택 정렬 
		int scorecp[] = score.clone(); //배열 복제
		for (int i=0; i<scorecp.length-1; i++) {
			for(int j = 0; j<scorecp.length; j++) {
				if(scorecp[i]>scorecp[j]) {
					//교환
					int imsi = scorecp[i];
					scorecp[i] = scorecp[j];
					scorecp[j] = imsi;
				}
			}
		}
		
		System.out.println("정열 전 : " + Arrays.toString(score));
		
		System.out.println("정열 후 : " + Arrays.toString(scorecp));

	}

}
