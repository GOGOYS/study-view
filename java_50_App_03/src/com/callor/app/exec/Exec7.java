package com.callor.app.exec;

public class Exec7 {
	public static void main(String[] args) {
		
		int num =100;
		int[] intNum = new int[num];
		int intCount = num;
		
		for(int i=0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100)+2;
		}
		
		for(int i=0; i < intNum.length; i++ ) {
			
			for(int a=2; a < intNum[i]; a++) {
				
				if(intNum[i] % a == 0) {
					intCount--;
					break;
				}
			}	
		}
		
		System.out.println("소수의 갯수 : " +intCount);
	}
}
