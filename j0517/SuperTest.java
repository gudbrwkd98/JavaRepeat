package j0517;

//상속과 생성자
public class SuperTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c=new C("홍길동");//객체c를 생성하면서 문자열처리 생성자호출(1)
	}
	
}
//A 
//자바의 모든 클래스는 기본적으로 Object 클래스를 상속받는다.
class A extends Object{
	public A() {
		System.out.println("난 A 의 생성자 호출됨");
	}
	
}

//B 
class B extends A{
	public B() {
		super();
		System.out.println("난 B의 생성자 호출됨!");
	}
	//추가 (인수가 있는 생성자를 호출하는 경우에는 부모클래스에 반드시
	//		  인수에 따라 처리해주는 생성자가 반드시 있어야 호출이 가능하다.
	public B(String s) {
		super();
		System.out.println(s);
	}
}
//C
class C extends B{
		public C() {
			System.out.println("난 C 의 생성자 호출됨!!");
		}
		public C(String s) {//(2)
			super(s);//(3) 부모클래스의 기본생성자를 호출 
			System.out.println(s);
		}
}



