package j0512;

/*
 * 2개의 값을 입력받아서 사칙연산(+,-,*,/) 을 해주는 프로그램을 작성
 */
public class SumTest { //프록램 => 회사

	//객체를 왜 생성하는가? 1)데이터를 저장목적 2) 메서드를 호출하기 위해서
	//데이터를 저장목적X => 멤버변수가 없기때문에
	public static void main(String[] args) {
			//지역변수 => 멤버변수x
		int a = 100;
		int b = 50 ;
		
		SumTest st= new SumTest();//객체 생성 -> 메서드 호출목적
		st.calculate(78,90);
		st.calculate(23, 45);
		st.calculate(12, 78);
		
		for (int i = 0; i < 10; i++) {
			st.calculate(90, 9);
		}
	}

	void calculate(int a , int b) {
		System.out.println("(a+b)=>" + (a+b));
		System.out.println("(a-b)=>" + (a-b));
		System.out.println("(a*b)=>" + (a*b));
		System.out.println("(a/b)=>" + (a/b));
		System.out.println("============");
	}
}
