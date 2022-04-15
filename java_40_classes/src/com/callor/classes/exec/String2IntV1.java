package com.callor.classes.exec;

import com.callor.classes.utils.LIne;

public class String2IntV1 {
	public static void main(String[] args) {
		
		String strAge = "";
		int intAge = 33;
		
		strAge = intAge + "";
		//숫자형 변수 + "문자열" : 숫자값을 문자열형 변수로 형변환

		//Integer.toString(정수값) :
		//Integer 클래스에 선언된 toString static method에게 
		//정수값을 arg로 전달하여 문자열로 return 받는다.
		
		//Integer.toString()를 사용하여 정수형 숫자를 문자열형 숫자로 바꾼다.
		strAge = Integer.toString(intAge);
		System.out.println(strAge);
		
		strAge = "555";
		
		// Integer.valueof()를 사용하여 문자열형 숫자를 정수형 숫자로 바꾼다.
		intAge = Integer.valueOf(strAge);
		System.out.println(intAge);
		
		System.out.println(Integer.toBinaryString(33));
		
		int num1 =33;
		int num2 =55;
		String strBunNum1 = Integer.toBinaryString(num1);
		String strBunNum2 = Integer.toBinaryString(num2);
		
		
		int intSum = num1 + num2;

		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(LIne.dLine(20));
		System.out.printf("   %10s\n",strBunNum1);
		System.out.printf(" + %10s\n", strBunNum2);
		System.out.println(LIne.dLine(20));
		System.out.printf("   %10s\n",strSum);
		System.out.println(LIne.dLine(20));
}
}
