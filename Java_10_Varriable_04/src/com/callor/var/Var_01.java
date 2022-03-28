package com.callor.var;

public class Var_01 {
	
	//main method
	public static void main(String[] args) {

		//변수 선언문 clear(0을 저장,대입)
		int intNum1 =0;
		int intNum2 =0;
		
		//변수에 값 저장하기
		//변수에 어떤 값을 저장하면 이미 저장된 값은? : 무조건 사라진다.
		intNum1 = 33;
		intNum2 = 55;
				
		//사칙연산 결과를 저장(보관)하기 위한 변수를 선언 clear
		int intSum =  intNum1 + intNum2;
		int intDiffer = intNum1 - intNum2;
		int intProduct = intNum1 * intNum2;
		int intDivide = intNum1 / intNum2;
		
		System.out.printf("%d + %d = %d\n",intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n",intNum1, intNum2, intDiffer);
		System.out.printf("%d × %d = %d\n",intNum1, intNum2, intProduct);
		System.out.printf("%d ÷ %d = %d\n",intNum1, intNum2, intDivide);
		
		
	}

}
