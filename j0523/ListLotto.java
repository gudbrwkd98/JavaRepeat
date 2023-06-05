package j0523;

import java.util.*;//List->ArrayList,Vector,Random

public class ListLotto extends Object{
    Integer bonus;//숫자객체 int(X)
    List<Integer> lotto=new ArrayList<>();
    //자식클래스의 객체를 통해서 인터페이스객체를 얻어올 수 있다.
    
    //6개의 숫자를 랜덤으로 출력
    public void setup(int i ) {//0~0.9999999
    	/*
    	 * 1.Math.random()=>난수를 만들어주는 메서드
    	 *                             중복된 숫자가 자주 나옴.
    	 *                             seed값(섞어주는값 고정)->중복높음
    	 */
    	Random random=new Random();//seed값 변경->중복X
    	
    	while(bonus == null){
    		int num = random.nextInt(45)+1;
    		
    		//System.out.println("num =>" +  num);
    		//번호를 하나 뽑아낼떄마다 lotto배열의 내용을 비교
    		if(!lotto.contains(num)) {//중복된 숫자가 아니라면 
    			if(lotto.size()<i) {
    				lotto.add(num); //뽑은 숫자를 lotto 배열에 저장 
    			}else { // lotto.size()>= 6
    				bonus= num;
    			}//else
    		}//outer if 
    	}//while
    	Collections.sort(lotto); //랜덤으로 뽑은 숫자를 오름차순으로 정렬
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "당첨번호:"+lotto+",보너스:"+bonus;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListLotto lotto=new ListLotto();
        lotto.setup(6);//6개의 번호 구함
        System.out.println(lotto);//주소값출력X lotto.toString()
	}
}
