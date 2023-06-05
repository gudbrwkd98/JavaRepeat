package j0511;

import java.util.Iterator;

public class ForTest2 {
	public static void main(String[] args) {
		System.out.println("중첩 for 문");
		for (int i = 0; i <5; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println("i=" + i + ", j ="  + j);
				
			}
			System.out.println("=============");
		}
	}
}
