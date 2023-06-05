package j0523;
/*
 * 자주 사용이 되는 클래스도 import 형태ㅗ 등록
 * 형식) import static 자주 불러다 사용하는 클래스명(패키지명...클래스명)
 *	제너릭 클래스 -> 특정 자료형의 값만 입력받아서 저장,조회,계산,출력
 *					적용)멤버변수,메서드의 매개변수에도 제너릭을 부여가능 
 *
 */

import static java.lang.System.out; //메모리에 로딩


public class GenericEx <T>{ //GenericEx클래스의 객체를 생성하면서 
	/*String v[];						//Type에대한 자료형만 받아서 처리하겠다
	Double v2[];
	Integer v3[];
	*/
	
	T v[];
	
	//1.배열에 값을 저장(setter)
	public void set(T n[] ) {
		v = n;
	}
	 
	//2.배열의 값을 꺼내와서 출력(getter)
	private void print() {
		// TODO Auto-generated method stub
		for(T s:v) {
			out.println(s);
		}
	}
	
	 
	
	
	public static void main(String[] args) {
		//객체는 다르게 설정,타입도 다르게 설정해서 생성
		GenericEx <String>ge = new GenericEx<String>();
		GenericEx <Double>ge2 = new GenericEx<Double>();
		GenericEx <Integer>ge3 = new GenericEx<Integer>();
		String ss[] = {"제너릭","제너릭의 종류","제너릭 실습"};
		ge.set(ss);
		ge.print();
		
		Double ss2[] = {10.2,10.4,5.5};
		ge2.set(ss2);
		ge2.print();
		
		Integer ss3[] = {15,11,50};
		ge3.set(ss3);
		ge3.print();
		
	}
	
}
