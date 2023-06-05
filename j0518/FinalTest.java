package j0518;

//3.final class명=>상속금지=>내용을 변경하면 안되는 클래스에 부여(시스템)
class Parent{
	//1.final + 멤버변수 or 지역변수=>상수화(변수의 값고정)(대문자로 사용)
	final int COUNT=1;
	//2.final +메서드명=>상속은 허용해주는데 오버라이딩 금지X
	//메서드의 성격과 전혀다른 내용으로 변경하면 안되는 경우
	public final void sum(int a,int b) {
		System.out.println("a+b=>"+(a+b));
	}
}
public class FinalTest extends Parent {
    //count=1
	/* 오버라이딩 금지
	public void sum(int a,int b) {
		System.out.println("데이터 연습중");
	} */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p=new Parent();
        FinalTest ft=new FinalTest();
       // p.count=2;
        System.out.println("p.COUNT=>"+p.COUNT);
        ft.sum(10, 5);
	}
}
