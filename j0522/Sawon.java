package j0522;
/*
 * 키보드로 값을 입력->한글데이터 출력
 * 이름? 국어? 영어?=>이름:홍길동,총점:180
 */
import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//이름,사번,암호,성별,나이,전번
		String mem_name,mem_id,mem_pwd;
		String mem_gender,mem_age,mem_phone;
		
		BufferedReader br=
				new BufferedReader
				     (new InputStreamReader(System.in));
		
        //추가(한글데이터 저장)
		File f=new File("c:/webtest/3.java/sawon.txt");
		FileWriter fw=new FileWriter(f,true);//추가모드
		//----------------------------------------------------
        
		System.out.println("===회원정보 입력하기===");
		//name
        System.out.println("이름은?");
        mem_name=br.readLine();
        //id
        System.out.println("ID?");
        mem_id=br.readLine();
        //pwd
        System.out.println("암호?");
        mem_pwd=br.readLine();
        //성별
        System.out.println("성별?");
        mem_gender=br.readLine();
        //나이
        System.out.println("나이?");
        mem_age=br.readLine();
        //전번
        System.out.println("전번?");
        mem_phone=br.readLine();
        //파일에 저장
        fw.write(mem_name);fw.write("\r\n");//1310 줄바꿈
        fw.write(mem_id);fw.write("\r\n");
        fw.write(mem_pwd);fw.write("\r\n");
        fw.write(mem_gender);fw.write("\r\n");
        fw.write(mem_age);fw.write("\r\n");
        fw.write(mem_phone);fw.write("\r\n");
        fw.write("\r\n");
        //메모리에 저장된 부분을 최종적으로 파일에 저장하고 종료
        fw.close();//메모리 해제
        br.close();
        
	}
}
