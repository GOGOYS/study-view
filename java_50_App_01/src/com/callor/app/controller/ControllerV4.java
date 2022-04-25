package com.callor.app.controller;

import com.callor.app.service.ServiceV4;

public class ControllerV4 {
	public static void main(String[] args) {
		
		
		/*
		 * 필요한 곳에서 필요한 만큼의 배개변수로 값을 전달하면
		 * 배열의 크기를 변경해서 유연하게 사용할 수 있다.
		 * 
		 * List보다는 배열이 더 연산속도가 빠르다.
		 */
		int[] scoreList = new int[10];
		ServiceV4 sV4 = new ServiceV4(scoreList);
		
		sV4.makeScore();
		
		for(int score : scoreList) {
			System.out.printf("%d,\t",score);
		}
		
	}
}
