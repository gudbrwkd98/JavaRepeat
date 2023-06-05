package j0523;
/*
 * 컬렉션 (Collection) => 데이터 (객체) 를 저장할 수있는 구조 
 * 기본자료형(8가지)->저장X -> 객체가 아니기 때문에 저장 X  
 * 						<-> 참조형 (=객체형)
 * 기본자료형을 컬렉션에 저장하고 싶다 => Wrapper 클래스형 
 */

public class BoxingTest {
	
	public static void main(String[] args) {
		System.out.println("자동 unboxing");
		//int obj = 10 ; 
		Integer obj = new Integer(10);
		//unboxing => 자바의 객체형(Wrapper) => 기본자료형으로 변환 
		//int sum = obj.intValue() + 20 ; //Integer => int + int  = int(sum)
		int sum = obj+ 20 ; //Integer => int + int  = int(sum)
		System.out.println("sum = > "  + sum);
		System.out.println("자동 boxing");//기본자료형 - > Wrapper 객체 
		
		Double d = new Double(123.45);
		
		//메인이 static 클래스가 static -> 형식 - > main.class -> 정적 및 포함일 경우 main 생각 -> class(); 만가능ㅇ 
		printDouble(d);
		
		printDouble(new Double(155.55)); //익명 객체 형태로 객체를 전달 
		printDouble(143.67); //double - new Double (143.67) 
		
	}
	
	static void printDouble(Double obj2) {
		System.out.println(obj2.toString());
	}
}
