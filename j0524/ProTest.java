package j0524;

import java.io.*; //파일의 내용을 메모리에 로딩
import java.util.Properties;

/*
 * Properties = > HashTable 계열(키,값) => 파일로 저장된 내용을
 * 															메모리에 불러다 사용(환경설정파일)
 * 															접속ip, 접속계정명,암호(보안때문에)
 * 															load()
 */

public class ProTest {
	
	public static void main(String[] args) {
		//1.파일을 읽어드리기 
		Properties pro = new Properties();
		//2.FileInputStream 
		try {
			FileInputStream fis = new FileInputStream("c:/webtest/3.java/sou/JavaStudy/src/j0524/ex1.properties");
			pro.load(fis);//파일내용을 받아서 properties 클래스로 받아와 메모리에 로딩 
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일 불러오기 오류 => " + e);
		}
		
		//3.저장된 속성값을 불러오기<->getProperty("키명");
		//								<->setProperty("키명",저장할값);
		String value = pro.getProperty("a");
		
		System.out.println(value);
		pro.setProperty("b", "imsitest");
		String value2 = pro.getProperty("b");
		System.out.println(value2);
		//파일에도 변경 => store(동기화(파일의 내용 == 메모리내용))
		try { 	//1.경로포함해서 출력할 파일명(FileOutputStream)
					//2.주석유무->null (주석작성)
			pro.store(new FileOutputStream("c:/webtest/3.java/sou/JavaStudy/src/j0524/ex1.properties"), "imsitest");
	 	} catch (IOException e) {
			// TODO: handle exception
	 		e.printStackTrace();
		}
		
		
		
	}
	
}
