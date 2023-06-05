package j0523;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String>();
		
		list.add("포도");//0->"오렌지"
		list.add("딸기");//1
		//키위 - > 2
		list.add("복숭아");//2
		//add(삽입할 위치,저장할 객체명)
		list.add(2,"키위");
		//수정 => set(수정할 위치, 수정할 값)
		list.set(0, "오렌지");
		
		list.remove("키위");//list.remove(2)
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
