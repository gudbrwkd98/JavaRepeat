package j0517;
/*
 * CallByValue (값에 의한 전달방법) = > 매개변수에 전달(기본자료형 8가지)
 * 													전달해서 메서드를 호출하는 방법
 * 													(원본의 값을 복사해서 전달)
 * 													내용을 변경 O -> 원본의 내용은 변경X 
 * 
 */
public class CallByValue {
	
	//caller method
	public static void main(String[] args) {
		int r = -1 , g = -1 , b= -1; //css(rgb(0~255,0~255,0~255)=> 255*255*255)
		System.out.println("before : r = " + r+"before : g = " + g+"before : b = " + b);
		//중간에 메서드를 이용->전달->색깔이 변경
		change_color(r, g, b);
		System.out.println("after : r = " + r+"after : g = " + g+"after : b = " + b);
	}
				
	//색깔을 변경 work method
	static void change_color(int r, int g,int b) { //-1,-1,-1
		r+=10; //r=r+10=r=9\\0
		g+=50;//g=g+50=g=49
		b+=100;//b=b+100=b=99
		System.out.println("메서드 내부 r = " + r + ",g=" + g +",b="+b);
	}
	
}
