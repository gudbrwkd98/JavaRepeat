package j0516;

//추상화->직사각형의 면적(객체)를 공통속성,공통기능=>새로운 자료형
//캡슐화->다형성(생성자 오버로딩)=>다양한 방법으로 데이터를 저장
class Rect{
	//1.공통멤버변수
	private int x,y=10;//가로,세로
	private int area;//면적->double area;//삼각형 또는 원
	
	//////(),(x),(y),(x,y)///////////////////////////
	Rect(){
		//생성자내부에서는 자기클래스의 객체명을 사용X->this로 써준다.
		this(20,50);
		System.out.println("기본생성자(멤버변수의 초기화)");
	}
	
	Rect(int x){
		if(x<0) {
			System.out.println("x값은 음수입력불가");
			x=20;//값을 입력을 못받기때문에 초기값설정
			return;//탈출문
		}
		this.x=x;//this.멤버변수=매개변수,현재 생성된 객체를 의미
		System.out.println
		("난 매개변수 1개짜리 생성자호출됨(this.x)"+this.x);
	}
	//---
	Rect(double y){//int->double(자동형변환)
		this.y=(int)y;//int<-double(명시적인 형변환)
	}
	
	Rect(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("난 매개변수 2개짜리 생성자호출됨");
	}
	////////////////////////////////
	public void setX(int x) {
		if(x<0) {
			System.out.println("x값은 음수입력불가");
			this.x=20;//값을 입력을 못받기때문에 초기값설정
			return;
		}
		this.x=x;//멤버변수=매개변수
	}
   public void setY(int y) { //매개변수 O 반환값 X
		if (y<0) {
			System.out.println("y값은 음수입력불가");
		} else {
			this.y=y;//y=30
		}
   }
   //public 반환형 getXX() {return 꺼낼올 멤버변수명;}
   public int getX() { return this.x;}
   public int getY() { return this.y;}
   
   //2.공통기능(메서드) 면적을 구하는 메서드
   //1)매개변수X 반환형X =>단순,반복=>똑같은 문장을 반복
   void print() {
	   System.out.println("x의 값=>"+this.x+",이고 y값=> "+this.y);
	   System.out.println("x*y=>"+(this.x*this.y)+"입니다.");
   }
   //2)매개변수 O, 반환형 X=>입력=>출력,계산,저장
   void area(int a,int b) {
	   x=a;
	   y=b;
	   System.out.println("x*y=>"+(x*y)+"입니다.");
   }
   //3.매개변수 O, 반환형 O=>계산목적,웹프로그래밍방식
   //반환값->호출되는 메서드가 계산한 결과값->메서드 자체에서 처리X
   //          호출하는 caller에서 처리하는 계산값=>보고 O 반환값 O
   int area2(int a,int b) {
	   int result=a*b;//60*40
	   return result;//return 계산결과값(변수) or 수식 or 객체
   }
}
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rect r=new Rect();//객체생성=>공간을 생성해달라
        System.out.println("r=>"+r);
        //r.x=-10; 2.객체명.멤버변수=값(X)
        //r.setX(-20);//x=20
        //r.setY(30);//y=30
        //3.객체명.호출할 메서드명() or (~)
        r.print();
        //4.매개변수를 전달->계산->출력
       Rect r2 = new Rect(30);
       r2.setY(40);
       r2.print();
       
       Rect r3 = new Rect(50,60);
       r3.print();
        //5.반환값이 있는 메서드호출
        //형식)반환받는 변수명=객체명.호출할메서드명(~)
        int reply=r.area2(60, 40);
        System.out.println("계산받은 결과값(reply)=>"+reply);
        System.out.println("=================");
        System.out.println("r.area2(30,40)=>"+r.area2(30,40));
	}

}



