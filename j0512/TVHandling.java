package j0512;

public class TVHandling {
	public static void main(String[] args) {
		//1.TV객체(같은구조 = > 모양이 다르다.(Size))
		TV smartTV = new TV(); //객체 생성 => 저장할 공간을 만들어라
		//2.객체명.멤버변수 = 값
		System.out.println("smartTV=>" + smartTV);//주소
		smartTV.name= "삼성 smartTV s34";
		smartTV.maker="삼성";
		smartTV.color = "검정색";
		smartTV.size = 50;
		
		//3. 주문 - > 배송 -> 설치 => 객체명.호출할 메서드명() O 
		smartTV.turnOn();
		smartTV.channelUp(45);
		smartTV.channelDown(15);
		smartTV.speakChannel("ocn");
		
		//전체채널 편성표
		smartTV.tvDisplay();
		smartTV.turnOff();
		
	}
}
