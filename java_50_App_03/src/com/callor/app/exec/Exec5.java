package com.callor.app.exec;

public class Exec5 {
	public static void main(String[] args) {
		int num = (int)(Math.random() *100) +1;
		int iFlag =0;
		
		for(int i =2; i <num; i++) {
			if(num % i== 0) {
				iFlag ++;
			}
		}
		
		//안전한 조건 검사
		if(iFlag > 0) {
			System.out.println(num+ "는 소수가 아님");
		}else {
			System.out.println(num + "는 소수");
		}
 	}
}
