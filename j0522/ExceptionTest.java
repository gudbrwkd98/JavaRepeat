package j0522;
/*
 * 예외처리구문=>제대로 작동이 되는지 어떻게 확인할 수있을까?
 * 가상으로 예외를 발생-=>구문이 제대로 작동이 되는지 확인가능
 * 형식) throw new 예외처리할 클래스명(메세지내용)
 */
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
           a();//(1)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("가상으로 배열첨자오류발생연습2");//(5)
		}
		System.out.println("예외처리 최종종료!!");//(6)
	}
   static void a() {//NullPointerException->객체생성X 메서드 호출O
	   try {
		   //String s="abc";
		   //String s=null;//객체->데이터가 저장된 위치가 저장된 변수
		   //System.out.println("문자열의 길이=>"+s.length());//3
		   throw new NullPointerException("널포인터 에러연습");//(2)
	   }catch(NullPointerException e) {
		   System.out.println("객체생성없이 메서드 호출불가=>"+e);//(3)
	   }
	   //(4)
	   throw new ArrayIndexOutOfBoundsException("배열첨자오류");
   }
}




