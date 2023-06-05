package j0509;

//실수를 저장하는 자료형 2가지 -> float,double(단답형)
public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실수 값을 저장");
		//byte f ; int f ; 자료형과 상관없이 똑같은 변수명은 사용금지
		float f = 5.3f ; //실수는 무조건 double 형으로 인식하기때문에 에러 발생
							//float 형에 맞게 저장하라(실수뒤에 f)를 표시 
		double f2 = 5.3;
		System.out.println("f => " + f + ",   f2 + > " + f2);
		System.out.println("float,double 의 차이점");
		float m_float = 1.23456789123f;
		double m_double= 123456.789123;
		System.out.println("m_float => " +m_float + //코딩중간에 줄바꿈 가능 
				", m_double =>" + m_double);
	}

}
