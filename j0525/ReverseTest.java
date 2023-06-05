package j0525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTest {
	public static void main(String[] args) {
		ReverseTest rt = new ReverseTest();

		System.out.println("문자열을 입력해주세요");
		rt.setBuffer(rt.getBuffer());
		
	}
	
	public BufferedReader getBuffer() {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
						//익명객체 반환시
		return new BufferedReader(new InputStreamReader(System.in));
	}
																																				
	public void setBuffer(BufferedReader bf) {
		try {
			StringBuffer sb = new StringBuffer(bf.readLine());
			System.out.println(sb.reverse().toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("문자열 받아오기 오류");
		}
		
		
	}
	
}
