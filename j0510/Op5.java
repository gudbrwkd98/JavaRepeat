package j0510;

public class Op5 {
	public static void main(String[] args) {
		System.out.println("자동형변환"); //묵시적인 형변환
		//1.적은 데이터값 -> 큰 데이터 공간 -> 자료형의 크기에 맞춰서 형변환 O 
		//저장되는것은 문제가 없지만 메모리 낭비가 발생이 된다.
		//byte s = 12 ; //->2진수 8 4 2 1 부호비트 
		//							0000 1100
		short s = 12 ;	// 00000000 00001100
		int n = s ; //00000000 00000000 00000000 00001100
		//2.계산 중간에 자료형이 변환 -> 작은데이터가 큰데이터로 변환
		char c = 'A';
		int n2 = c+1; //char (2byte) + int (4byte) -> 소 + 대 -> 대+대 (int + int) = int
		System.out.println("n2 => " + n2); // 65+ 1 = 66(int)->char
		System.out.println("(char)n2 => " + (char)n2);//B
		//명시적인 형변환(=강제형변환) -> 단점 (데이터 손실 O)
		int su = (int)3.5; //0.5 저장 x 손실 o 
		
		int x = 123 ;
		double y = x+12.3f;
		System.out.println("y  => " + y );
		System.out.println("강제형 변환 주의할점");
		byte s2 = 12 ;
		short s3 =45;
		int re = s2+ s3; //byte + short => short + short = > short(X)
		System.out.println("re=>" + re);
		short re2= (short)(s2 + s3);
		//주의할점) 수식값을 형변환할때에는 수식전체를()로 묶어줘야한다
		System.out.println("re2 => " + re2);
	}
}
