package j0523;

//회원가입 => 회원로그인 - > 관리자만 회원리스트 목록을 볼 수 있도록 구성 
import java.util.*;//ArrayList,,,,
import java.io.Serializable;

//class Person implements Serializable{}
class Person{ //DTO(Data Transfer Object) 데이터 전송객체
		private String name;
		private int age;
		
		public Person() {}

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

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
		
		
		
		
		
}

public class ArrayListTest2 {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("회원명?");
			String name = sc.next();
			System.out.println("나이??");
			int age = sc.nextInt();
			
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			
			
			
			
			
			
			
			
			
	}
	
}
