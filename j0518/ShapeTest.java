package j0518;

import java.util.Scanner;

//자식클래스명 		
public class ShapeTest extends Shape implements Drawable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력 하세요 : ");
		int r = sc.nextInt();
		ShapeTest sp = new ShapeTest();
		 sp.res = sp.area(r);
		 sp.printArea();
	}
		
	@Override
	public void draw() { 
		// TODO Auto-generated method stub 
		System.out.println("원을 그려서 원의 면적을 구한다."); 
	}

	@Override
	public double area(int r) {
		// TODO Auto-generated method stub
		return (r*r*Math.PI);
	}

}
