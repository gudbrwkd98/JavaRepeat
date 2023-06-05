package j0515.sub;

class Person {
	// 1.멤버변수
	private String name;
	private int age;

	// private String addr, job , tel,,,
	// (),(name),(age),(name,age)
	// (),(name),(age),(addr),(name,age),(age,addr),(name,addr))
	// (name,age,addr)
	// 생성자는 멤버변수 다음에 쓰는 경향
	public Person() {
		name = "홍길동'";
		age = 23;
		System.out.println("난 Person 클래스 기본 생성자 호출됨!");
	}

	// Person p2 = new Person("테스트")
	public Person(String n) {
		name = n;
		age = 24;
		System.out.println("난 매개변수 1개짜리 문자열 처리 생성자 호출됨");
	}
	//Person p3 = new Person("24")
	public Person(int a) {
		age = a;
		name = "테스트김";
		System.out.println("난 매개변수 1개짜리 정수값 처리 생성자 호출됨");
	}
	//Person p4 = new Person("테스트김","24")
	public Person(String n,int a ) {
		name = n ; 
		age = a ;
		System.out.println("난 매개변수 2 개짜리 문자,정수 처리 생성자 호출됨");
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		if (a < 0) {
			System.out.println("나이는 음수 입력 불가");
			age = 23;
		} else {
			age = a;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	void print() {
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
	}
}

public class PersonHandling {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김길동");
		p1.setAge(24);
		p1.print();
		System.out.println("====================");
		Person p2 = new Person("테스트");
		p2.print();
		System.out.println("====================");
		Person p3= new Person(24);
		p3.print();
		System.out.println("====================");
		Person p4 = new Person("테스트김",24);
		p4.print();
		System.out.println("====================");
		
		
	}
}
