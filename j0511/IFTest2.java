package j0511;

public class IFTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("중첩 if 문");
		// 조건1) su -> 1~100 까지의 범위에 해당되는 숫자만 입력을 받을것
		// 조건2) 짝수,홀수
		// 짝수,홀수
		int su = 110; // 사용자로부터 값을 입력받아 저장
		if ((su >= 1) && (su <= 100)) {
			if (su % 3 == 0) { // 하나의 조건식에 처리하 구문 한문장이상{}
				System.out.println(su + "은 짝수입니다.");
				System.out.println("블럭처리 연습1");
			} else {
				System.out.println(su + "은 홀수입니다.");
				System.out.println("블럭처리 연습2");
			}
		} else {
			System.out.println("su값은 1~100까지의 값만 입력이 가능!");
		}
		System.out.println("if 문 종료"); // 순차문

	}

}
