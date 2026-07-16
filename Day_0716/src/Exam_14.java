import java.util.Arrays;

public class Exam_14 {
	
	// 1. 총점 계산 총점에 대입
	static void tot(int[][] arr) { 
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			// j 국어(1), 영어(2), 수학(3) 점수
			for (int j = 1; j <= 3; j++) {
				sum += arr[i][j];
			}
			arr[i][4] = sum; // 총점 칸 저장
		}
	}
	
	// 2. 석차 계산 메소드 (총점을 비교하여 석차 계산)
	static void rank(int[][] arr) { 
		for (int i = 0; i < arr.length; i++) {
			int r = 1; // 1등부터 시작
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][4] > arr[i][4]) {
					r++;
				}
			}
			arr[i][5] = r;
		}
	}
		
	// 3. 총점 오름차순
	static void rankup(int[][] arr) { 
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					int[] num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
	}
	
	// 4. 배열 전체 출력 메소드
	static void arrprint(int[][] a) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t석차");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		//번호, 국어, 영어, 수학, 총점, 석차
		int[][] arr = {
			{1, 90, 70, 60, 0, 0},{2, 90, 70, 80, 0, 0},{3, 90, 70, 30, 0, 0},{4, 90, 70, 50, 0, 0},{5, 90, 70, 10, 0, 0}
		};
		
		System.out.println("원본");
		arrprint(arr);
		
		// 1. 총점
		tot(arr);
		System.out.println("총점");
		arrprint(arr);
		
		// 2. 석차
		rank(arr);
		System.out.println("석차");
		arrprint(arr);
		
		// 3.오름차순
		rankup(arr);
		System.out.println("총점 오름차순");
		arrprint(arr);
	}
}