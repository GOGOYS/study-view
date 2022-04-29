package com.callor.app;

public class Exec2 {
	public static void main(String[] args) {
		
		int pay = 5_824_870;
		int money = 50_000;
		
		while(pay > 0) {
			
			int paper = pay / money;
			System.out.printf("%7d 권 : %5d 매",money,paper);
			pay -= paper * money;
			
			int sw= 1;
			
			if(sw >0) {
				money /= 5;
			}else {
				money /= 2;
			}
			
			sw *= (-1);
			
		}
	}
}
