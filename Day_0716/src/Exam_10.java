
public class Exam_10 {
	//선택정렬 메소드
static	void sort(int[] arr, boolean flag) {
		if(flag) { //오름차순
			System.out.print("sort asc :  ");
			for(int i =0; i <arr.length-1; i++) {
				for(int j =i+1; j<arr.length; j++) {
					int m = arr[i];
					arr[i] = arr[j];
					arr[j] = m;
				}
			}
		}
		else {//내림차순
			System.out.print("sort desc :  ");
			for(int i =0; i <arr.length-1; i++) {
				for(int j =i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int m = arr[i];
					arr[i] = arr[j];
					arr[j] = m;
				}
			}
			}
		
	}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,34,5,6,7,3}; 
		sort(a,false);

	}

}
