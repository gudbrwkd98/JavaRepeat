package j0522;
//키보드를 통해서 값을 입력받아서 그대로 출력(콘솔)
import java.io.*;

public class SimpleIn {
    //메서드명 뒤에 throws 예외처리클래스명,,,,
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //키보드로부터 값을 입력(문자,특수기호,숫자)->재출력
		int charRead;//System.in.read()=>아스키코드값으로 저장
		//                더이상 읽어들이지 못하면 -1을 리턴 (ctrl+z)입력
		//              char->0~65535(유니코드)
		System.out.println("입력하고자하는 문자열을 아무거나 입력?");
		//제어문->for(X)->while구문
		while((charRead=System.in.read())>=0)//계속 읽어들이겠다.
			System.out.write(charRead);
			//System.out.print(charRead);//아스키코드값 출력
	}

}




