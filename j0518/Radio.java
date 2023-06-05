package j0518;

public class Radio implements AdvanceVolumn {
	/*
	 * 자식 인터페이스 extends 부모 인터페이스명
	 * 자식클래스 extends 부모클래스명
	 * 자식클래스 implements 부모인터페이스명 1 , 부모 인터페이스명 2 ... 다중상속
	 */
	
	private int VolLevel; //볼륨의 크기
	
	//다형성 = > 메서드명은 같지만 실제내용은 다르다 = > 기능이 다 다르다.
	
	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel+= level;
		System.out.println("Radio 음악프로그램의 볼륨을" + level + "만큼올림");
	}

	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		VolLevel -= level;
		if(VolLevel < 0) {
			VolLevel = 0 ;
		}
		System.out.println("Radio 음악프로그램의 볼륨을" + level + "만큼올림");
		
	}
	
	//TV 에있는 다른기능은 각자 개발자에게 맡김

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악 프로그램을 turnOn!!!");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악 프로그램을 turnOff!!!");
	}
	
}
