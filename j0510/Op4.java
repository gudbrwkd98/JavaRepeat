package j0510;

public class Op4 {
	public static void main(String[] args) {
		System.out.println("대입,상함연산자");
		//삼항연산자 -> 조건식에 따라서 변수에 저장된 값을 선택해서 저장시키는 연산자
		int a =  5 ; int b = 7 , x= 10,y=10;
		//형식) 자료형 변수명 =(조건식) ? 참인값: 거짓인값;
		int absX = (x>=0)? x : -x;
		System.out.println("x = 10 일떄 x 의 절대값 => "+ absX);
		
		int absY = (y>=0)? y : -y;
		System.out.println("y = -10 일떄 y 의 절대값 =>" + absX);
		/*
		 * 대입연산자
		 * int c = a + b , a = a+ 1 , a = a-1 , a= a*1, a= a/1
		 * 
		 * 자기 변수에 값을 계산을 한후 자기변수에 대입(저장)
		 * 산술,대입(연산자 2개) => 배정연산자(연산자1개) => 실행속도 향상 
		 * 
		 * a = a + 1 => a + = 1 => a++
		 * a= a+2 => a+=2 => a++2(X)
		 * 
		 * a= a-1 => a-=1 =>a--
		 * a= a-2 => a-=2
		 * 
		 * a = a*2 => a*=2
		 * 
		 * a = a/2 => a/=2
		 * 
		 */
		//int a = 5 ; int b = 7
		a+=b; //a=a+b ; 12 
		System.out.println("a+=b => "  + a );
		
		//-
		a-=b; //a= a-b ; a = 12 - 7 
		System.out.println("a-=b > "  + a );
		
		//*
		a*=b; //a= a*b ; a = 5*7 
		System.out.println("a*=b > "  + a );
		
		// /
		a/=b; //a= a/b ; a = 35/7 
		System.out.println("a/=b > "  + a );
		
		
		
		
		
		
	}
}
