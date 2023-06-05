package j0515;

//추상화 -> 직사각형의 면적(객체)를 공통속성, 공통기능 -> 새로운 자료형
class Rects {
//1.공통멤버변수
	private int x, y = 10;// 가로,세로
	private int area; // 면적 -> double area;//삼각형 또는 원의 면적

	public void setX(int a) {
		if (a < 0) {
			System.out.println("x값은 음수입력 불가");
			x = 20;// 값을 입역을 못받기 떄문에 초기값 설정
			return;
		}
		x = a;
	}

	public void setY(int a) {
		if (a < 0) {
			System.out.println("y값은 음수입력 불기");
			y = 20;
			return;
		} else {
			y = a;
		}
	}
	//public 반환형 getXX(){reutrn 꺼내올 멤버 변수명;}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	//2.공통기능(메서드) 면적을 구하는 메서드
	//1)매개변수X 반환형 X => 단순,반복 => 똑같은 문장을 반복.
	void print() {
		System.out.println("x 의 값 = > " + x +", 이고 y 의 값 => " + y);
		System.out.println("x*y =>" + (x*y)+"입니다");
	}
	
	void area(int a, int b ) {
		x =a ;
		y = b;
		System.out.println("x*y => " + (x*y) + "입니다");
	}
	//3.매개변수 O , 반환값 O => 계산목적 ,웹프로그래밍방식
	//반환값 -> 호출되는 메서드가 
	int area2(int a , int b) {
		int result = a*b;
		return result ; //return 계산 결과값(변수) or 수식 or 객체
	}
}

public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect rec = new Rect();

		int x = 20;
		int y = 10;
		rec.setX(x);
		rec.setY(y);

		rec.calcuRect(rec.getX(), rec.getY());
		
		
		Rects r= new Rects(); // 객체생성=> 공간을 생성해달라
		r.setX(-20);
		r.setY(30);
		//3.객체명 호출할 메서드명 () or (~)
		r.print();
		//4.매개변수를 전달 -> 계산 -> 출력 
		r.area(20, 40);//area 메서드 호출하면서 개변수 20,40
		//5.반환값이 있는 메서드 호출
		//형식) 반환받는 변수명 = 객체명.호출할 메서드명(~)
		int reply = r.area2(60, 40);
		System.out.println("계산받은 결과값(reply) => " + reply );
		System.out.println("====================");
		System.out.println("r.are2(30,40) = >" + r.area2(30, 40));
	}

}
