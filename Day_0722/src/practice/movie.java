package practice;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("손님의 나이를 입력");
		int age = sc.nextInt();
		
		movieDAO mdo = movieDAO.getinstance();
		movieDTO mto = mdo.getMovie(age);

	}

}
