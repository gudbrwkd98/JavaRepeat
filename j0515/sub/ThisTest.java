package j0515.sub;

//1.메서드 (=생성자 포함) 를 작성할떄
// 멤버변수와 매개변수가 서로 같을떄 구분하는 목적 ? 

public class ThisTest {
	private int a = 100;
	
	ThisTest(int a){
		this.a = a ; //멤버변수 = 매개변수명 -> a = 200 
	}
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public static void main(String[] args) {
		ThisTest tt = new ThisTest(200);
		System.out.println("tt.getA() => " + tt.getA() );
	}
}
