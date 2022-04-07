package com.callor.app.service;

public class Service2A {
	public void print() {
		
		ServiceV2 serviceV2 = new ServiceV2();
		//  ServiceV2와 Service2A는 같은 패키지에서 선언된 클래스이기 때문에
		//임포트를 하지 않아도 사용이 가능하다.
		
		//sum()은 private로 설정되어 있기 때문에 호출할 수 없다.
		/* serviceV2.sum(); */
		
		//add() 한정자를 생략했기 때문에 같은 패키지에 있는 클래스드 들끼리는 호출이 가능하다.
		serviceV2.add();
		
		
	}
}
