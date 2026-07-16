import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 올바른 int 배열 선언법으로 수정
		int[] count = new int[6]; 
		
		System.out.println("점수를 입력하세요 (-99 입력 시 종료):");
		
		while(true) {
			int a = sc.nextInt();
			
			if(a == -99) {
				break;
			}
		
			int index = 5; // 기본값: 50점 미만 (index 5)
			if(a >= 90) {
				index = 0;
			}
			else if(a >= 80) {
				index = 1;
			}		
			else if(a >= 70) {
				index = 2;
			}
			else if(a >= 60) {
				index = 3;
			}
			else if(a >= 50) {
				index = 4;
			}
			count[index]++;
		}
		
		// 2. count 배열 크기(6개)와 맞추기 위해 "50 미만" 구간 추가
		String[] str = {"100 ~ 90", "89 ~ 80", "79 ~ 70", "69 ~ 60", "59 ~ 50", "50 미만"};
		
		// 3. 루프를 돌며 각 인덱스(i)에 맞는 카운트 값을 정확히 출력
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " : " + count[i] + "명");
		}
		
		sc.close();
	}
}