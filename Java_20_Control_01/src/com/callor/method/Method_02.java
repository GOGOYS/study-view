package com.callor.method;

public class Method_02 {
	public static void main(String[] args) {
	
		/*
		 * 명령문 해석 
		 * num()를 실행하여 => num()를 호출하여 실행하고
		 * num()가 return하는 데이터를 intNum1 변수에 저장하라.
		 */
		int intNum1 = num();
		double douNum1 = douNum();
		long longNum1 = longNum();
		float fNum1 = fNum();
		boolean bYes1 = bYes();
		
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(douNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes1);
		System.out.println(str);
		
	}
	public static int num() {
		return 1;
	}
	public static double douNum() {
		return 2022.03311146;
	}
	public static long longNum() {
		return 444444444;
	}
	public static float fNum() {
		return 12345678f;
	}
	public static boolean bYes() {
		return true;
	}
	public static String nation() {
		return "가";
	}
	
}
