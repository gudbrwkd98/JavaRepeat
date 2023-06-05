package j0518;
/*
 * 전체 프로그램에 사용되는 모든 공통적인 기능(=업무분석) 을 가지고
 * 추상메서드를 선언
 * 누구나 접근이 가능하도록 public interface 로 작성 
 * 
 */
public interface Volumn {
	//1.볼륨을 올리기 -> 수정 -> 매개변수 O , 반환값 X 
		public void volumeUp(int level);

		
		//2.볼륨을 내리기 -> 수정
		public void volumeDown(int level);
		//3,4 turn on turn off
}
