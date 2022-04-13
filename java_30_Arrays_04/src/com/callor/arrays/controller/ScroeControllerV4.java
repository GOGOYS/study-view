package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScroeControllerV4 {
	
	public static void main(String[] args) {
		
		//오류에서 NullPointerExceptiondl 뜨면 배열이나 변수가 사용할 준비가 되지 않았다.
		ScoreServiceV4 scoreServiceV4 = new ScoreServiceV4(1);
		
		scoreServiceV4.makeScore();
		
		scoreServiceV4.printScore();
		
	}
}
