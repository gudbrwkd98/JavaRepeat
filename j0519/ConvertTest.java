package j0519;

import java.util.Scanner;

public class ConvertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력");
		String input = sc.nextLine(); //hello
//		String finalInput = "";
//		char [] arr = new  char[input.length()];
//		for (int i = 0; i < arr.length; i++) {
//			if(Character.isUpperCase(input.charAt(i))) {
//				arr[i] = Character.toLowerCase(input.charAt(i));
//			}else {
//				arr[i] = Character.toUpperCase(input.charAt(i));
//			}																											
//			finalInput += Character.toString(arr[i]);
//		}
//		System.out.println("input => " + finalInput);
		
		char ch ; 
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if(Character.isLowerCase(ch)) {
				System.out.print(Character.toUpperCase(ch));
			}else {
				System.out.print(Character.toLowerCase(ch));
			}
		}
		
	}
}
