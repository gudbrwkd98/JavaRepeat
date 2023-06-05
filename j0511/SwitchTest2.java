package j0511;

public class SwitchTest2 {

	public static void main(String[] args) {

		System.out.println("Swtich 구문");

		int su = 0; // 0~10 까지만 입력을 받는 경우

		switch (su) {
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("짝수");
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수");
			break;

		// 추가
		default:
			System.out.println("1~10사이의 수를 입력해주세요");
		}
		System.out.println("switch 구문 연습종료");
			
		
	}

}
