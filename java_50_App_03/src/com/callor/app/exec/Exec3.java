package com.callor.app.exec;

public class Exec3 {
	/*
	 * 임의의 정수 10개를 만들어 각각의
	 * 수를 even 매서드에 매개변수로 전달하고 
	 * even method는 각 매개변수로 전달받은 값이 
	 * 짝수이면 전달받은 값,
	 * 아니면 0을 return
	 * even 메서드가 return한 결과값을 합산하여 출력
	 */
	public static void main(String[] args) {
		
		int evenSum = 0;
		
		for(int i=0; i <10; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num+",");
			
			evenSum += even(num);
		}
		
		System.out.println("짝수의 합 :" +evenSum);
		
		
	}
	
	public static int even(int num) {
		if(num % 2 ==0) {
			return num;
		}else {
			return 0;		
		}
	}
}
