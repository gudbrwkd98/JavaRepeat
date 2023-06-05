package j0509;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수의 개요 및 선언 , 작성법");
		/*
		 * 변수(Variable) => 메모리(RAM) 상에 문자,숫자,논리적인값을 
		 * 저장할 공간을 만들어준다.(ex 그릇,box)
		 * 형식) var 변수명 = 값 (자료형을 표시 X )
		 * <-> 자료형 (=데이터형=type) 변수명 = 값
		 */
		int age; //var age; 정수값 변수 선언 (공간은 만들어졋는데 아직 저장된게 없음)
		age = 25;
		//int age = 25 ;  변수를 선언하면서 동시에 값을 25 저장 
		System.out.println("올해 제 나이는 " + age  + " 입니다");
		int $test; // int #test;(X) _.$만 가능
		byte b = 23 ; //-128 ~ 127 Type mismatch (자료형이 다르다)
		short c = 12 ; //~32768 ~ 32767
		int sum =b+c;//23+12 = 35 
		System.out.println("sum => " + sum);
		//out of range (저장 범위를 벗어난 경우)
		long no = 999999999999999999L; 
		System.out.println("no =>" + no);
	}

}
