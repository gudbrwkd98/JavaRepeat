package j0512;

public class TV {
	//1.공통의 저장할 특성,특징
	String maker ; //제조사 ->null(default)
	String name ; //모델명
	String color ; //색깔 
	int size;//인치 - >  default 값 -> int -> 0 , boolean ->false , double -> 0.0
	//상태 
	boolean power = false;//전원상태
	int channel ; // 0 
	//2.TV 기능
	//1)리모콘으로 전원 on/off => 단순 반복
	void turnOn() {
		power = !power; //pwer = true ; !false
		System.out.println("로딩중...TV 전원 ON!!");
	}
	//2) 전원 off
	void turnOff() {
		power = !power; //pwer = true ; !false
		System.out.println("로딩중...TV 전원 Off!!");
	}	
	
	//3) 채널 change => up(매개변수 O) 반환값 x 
	void channelUp(int ch) {
		channel += ch;
		System.out.println("현재 변경된 채널은" + channel + "입니다");
	}
	//4) 채널 down 
	void channelDown(int ch) {
		channel -= ch;
		System.out.println("현재 변경된 채널은" + channel + "입니다");
	}
	
	//5) Tv 채널 정보->채널 편성표 
	void tvDisplay() {
		System.out.println("==TV 정보 출력 ==");
		System.out.println("모델명 => " + name);
		System.out.println("사이즈 => " + size);
		System.out.println("색상 => " + color);
		System.out.println("현재 채널 => " + channel);
		System.out.println("전원상태 => " + power);
	}
	//6)말하면 채널변경기능 -> 매개변수 
	void speakChannel(String ch) { //"ocn"(35),"sport"(121)
			//String 객체 -> 문자열을 비교 (equals(비교할 문자열)대,소문자 구분 O )
		if(ch.equals("ocn")) {
			channel = 35;
		}else if(ch.contentEquals("sports")) {
			channel = 129;
		}else if(ch.equals("tvn")) {
			channel = 3 ;
		}
		System.out.println("현재 채널은 " + channel + "로 이동중입니다.");
	}
	
	
}
