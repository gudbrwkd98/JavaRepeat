package j0518;

abstract class ImTest{
	public int sum(int x, int y ) {
		return (x+y);
	}
	//추상메서드 => 메서드 의 선언만 되어있는 메서드 -> 형식)메서드명();
	public abstract void draw();
	abstract public void go();
	public void go2() {}//일반메서드 
}
public class Test extends ImTest{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//stack선언 
		int result =sum(10, 20);
		System.out.println("result => "  + result);
	}
	
	@Override
	public void go() { //내용만 쓰지않을뿐 일반메서드 
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.draw();
		System.out.println(t.sum(30,40));
	}
	
}
