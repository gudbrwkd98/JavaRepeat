package j0523;

import java.util.*; //SCanner , Vector,ArrayList,,,

public class VectorTest {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); // new Vector(1,1)//생성갯수,증가분
		v.add("테스트");//0
		v.addElement("임시테스트2");//1
		v.add("테스트2");//2
		v.add("100");//v.add(new Integer(100));
		System.out.println("v의 크기=>" + v.size());
		//값출력
		for(int i =  0 ; i <v.size(); i++) {
			String temp = (String)v.elementAt(i);
			System.out.println("temp =>" + temp);
		}
		//다양한 값 저장
		Vector v2 = new Vector();
		/*
		 * Character c  new Character('a')'
		 *	v2.add(c);
		 */
		v2.add('a');
		//3.141592 -> 1 
		v2.add(100); // 1->2
		//insertElementAt(1.저장할 ㄱㄱ체명,2.삽입할 인덱스번호)
		v2.insertElementAt(3.141592, 1);
		System.out.println("v2 의 크기 = > " + v2.size());
		//수정 -> setElementAt(수정할 데이터명,수정할 인덱스 번호)
		v2.setElementAt(v2, 2);
		v2.add(100);
		
		for (int i = 0; i < v2.size(); i++) {
			System.out.println("v2의 값" + v2.elementAt(i));
		}
	}
	
	
}
