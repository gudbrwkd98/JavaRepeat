package j0523;

import java.util.*;

//1.<?>와일드 카드를 이용한 제너릭 방법 -> 메서드 호출시 매개변수를 전달할때 

public class WildTest {
	
	public static void main(String[] args) {
		//1.문자열 
		List<String> list = new ArrayList<>();
		list.add("테스트1") ; list.add("테스트2"); list.add("테스트3");
		printData(list);
		//2.정수형
		List<Integer> list2 = new ArrayList<>();
		list2.add(123) ; list2.add(4124); list2.add(12332);
		printData(list2);
		//3.소수점 
		List<Double> list3 = new ArrayList<>();
		list3.add(123.244) ; list3.add(5335.4); list3.add(1237.9);
		printData(list3);
	}
	
	public static void printData(List<?> list) {
		for(Object obj:list) //wildcard - List<?> 로 받고 object 로 빼낸다.
			System.out.println(obj);
	}
	
}
