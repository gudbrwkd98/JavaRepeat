package j0516;

public class VarArgTest {

	/*
	public void print(String a) {
		System.out.println("a => "  +  a);
	}

	public void print(String a,String b) {
		System.out.println("a => "  +  a + "b => "  +  b);
	}
	
	public void print(String a, String b, String c) {
		System.out.println("a => "  +  a  + "b => "  +  b + "c => "  +  c);
	}
		*/
	public void print2(String names[]) {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		System.out.println();
	}

	//public void print(int age , int year, double avg,String ...names)앞에 변수를 받고 뒤에설정은 가능 
	public void print(String ...names) { //매개변수의 갯수와상관없이 메서드 하나로 통합 
		
		
		
		for(String str:names) {
			System.out.print(str+"\t");
		}
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgTest vat = new VarArgTest();
		
		//추가
		String str[] = {"배열의 활용","동적배열","API 문서 참조하는 방법"};
		vat.print(str);
		vat.print("홍길동");
		vat.print("홍길동","테스트");
		vat.print("홍길동","테스트","임시");
		vat.print("홍길동","테스트","임시","임시2");
		vat.print("홍길동","테스트","임시","임시2","임시3");
	}

}
