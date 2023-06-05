package j0511;

/*
 * 반복문 => 특정조건에 따라서 반복해서 실행이 되는 문장 => 반복해서 사용문장
 * 
 * 1.반복할 횟수가 정해져 있는 경우 -> for(O) ,while
 * 2.반복할 수가 정해져 있지않은 경우->for(x),while(O)(입출력 프로그램)
 * 									파일을 불러오는 경우(파일의 내용X)
 * 
 * 
 * 
 */
public class WhileTest {
	public static void main(String[] args) {
		//단순하고 반복적인 문장 100번 
		int i = 1 ;
		/*while (i<=100) {
			System.out.println("while구문 연습" + i);
			i++;
		}
		*/
		
		do {
			System.out.println("while구문 연습" + i);
			i++;			
		} while (i>=5);
		
		
		System.out.println("while 구문 종료");
	}
}
