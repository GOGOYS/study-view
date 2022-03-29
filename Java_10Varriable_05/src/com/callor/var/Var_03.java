package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {

		double douNum1;
		double douNum2;

		douNum1 =Math.random() * 1000 +1;
		douNum2 =Math.random() * 1000 +1;
		//명령문을 쓸때 앞쪽에 매써드랑 연산의 우선순위를 생각해서 해야 깔끔함

		/*
		 * Math.random() 이 실행된 결과가 담긴 doNum1 변수의 값에 1000을 곱하여 다시 doNum1에 저장하라
		 * douNum1 = douNum1 * 1000;과 같다.
		 * 
		 * douNum1 *= 1000;
		 * 
		 * douNum1에 담긴 값에 1을 더하여 다시 저장
		 * 
		 * douNum1 ++;
		 */
		
		int intNum1 = (int)douNum1;
		int intNum2 = (int)douNum2;
		
		int intSum = intNum1 + intNum2;
		int intDes = intNum1 - intNum2;
		int intMulti = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		
		System.out.printf("\t%d + %d = %d\n",intNum1, intNum2, intSum);
		System.out.printf("\t%d - %d = %d\n",intNum1, intNum2, intDes);
		System.out.printf("\t%d * %d = %d\n",intNum1, intNum2, intMulti);
		System.out.printf("\t%d / %d = %d\n",intNum1, intNum2, intDiv);
		
		


	}
}
