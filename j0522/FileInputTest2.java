package j0522;

//외부의 파일(txt,image,동영상,실행파일(~exe)=>FileInputStream
//<->FileReader(한글문서)
import java.io.*;

public class FileInputTest2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//자바파일->\ (x) =>\\ or /로 변경
        FileInputStream fis=
        		new FileInputStream("c:/webtest/epp420_64bit.exe");
        int read=0;//파일의 내용을 저장할 변수
        //while(!eof)->end of file=>C언어
        /* (1)
          FileOutputStream fos=
        		new FileOutputStream("c:/webtest/testkim.exe");
            (2) 파일객체를 이용(생성자의 매개변수로 전달해서 작성)
          File f=new File("c:/webtest/testkim22.exe");//파일객체(파일정보)
          FileOutputStream fos=
        		  new FileOutputStream(f);
          */
        FileOutputStream fos=
      		  new FileOutputStream
      		     (new File("c:/webtest/testkim29.exe"));//익명객체
        
        while(true) {
        	read=fis.read();
        	if(read==-1) break;//파일의 끝에 도달하면 더이상 출력X
        	//System.out.write(read);
        	fos.write(read);
        }//while
	}

}
