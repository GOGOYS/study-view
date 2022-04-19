package com.callor.calsses.exec;

public class String2IntV1 {

	public static void main(String[] args) {
		
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);
		
		
		strNum = "33.2";
		float fNum = Float.valueOf(strNum);
		
		float fSum = intNum + fNum;
		System.out.println(fSum);
	}
}
