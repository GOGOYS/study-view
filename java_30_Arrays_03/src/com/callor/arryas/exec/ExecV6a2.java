package com.callor.arryas.exec;

public class ExecV6a2 {
	public static void main(String[] args) {
		
		/*
		 *  정수형 배열 100개를 선언하고 Math.random()를 사용하여
		 *  1 ~ 100 까지 임의 수를 생성하고 각 요소에 저장
		 *  배열의 각 요소에 저장된 수 중에서 짝수의 리스트를 
		 *  한 라인에 5개씩 끊어서 출력하시오
		 * */
		
		int[] intNum = new int[100];
		
		int evenCount =0;
		
		for(int i=0; i < intNum.length; i++) {
			
			intNum[i]= (int)(Math.random()* 100) +1;
		}
		
		for(int i=0; i < intNum.length; i++) {
			boolean bEven = intNum[i] % 2==0;
			
			if(bEven) {
				System.out.print(intNum[i]+ ",");
				evenCount++;
				
				if(evenCount % 5 ==0) {
					System.out.println();
				}
			}
			
		}
		
		
	}
}
