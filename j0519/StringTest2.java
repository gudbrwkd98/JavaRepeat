package j0519;
//문자열 객체를 만드는 방법 2가지
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)String 문자열객체명="저장할 문자열";
		String str1="abc";//기존에 없으면 새로운 공간 O ->데이터 저장 O
		//저장할 문자열 존재확인 O->새로운 공간X->서로 연결(주소값이 같다)
		String str2="abc";//내용,주소 동일(=같다)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//2)new String("저장할 문자열");
		String str3=new String("abc");//무조건 새로운 공간 O
		String str4=new String("abc");//주소는 다르지만 내용은 같다
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//String
		//객체==객체2(주소비교) 변수==변수2(내용 비교)
		if(str1==str2)
			System.out.println("str1과 str2는 주소가 서로 같다.");
		else
			System.out.println("str1과 str2는 주소가 서로 다르다.");
		//
		if(str3==str4)
			System.out.println("str3과 str4는 주소가 서로 같다.");
		else
			System.out.println("str3과 str4는 주소가 서로 다르다.");
		//내용이 같은지 equals(),대,소문자를 구분해서 사용 O
		//               contentEquals()도 가능(최신)
		
		//if(str1.equals(str2)) //내용을 비교
		if(str1.contentEquals(str2))
			System.out.println("str1과 str2는 내용이 서로 같다.");
		else
			System.out.println("str1과 str2는 내용이 서로 다르다.");
		
		
		
	}

}
