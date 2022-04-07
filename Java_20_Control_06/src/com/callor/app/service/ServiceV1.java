package com.callor.app.service;

public class ServiceV1 {
	
	public int scoreSum() {
		
		int intKor;
		int intEng;
		int intMath;
		
		intKor = (int)(Math.random() * 100 )+1 ;
		intEng = (int)(Math.random() * 100 )+1 ;
		intMath = (int)(Math.random() * 100 )+1 ;
		
		int intSum;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		return intSum;
	}

}
