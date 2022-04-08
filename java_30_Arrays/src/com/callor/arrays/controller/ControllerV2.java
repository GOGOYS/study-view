package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		/*
		 * 클래스를 사용하여 객체(오브젝트)를 선언하고 
		 * 생성자 매서드를 호출하여 인스턴스화 시킨다.
		 * 
		 * serviceV2 인스턴스를 생성하기 위해서는
		 * serviceV2 클래스의 생성자 ServiceV2()를 호출하여
		 * 새로운 인스턴스를 만든다.
		 */
		ServiceV2 serviceV2 = new ServiceV2();
		
		serviceV2.scoreKorSum();
	}
}
