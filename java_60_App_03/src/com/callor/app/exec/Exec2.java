package com.callor.app.exec;

/*
 * 1~100까지 덧셈
 * 1+2+3+4+.....+100
 */
public class Exec2 {
	public static void main(String[] args) {
		int intSum = 0;
		int index;
		for(index =0; index < 100; index++) {
		intSum += index+1;	
		}
		
		System.out.println("1~100까지의 정수의 덧셈결과 :" +intSum);
	}
}
