
public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tmp = 365.2422;
		int day=0, hour=0 , min =0, sec=0;
		System.out.printf("1년은 %.4f일이다 \n", tmp);
		
		day =(int)tmp; //tmp의 365를 넣음
		tmp -= day; // day는 365일 tmp에 나머지값 0.2422를 대입한다
		hour= (int)(tmp * 24); //tmp 0.2422에 24을 곱하여 일 을 구한다.
		
		tmp = (tmp *24)- hour;
		min= (int)(tmp*60);
		
		tmp=(tmp*60)-min;
		sec=(int)(tmp*60);
		System.out.printf("%d일 %d시 %d분 %d초 \n", day, hour, min, sec);
		
	}

}
