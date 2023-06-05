package j0516;

public class ArrayDynamic {
	public static void main(String x[]) {
		int sum = 0;
				
		String str  = x[0];
		String str2  = x[1];
		String str3  = x[2];
		
		sum = Integer.parseInt(str) + Integer.parseInt(str2) + Integer.parseInt(str3) ;
		String str4 = String.valueOf(sum);
		double str5 = Double.parseDouble("10.4");
		System.out.println("str  => " + str);
		System.out.println("str  => " + str2);
		System.out.println("str  => " + str3);
		System.out.println("str  => " + str4);
		System.out.println("str  => " + str5);
		System.out.println("str  => " +  String.valueOf(sum) + Integer.toString(sum)) ;
	}
}
