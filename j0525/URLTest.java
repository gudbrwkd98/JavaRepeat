package j0525;

import java.io.*; // 																							
import java.net.URL;
import java.util.Scanner;

public class URLTest {
	
	public URLTest(String s) throws Exception{
		URL url = new URL(s);
		//직접 사이트에서 데이터를 가져오기(원격:출력->로컬:입력)
		InputStream in = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String ss; //읽어들여서 임시로 저장할 변수
		while((ss=br.readLine()) != null) {
			System.out.println(ss);
		}
		in.close();		br.close();							
	}																															
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 사이트 도메인이름 ? (https://도메인이름)");
		String domain = sc.next();
	 
		
		new URLTest(domain);//https://www.naver.com
	}
	
}
