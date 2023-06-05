package j0523.sub;

import java.util.*;

//1.<?>와일드 카드를 이용한 제너릭 방법 -> 메서드 호출시 매개변수를 전달할때 


/*
 * 2.<T extends T> => 상속관계로 이루어진 클래스만 메서드의 매개변수로
 * 									받겠다는 표시
 * 								?(자식 클래스 Man,Woman)
 * 								T (부모 클래스 Person,Test)
 * 								부모클래스뿐만 아니라 자식클래스만 임의의 자료형으로
 * 								매개변수를 전달받겠다는 표시
 */
class Test{ //부모클래스
	String name;
}
class Person{ //부모클래스
	String name;
}

//man
class Man extends Person{
	//String name; 을 포함중
	Man(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

class Woman extends Person{
	//String name; 을 포함중
	Woman(String name){
		this.name = name;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}




public class WildExtend {
	
	public static void main(String[] args) {
		//1.Man 
		List<Man> list = new ArrayList<>();
		/*
		 * Man m = new Man("임시")
		 * list.add(m);
		 * 
		 */
		
		list.add(new Man("남테스트1"));
		list.add(new Man("남테스트2"));
		list.add(new Man("남테스트3"));
		printData(list);
		
		
		//2.Woman
		List<Woman> list2 = new ArrayList<>();
		list2.add(new Woman("여테스트1"));
		list2.add(new Woman("여테스트2"));
		list2.add(new Woman("여테스트3"));
		printData(list2);
		
		//3.Person
		List<Person> list3 = new ArrayList<>();
		list3.add(new Person()) ; 
		//printData(list3);
		//4.Test
		List<Test> list4 = new ArrayList<>();
		list4.add(new Test()) ; 
		//printData(list4);
	}
	//모든 클래스 OK 
	/*
	public static void printData(List<?> list) {
		for(Object obj:list) //wildcard - List<?> 로 받고 object 로 빼낸다.
			System.out.println(obj);
	}
	*/
												// ?(Man,Woman,Test O , Person X)
	public static void printData(List<? extends Person> list) {
		for(Object obj:list) //wildcard - List<?> 로 받고 object 로 빼낸다.
			System.out.println(obj);
	}
	
}
