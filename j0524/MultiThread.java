package j0524;

//1.Thread 를 만드는 방법(Thread 클래스를 상속바다서 작성) => run()
 public class MultiThread extends Thread{

	 MultiThread(String s){
		 super(s); //부모의 쓰레드 이름을 대신 써주는 생성자 호출
		 //this.setName(S);<->getName();
	 }
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for (int i = 'A'; i <='Z'; i++) {
			 
			 try {
				Thread.sleep(500);
				System.out.println((char)i);
				System.out.println("쓰레드 이름 => "+ getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}//1000=>1초
	
		}
	}
	 
	 public static void main(String[] args) {
		 //1) 상속-> 2)run() 재정의 -> 3) Thread 객체생성 -> 4) 가동
		  MultiThread mt=new MultiThread("임시");//부여
		  //1.callback method=>운영체제가 내부적으로 불러다 사용하는 메서드
		  //2.run()->안정성을 보장할 수 없다.->main()(X)
		  mt.start();//->mt.run() 도 가능한데(X)=>프로그램의 안정성때문에
		  System.out.println("main쓰레드를 계속 사용할 수 있는지 없는지 판단");
	 }
	 
}
