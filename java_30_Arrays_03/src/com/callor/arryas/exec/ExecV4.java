package com.callor.arryas.exec;

public class ExecV4 {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		
		for(int i = 0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100)+ 1;
			
		}
		
		int intEvenSum = 0;
		
		for(int i = 0; i < intNum.length; i++) {
			
			boolean bEven = intNum[i] % 2 ==0;
			
			if(bEven) {
				intEvenSum += intNum[i];
			}
		}
		
		System.out.println("짝수들의 합은 " + intEvenSum );
	}
}
