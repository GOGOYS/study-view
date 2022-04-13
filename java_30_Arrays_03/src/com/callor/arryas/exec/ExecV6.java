package com.callor.arryas.exec;

public class ExecV6 {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		
		int intEvenCount = 0;
		
		for(int i = 0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100) +1;
			
		}
		
		for(int i =0; i < intNum.length; i++) {
			
			
			if(intNum[i] % 2 == 0) {
				
				System.out.print(intNum[i]+ ", \t");
				
				intEvenCount ++;
				
				if(intEvenCount % 5 == 0) {
					
					System.out.println("");
				}
				
			}
			
			
			
		}
	}
}
