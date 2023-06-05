package j0516;

//신입사원에 대한 정보를 저장할 목정 (추상화)(공기업)
public class Employee {

	//1.멤버변수
	String name;
	int age;
	String sung ; //성별
	String addr; //주소
	long salary;//급여 -> 공기업(보너스)->직원(150%),팀장(300%)반영 
	
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
	public String getSung() {
		return sung;
	}
	public void setSung(String sung) {
		this.sung = sung;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public Employee(String name, int age, String sung, String addr, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
	}
	
	//보너스를 구해주는 메서드 => 급여 *1.5 , 팀장 급여 * 3.0
	double bonus() {
		return salary * 1.5;
	}
	//3.멤버변수의 값 출력
	//하나의 클래스 내부에서 일반메서드 -> 다른 일반메서드 호출O
	void display() {
		System.out.println("====직원의 정보 ====");
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("성별 => " + sung);
		System.out.println("주소 => " + addr);
		System.out.println("급여 => " + salary);
		System.out.println("보너스 => " + this.bonus());
	}
	 
	
	
	
}
