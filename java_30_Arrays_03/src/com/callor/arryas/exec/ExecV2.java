package com.callor.arryas.exec;

public class ExecV2 {
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		
		for(int i = 0; i < intNum.length; i++) {
			
			intNum[i] = (int)(Math.random() * 100) +1;
		
		}
		
		
		for(int i =0; i < intNum.length; i++) {
			
			boolean bEven = intNum[i] % 2 ==0;
			
			if(bEven) {
				System.out.println(intNum[i] + "는 짝수다");
			}else {
				System.out.println(intNum[i] + "는 짝수가 아니다");
			}
			
		}
	}
}
