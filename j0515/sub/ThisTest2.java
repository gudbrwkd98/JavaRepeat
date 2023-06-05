package j0515.sub;

//1.메서드 (=생성자 포함) 를 작성할떄
// 멤버변수와 매개변수가 서로 같을떄 구분하는 목적 ? 

public class ThisTest2 {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	ThisTest2() {
		// 생성자 내부에서는 자기클래스의 객체명을 사용 X
		System.out.println("현재 생성된 객체(this) => " + this);
	}

	public static void main(String[] args) {
		ThisTest2 tt = new ThisTest2();

	}
}
