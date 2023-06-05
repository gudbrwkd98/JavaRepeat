package j0517;
//super 키워드<-> this 키워드 (자식 클래스의 객체를 가리키는 예약어)
//부모 클래스의 객체를 가리키는 예약어 
class Person{

	String name; //null 
	int age=20;
	
	void print() {
		System.out.println("Person 메서드(name) => " + name);
	}

}
//기능(메서드)을 물려받는다.(상속) 
class Man extends Person{
	//상속을 받은 멤버변수와 이름이 같은 변수를 자식클레스에 또 선언이 가능 
	int age = 40 ; 
	/*
		 	String name; //null 
			int age;
			
			void print() {
				System.out.println("Person 메서드(name) => " + name);
			}
			자식클래스에 부모와 동일한 멤버변수가 존재하면 어떻게 구분?
			super.멤버변수
	 */
	
	void print() {//자식에게 맞게 내용을 수정 
		
		System.out.println("자식 클래스에 age => " + this.age);//40
		
		System.out.println("부모 클래스에 age => " + super.age);//20
		super.print();
	}
}
public class Super2 {
	
	public static void main(String[] args) {
		Man m = new Man();
		m.name="홍길동";
		m.print();
	}
	
}
