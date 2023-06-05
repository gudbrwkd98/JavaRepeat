package j0510;

//증감연산자2 
public class Op2 {
	
	public static void main(String[] args) {
		byte b1 = 5 ; 
		short s = -4;
		int i = 8;
		
		System.out.println("b1 => " + b1);
		System.out.println("-s => " + (-s));
		System.out.println("i => " + i);
		System.out.println("++i => " + (++i));//9
		/*
		 * i  = i+1 -> i = 8+1 -> 9
		 * System.out.print(i);
		 */
		System.out.println("i++ => " + (i++));
		/*
		 * System.out.print(i);
		 * i = i + 1 
		 */
		System.out.println("중간 i=> " + (i));
		System.out.println("--i => " + (--i));
		/*
		 * i = i -1 ; // i = 10 - 1 = 9
		 * System.out.print(i) // 9
		 */
		System.out.println("i-- => " + (i--));
		/*
		 * System.out.print(i)
		 * i = i - 1 // i = 9-8
		 * 
		 */
		System.out.println("최종 i => " + (i));
		
		
	}
}
