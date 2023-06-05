package j0523;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class EnumTest {
	
	public static void main(String[] args) {
		System.out.println("set(중복을 허용 X , 데이터의 저장순서x)");
		HashSet hs = new HashSet<>();
		hs.add("abc");
		hs.add("abc2");
		hs.add("abc3");
		System.out.println(hs);
		hs.remove("abc"); //remove (삭제할 데이터명);
		hs.clear();
		System.out.println(hs);
		System.out.println("hs 의 갯수 => " + hs.size());
		System.out.println("저장 유무확인 => "  + hs.isEmpty());
		System.out.println("=================");
		//검색때문에
		Vector<String> v = new Vector<>();
		v.add("test1"); v.add("test2"); v.add("test3");
		
		//Map <E> , <K,V> 표형태로 저장 = > 세션처리(회원로그인 할때 사용)
		Hashtable<Integer, String> h = new Hashtable<>(); //생략
		h.put(1, "홍길동");
		h.put(2, "테스트");
		h.put(3, "010-1234-5678");
		h.put(4, "23");
		h.put(5, "서울시 강남구!");
		//형식) get(키명)=> 키를 알고있으면 검색속도 제일 빠름
		String tel = h.get(3);
		System.out.println("tel => " + tel);
		//검색에 대한 인터페이스 ->Enumeration,Iterator
		//1.Enumeration  저장된 순서 그대로 가져오길 원할때 
		Enumeration<String> eu = v.elements();//메서드 반환형
		//데이터가 다르다 할지라도 공통된 검색방법을 쓰고 싶다.
		while(eu.hasMoreElements()) {//검색할 데이터가 존재한다면
			System.out.println(eu.nextElement()); //데이터를 꺼내와라
		}
		
		//2.Iterator => 도서관의 책꽂이에 들어가 있는 여러권의 책을 꺼내올떄
		//					출력할떄 저장된 순서대로 출력X 
		Collection<String> c = h.values();
		Iterator<String> ih = c.iterator();
		System.out.println("===================");
		while(ih.hasNext() == true) { //검색할 데이터가 있다면 
			System.out.println(ih.next()); //있으면 꺼내와라(=nextElement()))
		}
		
		
		
		
		
		
		
	}
	
}
