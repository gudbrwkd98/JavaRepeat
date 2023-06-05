package j0516;

import java.util.Scanner;

//사용자로부터 연속적으로 5과목의 점수를 입력받아서 총점,평균
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int su,su2,su3,su4,su5 => 배열을 사용하라
		int jumsu[] = new int[5];
		int sum = 0 ;
		double avg = 0; //평균
		Scanner sc= new Scanner(System.in);//System.in(키보드)
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
			
		}
		
		avg = ((double)sum/jumsu.length);
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + avg);
	}

}
