package j0512;
/*
 * 추상화 -> 새롭게 저장할 대상자(자동차,학생,건물,,)를 저장할 목적
 * 				으로 만들어진 설계도
 */
public class Car {
	//1.객체(Car) -> 저장하고 싶은 대상자 
	//1. 멤버변수 => 클래스 내부에서 선언된 변수 -> 초기값이 설정(8가지 기본자료형)
	String name; //이름 (명사)
	int output; //배기량
	int year ; //년식 
	String color; //차의 색상 
	//현재상태
	int current_speed;//차의속도
	//int sidong = 0 ;1 시동걸린 유무
	boolean sidong = false ; //차의 시동유무 

	//2.공통기능(=움직임 )=> 메서드 구현(=함수) => 요구분석
	// 1)시동걸기 
	void startEnginee() {
		sidong =true;
		System.out.println("시동이 걸림!!!");
	}
	//2)차의 주차기능
	void stop() {
		sidong=false;
		System.out.println("정상적으로 추차완료");
	}
	//3)속도증가
	void speedUp(int speed) {
		current_speed+=speed;
		System.out.println(speed+"km 만큼 속도가 증가됨!!");
	}
	//4)속도 감소 
	void speedDown(int speed) {//function speedUp(speed)
		current_speed-=speed;
		System.out.println(speed+"km 만큼 속도가 감소됨!!");
	}

	//5) 차의 정보를 출력
	void carInfoPrint() {
		System.out.println("==차의 정보 출력==");
		System.out.println("차의 시동유무 =>" + sidong);
		System.out.println("차의 이름 =>" + name);
		System.out.println("차의 배기량 =>" + output);
		System.out.println("차의 년식 =>" + year);
		System.out.println("차의 색깔 =>" + color);
		System.out.println("차의 현재속도 =>" + current_speed);
		
	}
}
