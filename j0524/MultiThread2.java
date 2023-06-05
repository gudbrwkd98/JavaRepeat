package j0524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1.Thread 를 만드는 방법(Thread 클래스를 상속바다서 작성) => run()
 public class MultiThread2 extends Thread {

	 public static void main(String[] args) throws IOException{
		 System.out.println("실행시킬 단을 입력?");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int dan = Integer.parseInt(br.readLine());
		 //1.Runnable 객체 생성
		 GooGoo go = new GooGoo(dan);
		 //2.Thread 객체 생성 - > 생성자 인수로 go 전달
		 Thread t = new Thread(go);
		 //3.Thread 객체를 start()호출
		 PrintThread pt = new PrintThread();
		 //한개 이상의 쓰레드를 실행 -> 서로 경쟁적으로 실행 (둘의 실행결과가 섞여서 출력)
		 //우선순위 10 > 5 > 1 
		 t.setPriority(10);//Thread.MAX_PRIORITY
		 pt.setPriority(Thread.MIN_PRIORITY);
		 t.start();pt.start();
	 }
 }
 
	 
 
	 //2.구구단을 출력 = > runnable 인터페이스를 상속
	 class GooGoo implements Runnable{
		 private int dan; //단을 저장
		 
		 public GooGoo(int dan) {
			// TODO Auto-generated constructor stub
			 this.dan = dan;
		 }
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 1; i < dan; i++) {
				System.out.println(dan + "단 =>"+dan+"*" + i+ "=" + dan*i);
				
			}
		}
		 	
	 }
	 
	 //1.Thread 를 직접 상속받아서 작성
class PrintThread extends Thread{
		 
		 @Override
		public void run() {
			 for (int i = 1; i <= 9; i++) {
				try {
					long sleeptime = (long) (Math.random()*1000+1);
					//System.out.println("sleeptime = > "  + sleeptime);
					Thread.sleep(sleeptime);
					//System.out.println(i);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	 }
	 
 

	 

