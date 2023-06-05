package j0516;



public class ArrayTest2 {
	public static void main(String[] args) {
		int b [] = {58,38,12,36,41,27,26,32,16,18,28,21,17}; //나이
		//10~50 => 20대 몇명(20~29)
		int count = 0 ; //20대 저장할변수
		
		for (int i = 0; i < b.length; i++) {
			if(b[i] >= 20 && b[i]<=29) {
				count++;
			}
		}
		System.out.println("20 대 " + count);
	}
}
