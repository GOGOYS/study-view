package com.callor.var;

public class Var_06 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		int intSum = 0; // 합
		int intDifference = 0; // 차(뺄셈 값)
		int intProduct = 0; // 곱(곱셈한 값)
		int intDivide = 0; // 나눗셈
		int intMod = 0; // 나머지
		
		
		intNum1 = 89;
		intNum2 = 3;
		
		intSum = intNum1 + intNum2;
		intDifference = intNum1 - intNum2;
		intProduct =  intNum1 * intNum2;
		intDivide = intNum1 / intNum2;
		intMod = intNum1 % intNum2;
		
		System.out.println(intSum);
		System.out.println(intDifference);
		System.out.println(intProduct);
		System.out.println(intDivide);
		System.out.println(intMod);
	}

}