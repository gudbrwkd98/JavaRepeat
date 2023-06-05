package j0510;

public class VarTest5 {
/*
 * 변수의 종류 => 지역변수 (정해진 범위내에서만 사용이 가능한 변수)(메서드 내부)
 * 					 멤버변수(클래스 내부에 선언된 변수)=> 클래스 편
 */
	int su3 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수의 사용범위(scope)");
		//지역변수 1.특정범위내에서만 사용 2 . 반드시 초기값을 넣어줘야 된다.
		//초기화 => 변수 만들고 맨처음 저장된값
		int su1 = 10; //메서드 내부에 선언 (지역변수)
		System.out.println("su=>" + su1);
		{//블럭처리(어디부터 어디까지 사용한다(범위지정))
				int su2 = 20;
				System.out.println("su2=>" + su2);
		}
		
		System.out.println("su1=>" + su1);
		
		
	}

}
