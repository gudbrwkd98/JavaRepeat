package j0512.sub;

/*
 * 추상화 -> 새롭게 저장할 대상자(자동차,학생,건물,,)를 저장할 목적
 * 				으로 만들어진 설계도
 */
public class Car {
	// 1.객체(Car) -> 저장하고 싶은 대상자
	// 1. 멤버변수 => 클래스 내부에서 선언된 변수 -> 초기값이 설정(8가지 기본자료형)
	private String name; // 이름 (명사)
	private int output; // 배기량
	private int year; // 년식
	private String color; // 차의 색상
	// 현재상태
	private int current_speed;// 차의속도
	// int sidong = 0 ;1 시동걸린 유무
	private boolean sidong = false; // 차의 시동유무

	// 2.setXXX(매개변수){}
	public void setName(String n) {
		if (n != null)
			name = n;
		else
			System.out.println("name 값은 반드시 입력해야합니다.");
	}

	public void setOutPut(int ou) {
		// if조건으로 올바른 값을 체크
		if (ou < 0 || ou > 5000) {
			System.out.println("입력받은 값은 음수를 입력하거나 5000이상 저장불가");
			output = 1000;
			return; // 탈출문 return 변수 or 수식 or 객체(반환값이 있는경우)
		}
		output = ou;

	}

	// 음수입력 x 양수(2023 이상 크면 저장 x ) 메서드 작성
	public void setYear(int y) {
		if (y < 0 || y > 2023) {
			System.out.println("년도는 음수이거나 2023 올해보다 클수없음");
		} else {
			year = y;
		}
	}

	public void setColor(String c) {
		color = c;
	}

	public void setCurrent_speed(int cu) {
		current_speed = cu;
	}

	public void setSidong(boolean si) {
		sidong = si;
	}

	// getter Method(저장된 데이터를 불러와서 화면에 출력)
	// 형식) public 반환형(자료형) getXXX(){return 멤버변수;}

	public String getName() {
		return name;
	}

	public int getOutput() {
		return output;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getCurrent_speed() {
		return current_speed;
	}

	public boolean getSidong() {
		return sidong;
	}

	void startEnginee() {
		sidong = true;
		System.out.println("시동이 걸림!!!");
	}

	// 2)차의 주차기능
	void stop() {
		sidong = false;
		System.out.println("정상적으로 추차완료");
	}

	// 3)속도증가
	void speedUp(int speed) {
		if (sidong) {
			if ((speed < 0) || (current_speed + speed >= 170)) {
				System.out.println("속도는 음수이거나 170km 은 속도불가임");
				current_speed = 120;// 기본값
			} else {
				current_speed += speed;
				System.out.println(speed + "km 만큼 속도가 증가됨!!");
			}
		} else {
			System.out.println("먼저 시동을 걸어야 속도를 증가시킬수있습니다.");
		}
	}

	// 4)속도 감소
	void speedDown(int speed) {// function speedUp(speed)

		if (sidong) {
			if ((speed < 0) || (current_speed + speed >= 170)) {
				System.out.println("속도는 음수이거나 170km 은 속도불가임");
				current_speed = 0;// 기본값
			} else {
				current_speed -= speed;
				System.out.println(speed + "km 만큼 속도가 감소됨!!");
			}
		} else {
			System.out.println("먼저 시동을 걸어야 속도를 감소시킬수있습니다.");
		}
	}

	// 5) 차의 정보를 출력
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
