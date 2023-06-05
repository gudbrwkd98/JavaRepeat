package j0524;

public interface Calc {
	double PI = 3.141592;
	
	public void go();
	
	//인터페이스에서 일반메서드 기능 사용 할려면 메서드명 앞에 default 써준다.
	public default void test() {
		System.out.println("일반 메서드 연습");
	}
	
}
