package com.callor.arryas.exec;

public class ExecV1 {
	public static void main(String[] args) {
		
		
			
			int intNum = (int)(Math.random() * 100) +1;
			
			
			boolean bEven = intNum % 2 == 0;
			//짝수가 아님//
			
			if(bEven) {
				System.out.println(intNum + "는 짝수 입니다");
			}else {
				System.out.println(intNum + "는 짝수가 아닙니다");
			}
			
		
	}
}
