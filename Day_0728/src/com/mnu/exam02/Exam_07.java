package com.mnu.exam02;

public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		try {
			System.out.print(arr[5]);
			
		}catch(ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace(); //에러메시지 출력
			System.out.print("인덱스 에러\n");
			System.out.println("에러 메시지 : " + ae.getMessage()); //내가 출력하고싶은 에러메시지 출력
		}catch(Exception e) { //위에서 커버가 안되면 아래 새로운 catch 하지만 Exception이 최상위 이므로 하나만 쓰는경우도 있음, 전부 다 나옴
			
		}finally { //프로그램 종료를 확인 시켜줌 , 예외가 나도 안나도 동작한다
			System.out.println("프로그램을 종료합니다 ");
		}
		
		

	}

}
