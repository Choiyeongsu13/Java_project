import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65};
		int arr [] =score.clone();
		int imsi =0;
		
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
		}
		
		}
		System.out.println("선택정렬 ");
		System.out.print("정렬전 : ");
		for(int i = 0 ; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}System.out.print("\n");
		System.out.print("정렬후 : ");
		for(int i = 0 ; i<score.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		

		int var[] = score.clone();
		for(int i =0; i<var.length-1; i++) {
			for(int j =0; j<var.length-i-1; j++) {
				if(var[j] < var[j+1]) {
					imsi = var[j];
					var[j] = var[j+1];
					var[j+1] = imsi;
				}
			}
		}
		System.out.print("\n");
		System.out.println("버블정렬 ");
		System.out.print("정렬전 : ");
		for(int i = 0 ; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}System.out.print("\n");
		System.out.print("정렬후 : ");
		for(int i = 0 ; i<score.length;i++) {
			System.out.print(var[i]+ " ");
		}
		
		
		
		
	/*
	 * for(int j = 1; j<score.length; j++) {
	 * 
	 * 
	 * 
	 * }
	 */
		
		
		
		
		
		
		
		
	}

}
