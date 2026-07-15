
public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[5][5];
		int cnt = 0;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr.length ; j++) {
				cnt++;
				arr[j][i] = cnt;
				
				System.out.printf("%3d",arr[i][j]);
			
			}System.out.print("\n");
		

	}
	}

}
