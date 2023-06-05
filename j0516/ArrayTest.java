package j0516;

import java.util.Iterator;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int su,su2,su3;
		//형식) 자료형 배열명 []  = new 자료형 [갯수]
		// int -> 0 , double -> 0.0 , boolean -> false 로 자동초기화 
		int su [] = new int[3];
		System.out.println("su=> " + su);
		su[0] = 10;
		su[1] = 20;
		su[2] = 30;
		
		System.out.println("su[0] = > "  + su[0]);
		System.out.println("su[1] = > "  + su[1]);
		System.out.println("su[2] = > "  + su[2]);
		
		//한꺼번에 많은양의 값을 저장시킬떄 
		int c [] = {10,20,30,40,50,60,70,80,90,100,110,120,130};
		
		/*
		 * int c [] = new int[13];
		 * c[0] = 10 ; c[1] = 20 ,,, c[12] = 130;
		 */
		
		 for (int i = 0; i < c.length; i++) {
			System.out.print("c["+i+"]="+c[i]);
		}
		System.out.println("");
		//형식) for(배열의 자료형 출력변수명: 출력대상자(배열 or 컬렉션 객체)
		 for(int num:c) {
			 System.out.println("num =>" + num);
		 }
	
	}

}
