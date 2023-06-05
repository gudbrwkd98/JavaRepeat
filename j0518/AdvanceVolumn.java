package j0518;

//자식 인터페이스명 extends  부모 인터페이스명 
public interface AdvanceVolumn extends Volumn {
	/*
	 * 부모로부터 물려받은 추상메서드를 이미 가진 사태
	 * public void volumeUp(int level);
		public void volumeDown(int level);
	 * 
	 */
	public void turnOn(); //프로그램 전원 on
	public void turnOff(); //프로그램 전원 off  
	
	
}
