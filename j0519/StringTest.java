package j0519;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력");//next()(단어),nextLine()
		String input = sc.nextLine(); //hello
		stringPrint(input);
		sc.close();//메모리를 해제시켜주는 메서드(프로그램 종료와 함께) 
	} 
	//매개변수 O 변환값 X 
	public static void stringPrint(String s) {
		//1.concat=>문자열 결합 
		System.out.println("s.concat('test')=>" + s.concat("test"));
		//2.substring(시작인데스(O),종료인덱스-1(바로앞번호까지)
		System.out.println("s.substring(1,4) =>" + s.substring(1,4));
		//3.시작인덱스 번호 부터 문자열 끝까지 출력
		System.out.println("s.substring(1) =>" + s.substring(1));
		//4.toUpperCase(대문자로 변환)<-> toLowerCase()소문자로 변경
		System.out.println("s.toUpperCase() =>" + s.toUpperCase());
		//5.특정문자열을 변경->replace (변경전단어,변경후단어)
		System.out.println("s.replace('l','t' =>" + s.replace('l', 't'));
		//6.문자열의 길이 -> length(),배열의 길이 => 배열명.length(메서드 x)
		System.out.println("s.length() =>" + s.length());
		//7.문자열 중에서 특정위치에 있는 문자출력  => charAt(인덱스번호)
		System.out.println("s.charAt(2) =>" + s.charAt(2));
		//8.특정문자 몇번째 인덱스번호에 위치 indexOf('문자') => 인덱스 번호
		//못찾으면 -1을 리턴
		System.out.println("s.indexOf('l') =>" + s.indexOf('l') );
		//9.뒤에서 찾는 경우 lastIndexOf(확장자를 찾을때)
		System.out.println("s.lastIndexOf('l') =>" + s.lastIndexOf('l'));
		//10.공백을 제거 -> trim() = > "abcd    " => "abcd" => 공백도 문자열 
		System.out.println("s.trim().length => " + s.trim());
	}
	
	 
}
