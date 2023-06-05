package j0522;
/*
 * 키보드로 값을 입력->한글데이터 출력
 * 이름? 국어? 영어?=>이름:홍길동,총점:180
 */
import java.io.*;

public class FilterTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.in=>InputStream객체(멤버변수)
		//System.out=>PrintStream객체(표준출력객체)
		//키보드로 데이터를 읽어들일때 한글이 깨지지 않도록 많은양의
		//데이터를 읽어들여라
		/* (1)
        InputStreamReader isr=
        		new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);*/
		
		BufferedReader br=
				new BufferedReader
				     (new InputStreamReader(System.in));
		
        //Scanner sc=new Scanner(System.in);
        String name;
        int kor,eng,tot;
        
        System.out.println("이름은?");
        name=br.readLine();//name=sc.next();
        
        System.out.println("국어?");
        kor=Integer.parseInt(br.readLine());//kor=sc.nextInt()
        //                               "57"
        //kor=Double.parseDouble(br.readLine());"56.9"=>56.9
        System.out.println("영어?");
        eng=Integer.parseInt(br.readLine());//eng=sc.nextInt()
        
        tot=kor+eng;
        System.out.println("이름="+name+",총점=>"+tot);
        
	}
}
