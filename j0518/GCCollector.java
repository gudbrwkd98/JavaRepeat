package j0518;

public class GCCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runtime r = new Runtime();//(X) 생성자가 없다는 얘기 new X 
		Runtime  r = Runtime.getRuntime();//클래스명.정적메서드명()
		System.out.println("r = > " + r);
		
		byte test[] = new byte[1024]; //1024개의 정수값 저장공간
		test[0] = 20 ; test[1] = 35;
		//참조형 = > 클래스,배열,인터페이스
		System.out.println("test =>" + test);
		System.out.println("before 사용량  =>" + (r.totalMemory()-r.freeMemory())/1024+"K");
		//usb 인식 X => 외부손상
		//자바의 특징->불필요로 하는 메모리가 발생 => 자동으로 메모리를 해제
		test = null; //일부러 주소값을 지움-> 데이터 공간낭비 
		System.gc();
		System.out.println("after 사용량  =>" + (r.totalMemory()-r.freeMemory())/1024+"K");
		
	}

}
