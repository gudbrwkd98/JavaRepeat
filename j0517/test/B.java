package j0517.test;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		System.out.println("===default 권한===");
		a.j = 200;
		a.print2();
		System.out.println("===protected 권한===");
		a.k = 30;
		a.print3();
		
	}

}
	