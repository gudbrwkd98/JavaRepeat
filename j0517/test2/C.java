package j0517.test2;

import j0517.test.A;

//public class C{
public class C extends A{
	public static void main(String[] args) {
		A a= new A();
//		a.j=230;
//		a.print2();
//		System.out.println("==상속을 받은 자식클래스의 객체도 접근 X");
//		C c = new C();
//		c.j =300;
//		c.print2();
//		System.out.println("===protected 권한 다른 패키지기 떄문에 X ===");
//		a.k = 30;
//		a.print3();
		System.out.println("===상속을 받은 자식클래스의 객체면 접근 O  ===");
		C c = new C();
		c.k = 400;
		c.print3();
		//public class A 가아닌 class A 일시 접근 불가 
		System.out.println("===Public ===");
		c.m = 300;
		c.print4();
	} 
} 		