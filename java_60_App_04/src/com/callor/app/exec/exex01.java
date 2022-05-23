package com.callor.app.exec;

public class exex01 {
	public static void main(String[] args) {
		int intSum = 0;
		int index;
		for(index = 0; index < 100; index++) {
			intSum += index;
		}
		
		System.out.println("1~100 까지 정수의 덧셈결과 : " +intSum);
	}
}
