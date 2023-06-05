package j0516;

//외부의 패키지에 불러올떄 import 최상위패키지명.하위패키지명..불러올 클래스명
import java.util.Scanner;

//성적 처리 프로그램 = > 국,영,수 -> 합계 -> 평균 -> 등급 -> 모든정보 출력 
public class MethodEx {
	/* 여구 분석에 따라서 필요로 하는 메서드를 생각
	 * 
	 * 메서드를 작성하는 매개변수를 주고 또는 안주는 경우(구분)
	 * 1.멤버변수로 선언 -> 매개변수가 없는 메서드를 작성  o 
	 * 2.멤버변수로 선언X => 지역변수로 선언 
	 * 									매개변수가 있는 메서드를 작성 O 
	 * 3. 반환값 O -> caller 가 처리
	 * 		반환값 X -> 호출한 메서드가 처리  
	 */
	
	int kor,eng,mat,tot;
	double ave;
	char grade;
	
	//1.총점 (=합계)
	int calcSum() {
		this.tot = kor+eng+mat;
		return tot;
	}
	
	//2.평균 => 총점/과목수
	static double calcAve(int tot) {
		int ave = tot/3;
		return ave;
	}
	//메서드 오버로딩->비슷한 기능을 가진 메서드명은 하나의 메서드로 통합
	double calAve2() {
		return 0;
	}
	
	//3.등급(=학점) => 평균 -> A ~ F 
	static char calcGrade(double ave) {
		if(ave <= 100 && ave >= 90) 
		return 'A';
		else if(ave <90 && ave >= 80)
			return 'B';
		else if(ave <80 && ave >= 70)
			return 'C';
		else if(ave <70 && ave >= 60)
			return 'D';
		else return 'F';
		
	}
	//4.총점 ,평균, 등급 모두 출력 => 단순,반복 => 매개변수 X 반환값 X  	
	void display(int tot,double ave,char grade) {
		System.out.println("합계(tot) => " + tot);
		System.out.println("평균(ave) => " + ave);
		System.out.println("등급(grade) => " + grade);
	}
	
	public static void main(String[] args) {
		MethodEx me = new MethodEx();
		//지역변수 -> 메서드 내부에서만 사용이 가능 -> 다른 메서드에서 불러다 X 
		//사용자로부터 값을 입력받아서 처리-> Scanner 를 이용
		//nextLine() 정수,next() 문자
		//ctrl+shif+o (자동 import 기능이있다.)
		Scanner sc = new Scanner(System.in);//키보드 
		
		System.out.println("1. 국어점수를 입력해주세요:");
		me.kor = sc.nextInt();
		System.out.println("2. 영어점수를 입력해주세요:"); 
		me.eng = sc.nextInt();
		System.out.println("3. 수학점수를 입력해주세요:");
		me.mat = sc.nextInt();
		//1.총점 계산  => 정적메서드 => 클래스명.정적메서드(~)
		int tot = me.calcSum();
		//2.평균 => 정적메서드 => 클래스명을 생략 O 
		//자기 클래스가 가진 정적 메서드를 호출하는 경우에만 적용(다른외부X) 
		double avg = me.calcAve(tot);
		char grade = me.calcGrade(avg);
		me.display(tot, avg, grade);
		
	}
	
}
