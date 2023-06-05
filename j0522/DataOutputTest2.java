package j0522;
/*
 * 메모리에 각각의 자료형에 맞는 데이터를 변수에 저장
 * 자료형에 맞게 파일에 저장시키고 싶다.=>DataOutputStream
 */
import java.io.*;

public class DataOutputTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //1.파일로 저장
		FileOutputStream fos=
				new FileOutputStream("c:/webtest/3.java/data.txt");
		
		//2.자바에 자료형에 맞게 포장해서->DataOutputStream(출력용)
		DataOutputStream dos=
				new DataOutputStream(fos);
		
		//3.메모리->자료형에 맞게 파일에 저장
		char han='한';//0~65535
		System.out.println((int)han);//54620 유니코드
		
		byte b=21;//"21"
		String str="bg\n";
		byte ba[]= {65,66,67};//A,B,C
		//파일로 저장=>형식) write자료형(저장할값)<->read자료형()
		dos.writeChar(han);
		dos.writeByte(b);
		dos.writeBytes(str);//writeString(X)
		dos.write(ba);//배열의 값을 매개변수로 저장->A,B,C
		
		dos.close();
		fos.close();
		//추가
		//만들어진 파일의 내용을 다시 읽어들여서 확인후 출력
		DataInputStream dis=
			new DataInputStream
			 (new FileInputStream("c:/webtest/3.java/data.txt"));
		//변수=dis.read자료형()<->dos.write자료형(저장할값)
		char c=dis.readChar();//한
		byte b1=dis.readByte();//21
		String s=dis.readLine();//readString(X) 앞으로 쓰지마세요(경고)
		byte bb[]=new byte[3];//65,66,67
		//byte bb[]={65,66,67}=>String(A,B,C)로 출력
		dis.read(bb);//파일에 저장된 byte값을 배열로 bb에 저장하라
		dis.close();
		
		System.out.println("c=>"+c);//한
		System.out.println("b1=>"+b1);//21
		System.out.println("s=>"+s);//bg
		System.out.println("bb=>"+bb);//주소값 출력(배열의 저장위치)
		for(byte b2:bb)
			System.out.print((char)b2+"\t");
		//메서드로 제공
		System.out.println("==========");
		//매개변수 byte[] ->반환값 String
		//byte[]===>String 변환
		//String===>byte[]로 변환=>getBytes()
		String str2=new String(bb);
		System.out.println("str2=>"+str2);//A,B,C
		byte t[]=str2.getBytes();//t[]={65,66,67}
		for(byte b3:t)
			System.out.print((char)b3);
	}

}
