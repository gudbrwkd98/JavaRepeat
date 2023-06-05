package j0511;

import java.util.Iterator;

public class ForTest {
	public static void main(String[] args) {
		System.out.println("1.for 문의 유형(c++)");
		/*
		 * 형식 for(초기식;조선식;증강식)
		 * 				실행구문
		 * 
		 */
		//			1)			2)5)8)11) 	4)7)10)
			for (int i = 0; i <= 5; i++) {
					System.out.println("반복문 for 문연습" + i);
					System.out.println("===========");
					
			}
			System.out.println("2.for문의 유형2(C언어 유형)");
			/*int k ;//초기식의 변수를 for 문 밖에 선언 -> C 언어
			// 	1)		2)5) 		4)
			for ( k = 10; k>7; k--) {
				System.out.println(k + "테스트");
			}
			*/
			
			System.out.println("3.초기식이 생략된 for 문 유형");
			
			int k =10  ;
			for (; k> 5 ; k--) {
				System.out.println(k+"테스트");
			} 
			
			System.out.println("4.최소한의 for 문 구성(증감식도 생략가능)");
			int c=1; //초기식은 for문밖에 선언이가능
			//증감식은 for문밖에 선언할 수가 없다.
			
			for(;c<=20;) {
				System.out.println("20번 반복" + c);
				c++; 
			}
			System.out.println("5.for 문 전부 생략");
			
			/*while(true){//for(;;) {
				System.out.println("무한루프");
			}*/
			
			System.out.println("5.합계,곱을 동시에 구하기");
			//1~100까지의 합을 구하기 -> 1+2+3+,,,,+100 = 5050
			
			/*int total = 0;
			for (int i = 1; i <= 100; i++) {
				total += i ;
			}
			System.out.println(total);
			*/
			
			int sum = 0 ; //1+2+,,,+100
			int gap = 1 ; //곱하기 - > 0 (X) 
			
			for(int i = 1 ; i<=5 ; i++) {
				sum += i; //sum= sum+i
				gap *= i; //gap = gap *i
				System.out.println("중간합계 => " + sum);
				System.out.println("중간곱 => " + gap);
				System.out.println("=============");
			}
				
			System.out.println("최종합계(sum)");
			
			//1~100 까지의 합 = > 짝수의 합(2,4,5,6,8,10), 홀수의합
			int total = 0 ;
			for(int i = 0 ; i <=100 ; i+=2) {
				//i 가 짝수라면 
				
				total+=i;
				
			}
			
			System.out.println("짝수 누적 => "  + total);
			
			
			
			
		}
}
