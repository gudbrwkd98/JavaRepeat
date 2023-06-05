package j0518;

public class VolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("설계한 대로 실행체크(단위테스트)");
		TV t = new TV();
		Radio ra = new Radio();
		//객체는 다르지만 공통적으로 사용하는 매서드ㅡㄴ 같다(통일성 부여) 
		t.turnOn();
		ra.turnOn();
		
		t.volumeUp(12);
		ra.volumeUp(8);
		//비슷한 기능을 가진 메서드 작성 => 메서드명을 통일 (=오버로딩)
		//의 확장판 (모든 클래스 단위로 설계) 
		
	}

}
