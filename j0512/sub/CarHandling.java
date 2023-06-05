package j0512.sub;

public class CarHandling {
	public static void main(String[] args) {
		// 객체생성 => 객체 (저장할 대상자) 를 저장할 수 있는 공간을 만들어라.
		// 형식 ) 설계도 이름 (=클래스 이름 ) 객체명(=변수) = new 클래스명 ()
		int age; // 4byte 기억공간이 생성

		// Car morning;//객체 선언 -> 기억공간이 생성 X (예약된 상태)
		Car morning = new Car(); // 공간이 생성
		Car sonata = new Car();

		// j0512(패키지명).Car(클래스명).Car@6f2b958e(데이터가 저장된 주소값)
		// moning => 0512.Car@6f2b958e
		System.out.println("morning = > " + morning);
		System.out.println("sonata = > " + sonata);
		// 2.객체명(저장된위치).멤버변수명=값(저장)
		/*
		 * morning.name="모닝"; morning.output =1000; morning.color = "blue"; morning.year
		 * = 2023;
		 */
		morning.setName(null);
		morning.setOutPut(-1000);
		morning.setColor("blue");
		morning.setYear(2027);
		morning.startEnginee();
		//morning.speedUp(15000);
		morning.setSidong(false);
		morning.speedDown(300);

		morning.carInfoPrint();
		// 3.운전 -> 메서드 호출-> 기능작동(리모콘의 버튼 클릭)
		/*
		 * morning.speedUp(150); //speedUp메서드를 호출하면서 150 값 전달 morning.speedDown(100); //
		 * 150 - 100 = 100 //객체명 (저장된 위치).멤버변수 System.out.println("차의 이름은 => " +
		 * morning.name); System.out.println("차의 배기량 = > " + morning.output); //자주 사용되고
		 * 반복적인 코드 => 메서드를 만들어서 호출 //-> 코드의 재사용성, 코딩양이 줄어든다.(개발시간이 단축) => 프로드램 안정화
		 * sonata.name = "소나타";
		 * 
		 * morning.carInfoPrint(); sonata.carInfoPrint();// 같은 메서드라도 저장되는 위치가 다르다.
		 */

	}
}
