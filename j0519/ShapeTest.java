package j0519;

import java.util.Iterator;

public class ShapeTest {
	
	public static void main(String[] args) {
		System.out.println("객체자동형변환 연습");
		Shape s = new Shape();
		Point p = new  Point();
		Line l = new Line();
		Square sq = new Square();
		
		s.shapeDraw();
		p.pointDraw();
		l.lineDraw();
		sq.squareDraw();
		System.out.println("==객체 자동형변환==");
		
		Shape sh[] = new Shape[4]; //Shape형의 객체만 저장 
		sh[0] = s;
		//sh[1] = p; //자식클래스의 객체 -> 자동으로 부모형으로 변환 -> 저장 
		sh[1] = new Point();
		sh[2] = l; // 부모형 < 자식형(부모의 멤버,메서드를 모두 가지고 있다.)
		sh[3] = sq; //직원(부모) = 팀장(자식)(직원의 기능(부모)+팀장의 기능(자식))
		
		for (int i = 0; i < sh.length; i++) {
			sh[i].draw();//메서드명은 같지만 객체가 다르기에 다른 기능이 구현 
			whoAreYou(sh[i]);
			System.out.println("=========");
		}
	}
	//혈연관계
	//형식) 객체명 Instanceof부모클래스명 -> true(자식 ok), false(자식x)
	static void whoAreYou(Shape sh) {

		//shape
		if(sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
		
		//point
		if(sh instanceof Point) {
			System.out.println("I am Point");
		}else {
			
			System.out.println("I am not Point");
		}
		
		//Line
		if(sh instanceof Line)
			System.out.println("I am Line");
		else
			System.out.println("I am  not Line");
		
		
		//Square
		if(sh instanceof Square)
			System.out.println("I am Square");
		else
			System.out.println("I am not Square");
	}
}
	
	//상속관계(Shape-> Point->Line->Square)
	class Shape{
		//모든 도형에 공통으로 사용하는 메서드
		void draw() {
			System.out.println("Shape");
		}
		//shape 에서만 사용하는 메서드
		void shapeDraw() {
			System.out.println("Shape");
		}
		
	}

	//point(점) -> is a 관계성립(draw,shapeDraw+pointDraw)
	class Point extends Shape{
		void pointDraw() {
			System.out.println("Point");
		}
		void draw() {
			System.out.println("Point");
		}
	}
	//Line => Point(3개) + 1개
	class Line extends Point{
		void lineDraw() {
			System.out.println("Line");
		}
		void draw() {
			System.out.println("Line");
		}
	}
	
	//Square => Line(4개) + 1개 => 5
	//다형성 -> 같은 메서드를 호출 => 처리결과가 다르다.(문화차이) 
	class Square extends Line{
		void squareDraw() {
			System.out.println("Square");
		}
		void draw() {
			System.out.println("Square");
		}
	}
	
	
	

