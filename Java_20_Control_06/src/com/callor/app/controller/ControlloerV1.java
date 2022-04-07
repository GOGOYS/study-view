package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControlloerV1 {

	
	public static void main(String[] args) {
		
		//ServiceV1 클래스를 선언만 한 상태 아무런 코드가 아직 준비가 안된상태
		//ServiceV1 클래스를 사용하여 ServiceV1 인스턴스를 생성할수 있다.
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intSum = serviceV1.scoreSum();
		
		System.out.println(intSum);
		System.out.println(serviceV1);
	}
}
