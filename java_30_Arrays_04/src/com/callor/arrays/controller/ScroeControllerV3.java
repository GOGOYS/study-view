package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV3;

public class ScroeControllerV3 {
	public static void main(String[] args) {
		
		ScoreServiceV3 scoreServiceV3 = new ScoreServiceV3();
		
		scoreServiceV3.printNo1Score();
		
		/*
		 * ScoreServiceV3에 선언된 intkorea 배열은 
		 * private 접근 제한자가 설정되어 있기 때문에
		 * 인스턴스를 통하여 배열에 접근 할 수 없다.
		 */
		//scoreServiceV3.intKorea[0] = 100;
		
		scoreServiceV3.printNo1Score();
	}
}
