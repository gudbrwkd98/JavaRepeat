package j0510;
//논리형(=boolean)(불린),문자형(char) - 한글자 저장, 한글이상 저장 -> String 
public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("논리적인 값저장");
		boolean b = true; //소문자만 입력이 가능 = > True, TRUE(X)
		boolean b2 = 2>3; // false (관계연산자) 를 통해서 값 저장가능
		//변수의 자료형 = > 메모리를 알맞게 사용하는 목적
		System.out.println("b => " + b + ", b2=> " + b2);
		System.out.println("문자형");//char 
		char c1 = 'A';
		char c2 = 65;
		//문자형태의 16진수 형태로 입력을 받아서 문자로 저장
		//1~9 ,10(A),11(B),12(C)~15(F)
		// \u0000 ~ \uFFFF(RAM)
		// \u0041 => 4자리중에서 뒤에서 부터 자리수를 계산 (u 16진수형 문자)
		char c3 = '\u0041'; //A
		System.out.println("c1 =>"  + c1 + ", c2 => " + c2  + ", c3=> " +c3);
		String s1 = "자바 기초 문법";
		String s2 = "연산자";
		String s3 = s1+" "+s2;//문자열 결합 || (오라클)
		//빈문자열 => 문자열 내부에 공백이 들어간 문자열
		System.out.println("s3=>" + s3);
	}

}
