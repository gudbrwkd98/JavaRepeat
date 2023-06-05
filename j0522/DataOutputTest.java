package j0522;
/*
 * 메모리에 각각의 자료형에 맞는 데이터를 변수에 저장
 * 자료형에 맞게 파일에 저장시키고 싶다.=>DataOutputStream
 */
import java.io.*;

public class DataOutputTest {

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
	}

}
