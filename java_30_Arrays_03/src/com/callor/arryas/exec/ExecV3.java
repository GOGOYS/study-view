package com.callor.arryas.exec;

public class ExecV3 {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
				
		int intEvenCount =0;

		
		for(int i =0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100) + 1;
		}
		
		
		for(int i =0; i < intNum.length; i++) {
			
			  boolean bYes = intNum[i]  % 2 == 0;
			  
			  if(bYes) {
				  intEvenCount ++;
			  }
		}
		
		System.out.printf("짝수의 갯수는 %d개 입니다.",intEvenCount);
		
		
	}
}
