package j0517.test;

public class A {

	private int i = 10; //1.멤버변수에 부여 => 객체명.멤버변수=값(x)
								//public void setI(int i ) {this.i = i ;} = > O 
	
	//추가
	int j ; //접근지정자가 없으면 default 접근지정자를 부여  o 
	protected int k ;
	public int m ;
	
	
	//2.메서드 앞에 부여 => 외부(같은 패키지 또는 다른 패키지) 에서 접근x
	
	private void print() {
		// TODO Auto-generated method stub
		System.out.println("private i => " + i);
	}
	
	//추가1
	void print2() {
		System.out.println("j(default) => " + j);
	}
	//추가2
	protected void print3() {
		System.out.println("k(protected) => " + k);
	}
	//추가3
	public void print4() {
		System.out.println("m(public) => " + m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.i= 20;
		a.print();
		System.out.println("===default 권한===");
		a.j = 200;
		a.print2();
		System.out.println("===protected 권한===");
		a.k = 30;
		a.print3();
		System.out.println("===public 권한===");
		a.m= 130;
		a.print4();
		
	}

}
