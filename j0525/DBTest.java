package j0525;

import java.sql.*; //DB 에 관련된 클래스,인터페이스

				

public class DBTest {
	
	public static void main(String[] args) {
	
		//1.DB에 접속을 성공한 상태 -> con 객체를 얻어왓다고 표현
		Connection con = null;									//xe
		//2.접속하고자 하는 컴퓨터위치									:1521: orcl
		//형식) jdbc:oracle:thin:@원격ip주소(=localhost):포트번호 : sid
		Statement stmt = null;//create table
		PreparedStatement pstmt = null; //insert into
		Statement stmt2 = null; //select
		ResultSet rs = null;//select 의 결과를 표형태로 담을 객체 필요 					
		String sql = "";
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		try {	
			//1.접속할 드라이버를 메모리에 올리기	
			Class.forName("oracle.jdbc.driver.OracleDriver");														
			//2.getConnection(1.접속위치 2.계정명 3.암호)
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("con=>"  + con);
			
			//3.테이블생성
			stmt = con.createStatement();
			sql = "create table MyTest(name varchar2(20),age number)";
			
			int create = stmt.executeUpdate(sql); // 0 이 성공 예외 
			System.out.println("테이블 성공유무(create) => " + create);

			
			//4.insert into
			pstmt = con.prepareStatement("insert into mytest values(?,?)");
			//형식)pstmt 객체명.setString(or setInt,setDouble(순서 ,저장할값) 		
			pstmt.setString(1, "홍길동");
			pstmt.setInt(2, 20);
			
			int insert = pstmt.executeUpdate(); // 1성공 0 실패 
			
			System.out.println("sql 문장 결과 값 : " + insert);
			
			//5.ㄴselect 
			stmt2= con.createStatement();
			rs = stmt2.executeQuery("select * from mytest");
			
			//검색된 갯수를 정확하게 알기가 쉽지않기때문에 
			while(rs.next()) { //while(rs.next() == true) 보여줄 레코드가 있다면 
				String name = rs.getString("name");
				int age = rs.getInt("age");//rs.getInt("age") 추천
				System.out.println("이름은 => "  + name + ", 나이는 => " + age);
				
			}																			
			//6.메모리 해제 -> 에러유발과 상관없이 반드시 처리하고 프로그램을 종료
			//생성된 객체의 역순으로 메모리를 해제
			//com-> stmt->pstmt->stmt2->rs
			rs.close();stmt2.close();
			stmt.close();con.close();																			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB연결실패 =>"  + e);
		}finally {
			//try{rs.close();} catch(SQLExceptione){}																		
		}																							
	}
	
}
