package com.callor.classes.exec;

public class String2IntV3 {
	public static void main(String[] args) {

		/*
		 * NumberFormatException이 발생하는 상황들
		 */
		// -숫자와 함께 숫자가 아닌 문자열(space)가 포함된 경우
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);

		// - ""(없는 문자열)
		strNum = "";
		intNum = Integer.valueOf(strNum);

		// - 숫자 앞뒤에 문자열이 포함된 경우
		strNum = "A3A";

		// - 숫자 중간에 문자열이 포함된 경우
		strNum = "3 3";

		// - 숫자 중간에 연산기호가 포함된 경우
		strNum = "3+3";
		
		

	}
}
