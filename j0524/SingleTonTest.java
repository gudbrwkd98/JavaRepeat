package j0524;

public class SingleTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Singleton ob1=new Singleton(); 외부 생성X
		Singleton ob1=Singleton.getInstance();
		Singleton ob2=Singleton.getInstance();
		Singleton ob3=Singleton.getInstance();
		//객체명은 3개지만 실제 객체는 한개이다.->주소값을 확인
	    //주소값이 하나고 객체명은 다른경우=>서로 공유(객체는 하나)
		System.out.println("ob1="+ob1);
		System.out.println("ob2="+ob2);
		System.out.println("ob3="+ob3);
		
		if(ob1==ob2)
			System.out.println("ob1과 ob2는 같은 객체이다.(주소같다)");
		else
			System.out.println("ob1과 ob2는 서로 다른 객체이다.(주소다름)");
	}

}
