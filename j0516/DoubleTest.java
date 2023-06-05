package j0516;

public class DoubleTest {
	
	public static void main(String[] args) {
		System.out.println("2차원 배열을 생성 및 가변배열");
		//1.형식) 배열의 자료형 배열명[][] = new 자료형 [행수][열수]
		int c [][] = new int [3][3]; //c[0][0],c[0][1],c[0][2] ~ c[3][3]
		//2.형식) 배열의 자료형 배열명[][] = {{값1,값2,,,},{},{}}
		//int b [][] = {{10,20,30},{40,50,60},{70,80,90}};
		//						b[0][1]			b[1][2]				b[2][2]
		//가변배열 => 행은 정해져있는데 열은 그때마다 바뀌는 경우
		int b [][] = {{10,20,30},{40,50},{60,70,80,90}};
		
		for (int i = 0; i < b.length; i++) { //행의 값(열의 데이터 주소값출력)
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("b[" + i + "] ["+j+"] =>" + b[i][j]);	
			}//inner for
			
		}//outer for
		/*		for(2차원배열의 자료형 배열명[][]:3차원배열명)//[][][]
		 * 형식) for(1차원배열의 자료형 배열명[]:2차원배열명 )//[][](X)
		 *				for(1차원배열의 자료형 출력변수:1차원배열명)//[](x)
		 *						
		 */
		int sum = 0 ; 
		for(int temp[]:b) { //2차원배열 b-> 1차원배열의 값을 하나씩 꺼내기
			for (int su:temp ){ //temp 에 저장
				System.out.print(su+"\t");
				sum+=su;
			}//inner for
			System.out.println();
		}//outer for 
		System.out.println("sum => " + sum);
		
	}


	
}
