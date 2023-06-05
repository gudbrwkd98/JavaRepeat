package j0524;

//import java.lang.Thread 기본적인 패키지는 자동으로 import 처리
public class ThreadTest {
	//메인 쓰레드-> 메인 메서드를 실행시켜주는 내부적인 쓰레드
	public static void main(String[] args) {
		//현재 작동중인 쓰레드 객체 Thread.currentThread();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		//쓰레드 -> 실시간으로 데이터 전송(채팅) , 게임,실시간 전략
		while(true) {//무한루프->쓰레드의 한부분
			System.out.println("main Thread 실행중...");
		}
	}
	
}
