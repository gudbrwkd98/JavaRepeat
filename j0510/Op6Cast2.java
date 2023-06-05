package j0510;

public class Op6Cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20 , num2 = 30; 
		/*
		 * printf(출력양식,,,출력할 대상자)
		 * 
		 * decimal			char 			String 				float
		 * %d(정수값)		%c(문자) 		%s(문자열)		%f(소수점 )
		 * 
		 * 
		 */
		System.out.printf("첫번째 숫자 = %d", num1); //첫번째 숫지 = 20
		System.out.println();//출력할값 X -> 그냥 줄바꿈만 일어난다.
		System.out.println('\n');
		System.out.printf("첫번째 숫자 = %d, 두번째 숫자 = %s",num1, num2); //첫번째 숫지 = 20
		//형변환 
		char ch = 'A'; //65 ->
		System.out.println();
		//오타 (물리적인 에러),논리적인 에러(계산 X)
		//byte,short ,int ,long (음수를 포함)
		//char (0~65535) ->int(4byte)으로 자동형변환 예외조항(printf)
		System.out.printf("a문자 %c 의 유니코드값 %d\n",ch,(int)ch);
		int ch2 = ch; //char -> int(65)
		System.out.println("ch2 =>" + ch2);
		//종합문제--> 총점
		//변수-> 1.계산할때 2.입출력 프로그램을 작성시 3. 현재프로그램의 상태저장
		int java =90, jsp=85,oracle =90;
		int sum = java+jsp+oracle;
		System.out.printf("sum = %d  입니다. \n", sum);
		//평균
		int avg = sum/3;
		double avg2 =((double)sum/3);
		//형식)%f -> %전체자리수.소수점자리수 => %.2f(소수쩜 둘째자리까지)
		//전체자리수는 써도되고 안써도 되는데 쓴경우에 출력 x 값은 공백으로 채움
		System.out.printf("avg=>" + avg + ", avg2 = %5.2f \n" , avg2);
		System.out.println("abc\t123\t456"); // \t탭키만큼 거리두어서 출력
		//\b backspace
		System.out.println("\"Hello Test\"");
		
		
		
	}

}
