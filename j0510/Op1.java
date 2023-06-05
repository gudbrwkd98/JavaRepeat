package j0510;

public class Op1 {
	public static void main(String[] args) {
		double area = 5*5*3.141592;
		System.out.println("area =>" + area);
		//++,--
		int a = 4;
		int b = a++;
		/*
		 * int b = a ; -> int b = 4
		 * a = a+1 ; -> a = 4+1 -> a = 5
		 */
		System.out.println("중간값 a => " + a + "입니다, b =>" + b);
		int c = ++a;
		System.out.println("최종값 a = > "  + a + "입니다");
	}
}
