package com.callor.app.service;


/*
 * 한정자, 제한자
 * class, method, 변수 등의 첫번째 키워드로 사용하는 것들
 * public, private, protected, 생략
 * 한정자를 어떤 것을 사용하느냐에 따라 클래스, 메서드, 변수 등을 다른 블럭({})에서 사용할 수 있는 권한이 달라진다.
 * public은 어디에서나, 누구나, 사용할 수 있다.
 * private는 같은 블럭 ({}) 안에서만 사용할 수 있다.
 * 만약 method를 private로 지정하면 다른곳에서 인스턴스, method()와 같은 코드로 사용할 수 없다.
 * 생략을 하면 같은 패키지에서는 호출 할 있다. 패키지가 달라지면 private과 성질이 같아진다.
 */
public class ServiceV2 {
	
	// private 한정자 설정
	private int sum() {
		
		return 100 + 200;
	}
	
	//한정자 생략
	int add() {
		return 10 +20;
	}
}
