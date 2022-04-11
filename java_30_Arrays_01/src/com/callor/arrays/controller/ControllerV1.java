package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1a;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intKorSum = serviceV1.scoreKorSum();
		
		System.out.println("5명 학생의 국어 점수 합 : " +intKorSum);
		
		ServiceV1a serviceV1a = new ServiceV1a();
		int intKorSumA = serviceV1a.scoreKorSum();
		
		System.out.println("5명 학생의 국어 점수 합 : " +intKorSumA);
		
	}
}