
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90,60,80,70,55,88,77,65};
		int rank[] = new int[score.length];
		for( int i=0;i<score.length;i++) {
			rank[i]=1;
//			System.out.print(score[i] + " : ");
			for(int j =0;j<score.length;j++) {
				
				if(score[i] < score[j]) {
					rank[i]++;
				}
//			System.out.println(rank);
				}
		}
	

	
	for( int i=0; i<score.length; i++) {
		System.out.println(score[i] + ":" + rank[i]);
			}
	}
}