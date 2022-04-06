package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class controllerV1 {
	public static void main(String[] args) {
		
		//serviecV1 클래스의 매서드를 사용하기 위한 준비
		//ServiceV1 클래스의 인스턴스 생성
		//	클래스를 사용하여 변수처럼 객체(object)를 선언하고
		//	new 키워드와 생성자 method를 사용하여 객체를 인스턴스화 시킨다.
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intScoreSum = serviceV1.scoreSum();
		
		
		System.out.println(intScoreSum);
		
		//void타입의 매서드는 단독으로 호출한다. 결과를 변수에 담을 수 없다.
		serviceV1.scorePrint();
		
		/*
		 * scoreSum()은 return타입이 int형이다
		 * 과목의 총점을 계산하여 결과를 리턴하고 있다.
		 * main()에서는 scoreSum()을 호출하여 결과를 어딘가에 담아서
		 * 출력하는 일을 수행해야한는데 아래의 코드는 결과를 받아 수행하는 코드가 없다.
		 * 그래서 결과를 확인 할수 없다. 
		 */
		serviceV1.scoreSum();
		
		//scoreSum()이 리턴한 결과를 어딘가의 기억장소에 저장하고 내용을 comsole에 출력
		System.out.println( serviceV1.scoreSum());
		
		/*
		 * scorePrint()는 void type이기때문에 println()에 포함하여 사용할 수 없다.
		 */
		//System.out.println(serviceV1.scorePrint());
		//scorePrint()는 결과값이 없는데 출력을 하라고 하니 에러가 뜬다.
		
	}
}
