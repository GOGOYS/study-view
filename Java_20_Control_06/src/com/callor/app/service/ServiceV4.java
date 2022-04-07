package com.callor.app.service;

public class ServiceV4 {
	
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	
	public int scoreSum() {
		
		intKor = (int)(Math.random() * 100)+1;
		intEng = (int)(Math.random() * 100)+1;
		intMath = (int)(Math.random() * 100)+1;
		
		int intSum = intKor + intEng + intMath;
		return  intSum;
		
	}
	
	public void scorePrint() {
		
		String dLine = "=";
		String sLine = new String("-");
		int intSum = scoreSum();
		
		System.out.println(dLine.repeat(20));
		System.out.println("철수의 성적표");
		System.out.println(sLine.repeat(20));
		System.out.println("국어 : \t" + intKor);
		System.out.println("영어 : \t" + intEng);
		System.out.println("수학 : \t" + intMath);
		System.out.println(sLine.repeat(20));
		
		System.out.println("총점 : \t" + intSum);
		System.out.println(sLine.repeat(20));
		
	}
}
