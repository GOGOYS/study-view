package com.callor.app.exec;

public class Exec1 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		
		for(int i =0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() *100 ) + 1;	
		}
		
		
		for(int i =0; i < intNum.length; i++) {
			
			if(intNum[i] >= 55) {
				
				System.out.println(intNum[i]);
			}
		}
	}
	
} 
