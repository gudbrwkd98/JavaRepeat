package j0519;

public class ExceptionTotal {
	public static void main(String[] args) {
		System.out.println("매개변수 2개(동적배열)");
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a=> " + a + ", b=>" + b);
			System.out.println("a 를 b로 나눈 몫 " + (a/b));
		}catch(ArithmeticException e ) {
			System.out.println(e);
			System.out.println("어떤수를 0 으로 나눌수가 없어요 ");
		}catch(IndexOutOfBoundsException | NumberFormatException e ) {
			System.out.println(e);//e.toString()
			System.out.println("반드시 2개를 입력하거나 숫자만 입력가능");
		}/*catch(NumberFormatException e ) {
			System.out.println(e);
			System.out.println("반드시 숫자를 입력해야 합니다");
		}*/
		catch (Exception e) { //위의 예외처리하는 3개의 예외처리 외에 다른 예외가 발생했을떄 
			// TODO: handle exception
			System.out.println("위의 예외처리 외의 나머지를 처리해줍니다");
		}finally {
			System.out.println("예외와 상관 없이 무조건 처리하겠음");
		}
	}
}
