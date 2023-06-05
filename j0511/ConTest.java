package j0511;

import java.util.Iterator;

public class ConTest {
	public static void main(String[] args) {
		System.out.println("레이블이 있는 Break 문 (레이블과 가장 가까운것 루프탈출)");
		System.out.println("중첩 for 문");
		A:
		for (int i = 0; i <5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				//추가
				if(j == 2 )break A;
				System.out.println("i=" + i + ", j ="  + j);
				
			}
			System.out.println("=============");
		}
	}
}
