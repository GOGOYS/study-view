package com.callor.classes.exec;

public class String2IntV2 {
	public static void main(String[] args) {
		String strNum1 = "100";
		String strNum2 = "200";
		
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);
		
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		
		int intSum = intNum1 + intNum2;
		
		System.out.println(intSum);
		
		strNum1 = "30.6";
		strNum2 = "66.1";
		
		float fNum1 = Float.parseFloat(strNum1);
		float fNum2 = Float.parseFloat(strNum2);
		System.out.println(fNum1 + fNum2);
		
		
		intNum1 = Integer.parseInt(strNum1);
		intNum2 = Integer.parseInt(strNum2);
		
		fNum1 = Float.parseFloat(strSum);
		
	}
}