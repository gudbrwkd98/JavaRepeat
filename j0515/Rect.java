package j0515;

public class Rect {
	
	private int x;
	private int y;
	
	
	
	public int getX() {

		return x;
	}
	public void setX(int x) {
		if(x<=0) {
			System.out.println("x 값은 0보다 큰 양수만 가능합니다");
			x = 0 ;
		}else {
			this.x = x;
		}
		
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y<=0) {
			System.out.println("y 값은  0보다 큰  양수만 가능합니다");
			x = 0;
		}else {
			this.y = y;
		}
		
	}
	
	public void calcuRect(int x,int y) {
		if(x<=0 || y<=0) {
			System.out.println("x또는y 가 양수 거나 0보다 커야합니다.");
		}else {
		 System.out.println("사각형의 넓이는 : "  + x*y);
		}
	}
	
}
