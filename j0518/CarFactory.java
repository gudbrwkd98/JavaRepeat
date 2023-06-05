package j0518;
/*
 * static(정적의) 1.정적멤버변수 2.정적메서드 3.초기화 블럭(static {})
 * 
 * 멤버변수(=인스턴스변수) = > 클래스 내부에서 선언된 변수 -> 공유 X (독립적 저장)
 * 정적멤버변수(=클래스변수) => 모든 객체가 공유할수 있도록 만들어진 변수
 * 									=> 클래스명.정적멤버변수명 or 객체명.정적멤버변수명
 * 									ex)아파트 관리비 (반장) 엘리베이터 수리,회식,, 
 * 
 * 
 */
class Car{
	String color;
	String model;
	String owner; // 주문자
	//차의 종류와 상관없이 차의 생산량의 합을 계산 
	static int serialNumber; //공유값 (ex 프린터 1대)
	
	public Car(String color, String model, String owner) {
		super();
		this.color = color; //c1.color = "red";
		this.model = model; 
		this.owner = owner;
		serialNumber++;//공통으로 모든 객체가 불러다 사용하고 싶다 (공유)
									//this 를 정적메서드 내부에서 사용할 수 없기떄문에 
	}
	
	/*
	public int getNumber() {
		return this.color; //정적메서드 내부에서는 멤버변수 사용 X 
									//this 를 정적 메서드 내부에서 사용할 수 없기 떄ㅖ문에 
	}
	*/
	
	public static int getNumber() {
		return serialNumber;
	}
	//main() 보다 먼저 실행시킬 구문이 필요하다면 static 영역설정
	//환경설정 -> DB 연동
	static {
		int su = 3 ;
		System.out.println("제일먼저 main() 보다 실행할 구문이 필요");
		System.out.println("DB 접속을 먼저 가능하도록 설정하고 싶을떄 ");
		System.out.println("1.static 정적변수 2.main() 호출 ");
		System.out.println("3.정적 메서드 4.클래스 순으로 메모리에 로딩 ");
	}
	
}

public class CarFactory {
		public static void main(String[] args) {
			Car c1 = new Car("Red", "SM5", "테스트");
			Car c2 = new Car("Blue", "Sonata", "임시");
			System.out.println("차생산량(객체명.정적변수)=>" + c1.serialNumber);
			System.out.println("차생산량(객체명.정적변수)=>" + c2.serialNumber);
			System.out.println("차생산량(클래스명.정적변수)=>" + Car.serialNumber);
			System.out.println("차생산량(클래스명.정적메서드)=>" + Car.getNumber());
			System.out.println("차생산량(객체명.정적메서드)=>" + c1.getNumber());
		}
}
