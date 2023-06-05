package j0522;
/*
 * 조건)String->각각 자료형(DataOutputStream)->객체를  파일로 저장
 *       =>usb or 메일로 전송(파일 첨부 기능)
 *      직렬화->메모리(객체)=>ObjectOutputSteam(객체포장)=>파일저장
 *                                ex) 냉장고에 저장(냉동)<->역직렬화(해동)
 *                                
 *   모든 클래스의 객체가 전부 파일로 저장X=>객체직렬화가 가능한 클래스로 
 *                                                 만들어줘야 된다.(일반 클래스 X)  
 *                                                 
 *    형식) class 클래스명  implements Serializable;//설계목적X
 *                             Marker Interface계열(기능 부여)                                                                  
 */
import java.io.*;

class Person implements Serializable{//객체직렬화가 되는 기능부여
	String name;
	transient int age;//직렬화 대상에서 배제->저장X
	transient String addr;//transient 저장시키지 않을 멤버변수
}
public class ObjectTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        Person p=new Person();
        p.name="홍길동";
        p.age=34;
        p.addr="경기도 광명시 ~";
        //1.파일로 저장
        FileOutputStream fos=
        	new FileOutputStream("c:/webtest/3.java/object.txt");
        
        //2.객체로 저장
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //3.저장시키는 형식) ->writeObject(저장할 객체명)=>직렬화
        //                      <->(원래 저장된 형)readObject() 역직렬화
        oos.writeObject(p);
        oos.close();
        fos.close();
        //4.역직렬화->만들어진 파일의 내용->다시 메모리상으로 로딩
        ObjectInputStream ois=new ObjectInputStream
        	(new FileInputStream("c:/webtest/3.java/object.txt"));
        
        //Object(객체형변환)->readObject=>Person으로 형변환
        Person p2=(Person)ois.readObject();//Object->Person
        System.out.println("p=>"+p);
        System.out.println("p2=>"+p2);
        //파일로 저장->다시 불러오기=>주소가 다를수밖에 없다.
        System.out.println("p==p2=>"+(p==p2));//true
        System.out.println
        ("이름=>"+p2.name+",나이=>"+p2.age+",주소=>"+p2.addr);
        
        
	}

}
