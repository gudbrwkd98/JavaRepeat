package j0522;

import java.io.*;//1.입출력에 대한 클래스 불러오기
                        //2.예외처리를 필수(반드시 해야한다.)
                        //3.flush()를 호출->버퍼에 저장된 내용이 바로 출력 O
//입출력의 개념파악
public class WriteHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       byte hello[]= {72,101,108,108,111,32,87,111,114,108,100,33,10};
       byte a=72;//H ->입출력할때 데이터를 전송할때 필요로하는 자료형
                       // char(나)->byte->char(상대방)
       try {
    	   System.out.println((char)a);//->write(a)
	       System.out.println(hello);//배열이 저장된 위치출력
	       System.out.write(a);//H
	       System.out.flush();//버퍼에 저장된 데이터를 바로바로 전송하라
	       System.out.write(hello);
       }catch(IOException e) {
    	   System.out.println(e);//e.toString()
    	   System.out.println("출력시 에러유발");//에러메세지 직접
       }
	}

}
