package j0518;

import java.util.Date; //오늘 날짜 java.sql.date (테이블의 날짜 필드 설정)

//오늘 날짜 출력 => Date,Calendar(정적메서드) 
public class SimpleTest2 {
	public static void main(String[] args) {
		Date d = new Date();
		//System.out.println("d =>" + d); //d.toString() 자동으로 호출 
		SimpleTest2 st = new SimpleTest2();
		st.setDate(d);
	}
	//1.객체를 생성=> 반환형을 통해서 객체를 얻어오는 경우 getXXX()
	//형식)접근지정자 반환형(=객체형) getXXX(){return 생성한 객체명;}
	public Date getDate() {
		/*Date d = new Date();*/
		return new Date(); //익명객체 
	}
	
	//2.만들어진 객체를 전달해서 대신 처리해주는 메서드 
	//public void setXXX (전달받을 클래스명 객체명(임의)){처리구문} 
	public void setDate(Date d) {
		System.out.println("d=> " + d);
	}
	
}
