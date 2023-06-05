package j0511;

/*
 * <문제>
 * 1부터 100까지의 합중에서 3의 배수 또는 5의 배수의 합을 구한 값중에서 
 * 합계가 200을 넘어가는 최소의 값을 구하시오.
 */

public class SumBreak {
	public static void main(String[] args) {
		int sum = 0 ;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3== 0 || i % 5 ==0) {
				sum += i;
					System.out.println(i +"\t");
					
			}
			 if(sum > 200) break;
		}
		System.out.println("sum =>" + sum);
	}
}
