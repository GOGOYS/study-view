package com.callor.var;

public class Var_04 {
	public static void main(String[] args) {
		int intNum1 = (int)(Math.random()* 100)+1;
		int intNum2 = (int)(Math.random()* 100)+1;
		
		boolean bCompare =true;
		bCompare = intNum1 > intNum2;
		
		if(bCompare) {
			System.out.println(intNum1 + " 은 " + intNum2 + " 보다 크다");
		}else {
			System.out.println(intNum1 + " 은 " + intNum2  + " 보다 큰게 아니다");
		}
		
		if(bCompare) {
			System.out.printf("\t%d 는 %d 보다 크다\n", intNum1, intNum2);
		}else {
			System.out.printf("\t%d 는 %d 보다 큰게 아니다\n", intNum1, intNum2);
		}
		
	}
}
