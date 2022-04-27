package com.callor.app.exec;

public class Exec4 {
	/*
	 * 1~100까지 임의 수를 생성하고
	 */
	public static void main(String[] args) {
		
		int num = (int)(Math.random() *100)+1;
		
		boolean bYes = false;
		
		for(int i =2; i < num; i++) {
			if(num % i == 0 ) {
				bYes = false;
				break;
			}else {
				bYes = true;
			}
		}
		
		if(bYes) {
			System.out.println(num + "은 소수이다");
		}else {
			System.out.println(num + "은 소수가 아니다");
		}
	}
	
	
}
