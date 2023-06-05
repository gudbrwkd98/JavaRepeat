package j0517;
/*
 * CallByReference (주소에 의한 전달방법) = > 매개변수에 전달(객체(=주소))
 * 													전달해서 메서드를 호출하는 방법
 * 													(원본의 값을 복사해서 전달)
 * 													내용을 변경 O -> 원본의 내용은 변경O
 * 													객체를 전달-> 객체의 주소값을 전달 
 * 													주소(저장할 위치 ) =포인터 (pointer)
 * 
 */
class RGBColor{
	int r,g,b;
	public RGBColor(int r,int g,int b) {
		this.r = r ;
		this.g = g ;
		this.b = b;
	}
}

public class CallByRef {
	
	//caller method
	public static void main(String[] args) {
		//int r = -1 , g = -1 , b= -1; //css(rgb(0~255,0~255,0~255)=> 255*255*255)
		RGBColor colr = new RGBColor(-1, -1, -1);
		System.out.println("color = > "  + colr);
		System.out.println("before : r = " + colr.r+"before : g = " + colr.g+"before : b = " + colr.b);
		//중간에 메서드를 이용->전달->색깔이 변경
		change_color(colr); //객체 (주소)를 전달 
		System.out.println("after : r = " + colr.r+"after : g = " + colr.g+"after : b = " + colr.b);
	}
				
	//색깔을 변경 work method method(RGBColor(자료형) color2(객체명) 
	static void change_color(RGBColor colr) { //-1,-1,-1
		System.out.println("color = > "  + colr);
		colr.r+=10; //r=r+10=r=9\\0
		colr.g+=50;//g=g+50=g=49
		colr.b+=100;//b=b+100=b=99
		System.out.println("메서드 내부 r = " + colr.r + ",g=" + colr.g +",b="+colr.b);
	}
	
}
