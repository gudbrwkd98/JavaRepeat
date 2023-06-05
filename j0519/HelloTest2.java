package j0519;

public class HelloTest2 {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		/*
		int i = 0 ; //점자
		String greetings[] = {"객체형변환","예외처리","예외처리방법"};
		while(i<4) { //예외처리
			System.out.println(greetings[i]);
			i++;
		}
		*/
		
		 
		try {
			// 
			HelloTest2 ht = new HelloTest2();
			ht.go();
		} catch (ArrayIndexOutOfBoundsException e) {
			//예외처리 구문 
			System.out.println("배열의 첨자 계산이 잘못되었습니다.");
			System.out.println(e.getMessage()); //초간단 에러 메세지
			System.out.println(e.toString()); //중간 정도의 에러 메세지
			e.printStackTrace();//에러에 관련된 모든 클래스를 추적한다
		}finally {
			//예외발생 구문과 상관없이 반드시 처리해야할 구문이 있다면 여기에 기술(DB 연동 해제) -> 메모리 해제구문 
			
		}

	 
	
	}
		public void go() throws ArrayIndexOutOfBoundsException{ //work 
			int i = 0 ; //점자
			String greetings[] = {"객체형변환","예외처리","예외처리방법"};
			while(i<4) { //예외처리
				System.out.println(greetings[i]);
				i++;
			}
		}
}
