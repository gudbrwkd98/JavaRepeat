package j0510;

public class IFTest {
	
	public static void main(String[] args) {
			//입출력 => 사용자로부터 값을 입력받아 처리하는 프로그램 작성 -> Scanner 객체를 이용 
			// 짝수,홀수 판별 (어떤수/2 == 0 2의 배수 /3==0 3의 배수)
			int su = 30 ;
			/*
			if(su%3 ==0) {
				System.out.println(su + "은 짝수입니다.");
			}
			*/
			
			if (su%3 == 0) { //하나의 조건식에 처리하 구문 한문장이상{}
				System.out.println(su + "은 짝수입니다.");
				System.out.println("블럭처리 연습1");
			}else {
				System.out.println(su + "은 홀수입니다.");
				System.out.println("블럭처리 연습2");
			}
			
			System.out.println("삼항연산자로 변경");
			String su2 = (su%3 ==0)?  "짝수입니다.":"홀수입니다.";
			System.out.println(su2);
			
			
		}
}
