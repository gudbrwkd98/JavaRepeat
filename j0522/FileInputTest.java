package j0522;

//외부의 파일(txt,image,동영상,실행파일(~exe)=>FileInputStream
//<->FileReader(한글문서)
import java.io.*;

public class FileInputTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//자바파일->\ (x) =>\\ or /로 변경
        FileInputStream fis=
        		new FileInputStream("c:/webtest/WriteHello.java");
        int read=0;//파일의 내용을 저장할 변수
        //while(!eof)->end of file=>C언어
        /*
        while(read!=-1) {//파일이 계속해서 읽어들일수 있는 상태라면
        	read=fis.read();//System.in.read()대신에 사용
        	System.out.write(read);//콘솔에 파일의 내용을 변환해서 출력
        }
        */
        while(true) {
        	read=fis.read();
        	if(read==-1) break;//파일의 끝에 도달하면 더이상 출력X
        	System.out.write(read);
        }//while
	}

}
