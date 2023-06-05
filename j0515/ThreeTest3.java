package j0515;

public class ThreeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 44, y = 7, z= 19;
		
		ThreeTest3 tt = new ThreeTest3();
		tt.getMaxPrint(x, y, z);
		
		System.out.println("==========");
		System.out.println("tt.getMaxPrint2(34,12,99) = > " + tt.getMaxPrint2(34, 12, 99));
		
	}
	
	void getMaxPrint(int x , int y , int z){
		
		if(x>=y && x>=z) {
			System.out.println("최댓값은 : " + x + " 입니다");
		}else if (y>=x && y >= z){
			System.out.println("최댓값은 : " + y + " 입니다");
		}else {
			System.out.println("최댓값은 : " + z + " 입니다");
		}
		
		/*
		 * max = (a>b)?a:b;
		 * max = (max>c)?max:c;
		 * 
		 */
	}
	
	int  getMaxPrint2(int a , int b , int c){
		
 
		 int max = (a>b)?a:b;
		  max = (max>c)?max:c;
		  
		  return max;
	 
	}

}
