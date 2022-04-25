package com.callor.app.controller;

import java.util.List;

import com.callor.app.service.ServiceV1;

public class controllerV1 {
	public static void main(String[] args) {
		
		ServiceV1 servicev1 = new ServiceV1();
		
		servicev1.makeScore();

		//안 줄인 상태
		List<Integer> result = servicev1.getIntList();
		System.out.println(result.toString());
		
		//객체(method) chaining을 사용하여 코드 줄이기.
		System.out.println(servicev1.getIntList().toString());
		
	}
}
