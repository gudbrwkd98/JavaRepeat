package j0511;

public class SwitchTest {

	public static void main(String[] args) {

		System.out.println("Swtich 구문");

		/*
		 * if (su % 3 == 0) { // 하나의 조건식에 처리하 구문 한문장이상{} 
		 * 		System.out.println(su + "은 짝수입니다."); 
		 * 		System.out.println("블럭처리 연습1"); 
		 * } else { 
		 * 		System.out.println(su + "은 홀수입니다."); 
		 * 		System.out.println("블럭처리 연습2"); 
		 * }
		 */
		int su = 31;

		switch (su % 2) {
		case 0:
			System.out.println("은짝수");
			break;

		case 1:
			System.out.println("은홀수");
			break;
		}
		System.out.println("switch 구문 연습종료");

	}
	
}
