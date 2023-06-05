	package j0519;
	
	/*
	 * 객체형변환(자동,명시적인 형변환)
	 * 장점 : 메서드의 갯수를 줄일수 있고, 오버라이딩 갯수 줄일수 있다.
	 * -> 코딩줄일 수 있다 -> 개발시간이 단축 -> 프로그램의 효율성 극대화 
	 */
	class Employee { // 일반직원
	
		// 세금율 -> Employee or Manager or Engineer
		public void taxRate(Employee e) {
				if(e instanceof Manager) {
					Manager m  = (Manager)e;
					System.out.println("Manager 에 맞게 세금계산 (1.0)=>" + m);
				}else if(e instanceof Engineer) {
					Engineer en = (Engineer)e;
					System.out.println("Engineer 에 맞게 세금계산(0.5) => " + en) ;
				}else if(e instanceof Employee){
					System.out.println("Employee 에 맞게 세금계산 (0.2) => " + e);
				}
		}//0.2
	
//		public void taxRate(Manager m) {
//	
//		}//1.0
//	
//		public void taxRate(Engineer e) {
//	
//		}//0.5
	
	}
	//팀장 -> 팀장의 역할 + 일반직원의 역할
	class Manager extends Employee{
		
	}
	//엔지니어 -> 엔지니어 역할 + 일반직원의 역할
	class Engineer extends Employee{
	
	}
	
	public class CastTest { // 일반직원
	
		public static void main(String[] args) {
				Employee emp = new Employee();
				Manager man = new Manager();
				Engineer eng = new Engineer();
				
				emp.taxRate(emp); //부모
				man.taxRate(man); // 자식-> 부모형으로 자동형변환
				eng.taxRate(eng);
				
		}
	
	}
