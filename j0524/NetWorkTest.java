package j0524;

import java.net.*;//InetAddress,Socket,ServerSocket(채팅)
//checked Exception 계열 => 반드시 예외처리 해야한다.
//입출력,DB연동,네트워크 통신 , 쓰레드,,

public class NetWorkTest {
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = null;//ip주소에 대한객체
		InetAddress ia2[];//컴퓨터가 한대이상 
		//www.naver.com(도메인 이름)->ip
	 
			ia = InetAddress.getByName("www.naver.com");
			System.out.println("서버주소 => " + ia.getHostAddress());
			//서버가 한대이상 -> getAllbyName
			System.out.println("==========");
			ia2 =InetAddress.getAllByName("www.naver.com");
			for(InetAddress aa : ia2) 
				System.out.println("서버들 주소 => "  + aa.getHostAddress());
				System.out.println("==자기 컴퓨터 정보==");
				InetAddress host = InetAddress.getLocalHost();
				System.out.println("컴퓨터명 => " + host.getHostAddress());
				System.out.println("ip 주소 => "  + host.getHostAddress());
			
	}
	
}
