package j0522;

import java.util.Scanner;

//사용자로부터 값을 입력->대문자<->소문자
public class ConvertTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {//for(;;){
		  Scanner sc=new Scanner(System.in);
	      System.out.println("문자열을 입력?");//next()(단어),nextLine()
	      String input=sc.nextLine();//hello
	     //---------------------------------------
	      if(input.equals("e") || input.contentEquals("E")) {
	    	  System.out.println("프로그램이 정상적으로 종료됨!!");
	    	  System.exit(0);//정상종료 <->System.exit(-1);//비정상종료
	      }
	      //-------------------------------------
	      char ch;//문자열에서 뽑아낸 문자를 저장
	      for(int i=0;i<input.length();i++) {
	    	  ch=input.charAt(i);
	    	  //System.out.print("ch=>"+ch+"\t");
	    	 if(Character.isDigit(ch)) {//숫자라면
	    		 System.out.println("영문자만 입력이 가능");
	    		 System.out.println("프로그램 자동종료");
	    		 return;
	    	 }else {//숫자가 아닌경우
		    	  if(Character.isLowerCase(ch))//소문자라면
		    		  System.out.print(Character.toUpperCase(ch));
		    	  else
		    		  System.out.print(Character.toLowerCase(ch)); 
	    	 }//else
	      }//for  	
	      System.out.println();//줄바꿈
		} //while
	}//main
}



