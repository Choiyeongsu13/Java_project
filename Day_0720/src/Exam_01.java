import java.util.Arrays;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][] = {{1,2,3,4, 0 },{5,6,7,8,0},{9,10,11,12,0},{13,14,15,16,0},{0,0,0,0,0}};
//		
//		
//		
//		
//		for(int i = 0; i<arr.length-1;i++) {
//			int add = 0;
//			for(int j = 0; j<arr.length-1; j++) {
//				add +=arr[i][j];
//				arr[i][4] = add;
//				
//				System.out.print(arr[i][j] + " ");
//				
//			}System.out.println(arr[i][4]);
//			System.out.print("\n");
//		}
		
		int arr[][] = new int[5][5];
		int cnt = 0 ;
		
		for(int i= 0; i<arr.length-1; i ++) {
			for(int j= 0; j<arr.length-1; j ++) {
				cnt++;
				arr[i][j] = cnt;
				arr[i][j] += cnt;
				arr[4][j] += cnt;
				arr[4][4] +=cnt;
			}
		}
		
		
		
		for(int i =0 ; i<arr.length; i ++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
		}
		

	}

}
