package j0517;


//부서의 팀장정보 저장=> 중복코딩이 필요(업무상)
//형식 ) class 자식클래스명 extends 부모클래스명
class Manager extends Employee{
 
	
	/*
	 * 	String name;
		int age;
		String sung ; //성별
		String addr; //주소
		long salary;//급여 -> 공기업(보너스)->직원(150%),팀장(300%)반영 
	 */
	String department;//부서명 => 개발팀
	//객체배열 => 객체만 저장이 되는 배열 
	Employee sub[];
	
	public Manager() {}
	
	public Manager(String name,int age,String sung,long salary,String addr,String department) {
		super(name,age,sung,addr,salary);//Employee 의 기본생성자를 호출하라
		/* 1. 중복 코딩 -> 부모의 생성자가 대신 저장시켜주는것으로 처리(재사용성)
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.salary = salary;
		this.addr  = addr;
		*/
		//------------------
		this.department = department;
	}
	//자식입장에 맞게 내용을다시 수정해주는 행위=>오버라이딩 
	double bonus() {
		return salary * 3.0;
	}
	void display() {
		/* 중복코딩 제거 Super.display() 출력 
		System.out.println("====직원의 정보 ====");
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("성별 => " + sung);
		System.out.println("주소 => " + addr);
		System.out.println("급여 => " + salary);
		System.out.println("보너스 => " + this.bonus());
		*/
		super.display(); //중복 코딩 제거 및 소스 재사용 
		//추가 
		System.out.println("담당부서명 = > " + department);
		System.out.println("부하 직원의 수 = > " + sub.length);
		// 한가지라도 바꿀시 오버라이딩으로 판별됨 
	}
}

public class Company {
	public static void main(String[] args) {
		//1.신입사원 3명 배정 
		Employee e1 = new Employee("홍길동",23,"남","서울시 논현구",1500);
		
		Employee e2 = new Employee("테스트",35,"남","대전시 중구",1700);
		
		Employee e3 = new Employee("임시",30,"여","부산시",1800);
		
		//2.부서배치(=개발부)
		Manager m1 = new Manager("임시테스트",42,"남",3500,"서울시 강남구","개발 1과");
		
		m1.sub = new Employee[3];//Employee 데이터 저장공간 3개 생성 
		m1.sub[0] = e1;
		m1.sub[1] = e2;
		m1.sub[2] = e3;
		//부하직원의 정보,팀장출력
		
		for (int i = 0; i < m1.sub.length; i++) {
			//System.out.println("직원명 => " + m1.sub[i].name);
			m1.sub[i].display();//모든 멤버변수 출력
 
		}
		//팀장1명
		m1.display();
		
		
	}
	
}
