package practice;

public class movieDAO {
	
	private movieDAO() {
		
	}
	
	private static movieDAO instance = new movieDAO();
	
	public static movieDAO getinstance() {
		return getinstance();
	}
	
	public movieDTO getMovie(String moname, int price, int age) {
		
		movieDTO movies = new movieDTO(moname,price,age);
		return movies;
	}
	
	public int pricesale(movieDTO mto) {
		int sale = 2000;
		setAge;
		if(age>19) {
			sale=0;
		}
	}
	
	public String moviename(mov) {
		
	}
	
	
	
	

}
