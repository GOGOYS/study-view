package com.callor.app.primes;

public class Exec7 {
	public static void main(String[] args) {
		
		int num =100;
		int[] intNum = new int[num];
		int intCount = 0;
		
		for(int i=0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100)+2;
		}
		
		//배열의 전체 요수만큼 반복하기
		for(int i=0; i < intNum.length; i++ ) {
			
			int index = 0;
			
			//배열의 i번째 요소에 저장된 수가 소수인가 판별
			for( index=2; index < intNum[i]; index++) {
				
				if(intNum[i] % index == 0) {
					break;
				}
			}	
			//배열의 i번째 요소가 소수이면 count 증가
			if(!(index < intNum[i])){				
				intCount++;
			}
		}
		
		System.out.println("소수의 갯수 : " +intCount);
	}
}
