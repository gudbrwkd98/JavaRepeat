package j0512;
/*
 * 1.사용자로부터 값을 입력받아서 (2개) 큰값을 구하시오 <-> 적은값 구하시오.
 * 2.최대값을 구해주는 메서드(max) 을 이용해서 최대값을 구하시오
 * 3.최소값을 구해주는 메서드(min) 을 이용해서 최소값을 구하시오.
 */

public class TwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		int y = 67 ;
		
		/* (1) 비효율적인 코딩방식(단순,반복적인 문장)
		if(x>y) {
			System.out.println("큰값은" + x);
		}else {
			System.out.println("큰값은" + y);
		}
		
		int a = 56;
		int b = 97 ;
		
		if(a>b) {
			System.out.println("큰값은" + a);
		}else {
			System.out.println("큰값은" + b);
		}
		*/
		TwoTest test = new TwoTest();
		
		test.max(x,y);
		test.max(32,12);
		test.max(34,99);
		System.out.println("=============");
		test.min(90, 23);
		test.min(34, 14);
		
	}
	
	void max(int a , int b) {
		if(a>b) {
			System.out.println("큰값은" + a);
		}else {
			System.out.println("큰값은" + b);
		}
	}
	
	
	void min(int a , int b) {
		if(a>b) {
			System.out.println("적은 값은" + b);
		}else {
			System.out.println("적은 값은" + a);
		}
	}
	
	

}
