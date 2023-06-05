package j0522;

import java.util.Scanner;//ctrl+shift+o

//세개의 값을 입력받아서 최대값을 구하시오<->최소값

public class ThreeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //Scanner sc=new Scanner(System.in);//getScan()
		/*
		 * ThreeTest2 tt2=new ThreeTest2();
		 * Scanner sc=tt2.getScan();
		 */
		Scanner sc=getScan();
	   //setScan(sc)
		ThreeTest2.setScan(sc);
		/*
	   System.out.println("1.첫번째수를 입력?");
       int a=sc.nextInt();//정수,nextDouble() 소수점,next()문자열(단어)
       
       System.out.println("2.두번째수를 입력?");
       int b=sc.nextInt();
       
       System.out.println("3.두번째수를 입력?");
       int c=sc.nextInt();
       
       int max;//최대값
       
       ThreeTest2 tt=new ThreeTest2();
       tt.getMaxPrint(a, b, c);
       tt.getMaxPrint(23, 78, 83);
       tt.getMaxPrint(11, 34, 66);
       System.out.println("=========");
       System.out.println
       ("tt.getMaxPrint2(34,12,99)=>"+tt.getMaxPrint2(34,12,99));
	   */
	}
	//1.객체의 자료형(Scanner) getXXX(){ return 반환시킬객체명(=익명);}
	//public Date getDate(){}
	public static Scanner getScan() {
		/*
		Scanner sc=new Scanner(System.in);
		return sc;*/
		return new Scanner(System.in);
	}
	//2.public void setXXXX(전달받을 객체자료형 객체명(=임시){처리구문}
	public static void setScan(Scanner sc) {
		 System.out.println("1.첫번째수를 입력?");
	       int a=sc.nextInt();//정수,nextDouble() 소수점,next()문자열(단어)
	       
	       System.out.println("2.두번째수를 입력?");
	       int b=sc.nextInt();
	       
	       System.out.println("3.두번째수를 입력?");
	       int c=sc.nextInt();
	       
	       int max;//최대값
	       
	       ThreeTest2 tt=new ThreeTest2();
	       tt.getMaxPrint(a, b, c);
	       tt.getMaxPrint(23, 78, 83);
	       tt.getMaxPrint(11, 34, 66);
	       System.out.println("=========");
	       System.out.println
	       ("tt.getMaxPrint2(34,12,99)=>"+tt.getMaxPrint2(34,12,99));
	}
	void getMaxPrint(int a,int b,int c) {
		int max=(a>b)?a:b;//max=12
	       //      (12>19)
	    max=(max>c)?max:c;
	    System.out.println("max=>"+"최대값은 "+max+"입니다.");
	}
	//반환값이 있는 메서드를 작성
	int getMaxPrint2(int a,int b,int c) {
		int max=(a>b)?a:b;//max=12
	       //      (12>19)
	    max=(max>c)?max:c;
	    //System.out.println("max=>"+"최대값은 "+max+"입니다.");
	    return max;
	}
}





