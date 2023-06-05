package j0515;

import java.util.Scanner;

public class ThreeTest {

	public int x,y,z;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ThreeTest tt = new ThreeTest();
		tt.setScan(tt.getScan());
 
		

		
	}
	
	public void setScan(Scanner sc) {
		System.out.println("3가지 수를 입력하세요 (enter 키로 구분): ");
		 while(sc.nextInt()<0) {
			System.out.println("0보다 큰수를 입력:");
			 x = sc.nextInt();
		 }
			y = sc.nextInt();
			z = sc.nextInt();
		 
		
		if(x>=y && x>=z) {
			System.out.println("최댓값은 : " + x + " 입니다");
		}else if (y>=x && y >= z){
			System.out.println("최댓값은 : " + y + " 입니다");
		}else {
			System.out.println("최댓값은 : " + z + " 입니다");
		}

	}
	
	public Scanner getScan() {
			Scanner sc = new Scanner(System.in);
			return sc;
	}
	

	

}
