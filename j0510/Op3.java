package j0510;
/*
 * 관계 (=대소 비교연산자) - > > , > = , < , <= , <= , !=(같지않다), ==(컴튜펕 언어 2개)
 * 논리연산자 => 참,거짓을 판별할 수 있는 연산자(boolean),&& , || , ^(XOR)
 */

public class Op3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("관계, 논리연산자");
		int t1 = 3 , t2 = 5 , t3 = 7;
		int t4;
		boolean b1,b2,b3;
		boolean b4 = true; //초기화 O
		
		//(3>5)
		System.out.println("t1>t2 => " + (t1>t2));//false
		//(5<7)
		System.out.println("t2<t3 => " + (t2<t3));//true
		//관계, 논리 연산자 혼합 
		b1 = (t1>t2) && (t2<t3); //(3>5) && (5<7)
		System.out.println("(3>5) && (5<7) = > " + b1); //false 

		// ||
		b2 = (t1>t2) || (t2<t3); //(3>5) || (5<7) 조건평가
		System.out.println("(3>5) || (5<7) = > " + b2); //true 
		
		// | 
		b3 = (t1>t2) | (t2<t3); //(3>5) | (5<7) 모두 평가
		System.out.println("(3>5) | (5<7) = > " + b3); //true 
		
		// ^
		b4 = (t1>t2) ^ (t2<t3); //(3>5) ^ (5<7)
		System.out.println("(3>5) ^ (5<7) = > " + b3); //true 
		
		
	}

}
