package com.callor.var;

public class var_02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int num3 = 0;
		int num4 = 0;
		/*
		 * 변수에 값읋 저장(할당,대입)하거나
		 * 읽으려면 반드시 이전에 변수가 최소한 선언되어 있어야한다.
		 */
		num3 = 200;
		num4 = 300;
		System.out.println(num3+num4);
		
		int num5 = 500;
		num5 =0;
		num5 =1000;
		System.out.println(num5);
		num5 =99;
		num5 = -1;
		System.out.println(num5);
		//어떤 값이 저장되어있는 마지막에 저장되어있는 값만 마지막에 저장됨
	}

}
