package com.callor.app.exec;

public class Exec4 {
	/*
	 * 1~100까지 임의 수를 생성하고
	 */
	public static void main(String[] args) {
		
		int num = (int)(Math.random() *100)+1;
		
		boolean bYes = true;
		
		for(int i =2; i < num; i++) {
			if(num % i == 0 ) {
				bYes = !bYes;
				break;
			}
		}
		
		/*
		 * 만약 num 값이 소수인 경우 for()반복문이 모두 완료되고 종료된다
		 * 그러면 bYes는 처음 설정한 값이 변화가 없어서  true가 될것이다.
		 * 
		 * 만약 num 값이 소수가 아닌경우 중간의 if(){}의 코드가 실행되어
		 * bYes가 반전되고 다음의 if조건을 만족하지 않아
		 * else{}가 실행된다. 
		 */
		if(bYes) {
			System.out.println(num + " = 소수이다");
		}else {
			System.out.println(num + " = 소수가 아니다");
		}
		
		
		
	}
	
	
}
