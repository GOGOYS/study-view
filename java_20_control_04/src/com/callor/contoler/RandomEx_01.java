package com.callor.contoler;

import java.util.Random;

public class RandomEx_01 {
	public static void main(String[] args) {
		
		//랜덤한 정수 만드는 두가지 방법
		int intRnd1 = (int)(Math.random()  * 100) +1;
		
		Random rnd = new Random();
		int intRnd2 = rnd.nextInt(100);
		
		System.out.println(intRnd2);
		
		long longRnd = rnd.nextLong();
		System.out.println(longRnd);
		double douRnd = rnd.nextDouble();
		
		System.out.println(douRnd);
		
		boolean bYes = rnd.nextBoolean();
		System.out.println(bYes);
		if(bYes) {
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
	}
}
