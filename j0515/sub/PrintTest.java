package j0515.sub;

//생성자 오버로딩 + 메서드 오버로딩
//클래스를 작성하는 목적->객체생성->1.데이터저장 목적 2.메서드 호출 
public class PrintTest {
	
	
	//(3)생성자 오버로딩 => 3개까지 가능
	//PUBLIC pRINTtEST(){} 기본생성자가 없으면 만들어서 호출한다.
	//(2) 메서드 오버로딩 
	public PrintTest() {};
	//기본생성자가 자동으로 안만들어지는 경우
	public PrintTest(char a) {
		print(a);
		System.out.println("char 매개변수를 받아서 처리=> " + a );
	}
	
	public PrintTest(int a) {
		print(a);
		System.out.println("int 매개변수를 받아서 처리=> " + a );
	}
	
	public PrintTest(boolean a) {
		print(a);
		System.out.println("boolean 매개변수를 받아서 처리=> " + a );
	}
	
	void print(char a ) {
		System.out.println("a=> " + a );
	}
	
	void print(int a) {
		System.out.println("a=> " + a );
	}
	
	void print(boolean a) {
		System.out.println("a=> " + a );
	}
	
	/*
	 * 
	(1) 
	void charPrint(char a) {
		System.out.println("a=>" + a);
	}
	
	void intPrint(int a) {
		System.out.println("a=>" + a);
	}
	
	void booleanPrint(boolean a ) {
		System.out.println("a=>" + a);
	}
	 */
	
	public static void main(String[] args) {
		//PrintTest pt = new PrintTest();
		/*pt.print('V');
		pt.print(2023);
		pt.print(3>2);*/
		//PrintTest pt 객체를 생성하면서 인수 1개짜리 문자열 처리 생성자 호출하라 
		PrintTest pt1 = new PrintTest('V');
		PrintTest pt2 = new PrintTest(2023);
		PrintTest pt3 = new PrintTest(2>3);
		
	}
}
