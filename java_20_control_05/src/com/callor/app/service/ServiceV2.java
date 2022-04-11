package com.callor.app.service;

public class ServiceV2 {
	
	/*
	 * 지금 ServiceV2 클래스에는 guguDan()두번 선언되어 있다.
	 * 보통은 같은 이름의 매서드를 두번이상 선언하면 오류가 발생한다.
	 * 그런데 자바에서는 method에 매개변수(argument)의 있고 없음에 따라
	 * 이름은 같지만 서로 다른 매서드로 판단하여 오류가 발행하지 않는다.
	 * 이것은 자바뿐만 아니라 객체지향 프로그래밍 언어의 공통된 특징이다.
	 */
	
	public void guguDan() {
		
		int intNum =100;
		
		/*
		 * for(초기화코드; 비교코드; 변화코드){ }
		 * 초기화코드는 for()명령문을 만나면 최초에 한번만 실행
		 * 비교코드를 실행하여 결과가 true이면 { } 내부의 코드실행
		 * { }가 실행 완료되면 변화코드 실행
		 * 비교코드가 false가 되는 순간까지 계속 반복
		 */
		for(intNum = 1;intNum < 10; intNum++) {
			System.out.printf("\t%d x %d = %d\n", 3, intNum, 3 * intNum);
		}
		
	} // end guguDan
	
	/*guguDan(변수선언) 형식으로 매서드 선언하기
	 * method의 괄호안에 선언된 변수를 "argument"라고 한다. 
	 * argument: 매개변수, parameter
	 * 호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고 
	 * 코드안에서 변수값을 사용하여 연산을 수행한다.
	 * argument가 포함된 매서드를 호출할때는 반드시 argument에 합당한 값을 함께 전달해야한다.
	 * 값을 주입해 주어야 한다.
	 */
	public void guguDan(int dan) {
			
		int intNum =1;
		
		for(intNum = 1;intNum < 10; intNum++) {
			System.out.printf("\t%d x %d = %d\n", dan, intNum, dan * intNum);
		}
	}
	
	public void gugugu() {
		
		int dan=1;
		int intNum =1;
		
		for(dan = 1; dan < 10; dan++) {
			
			System.out.println("===========================");
			System.out.println("\t"+ dan+ "단");
			
			for(intNum = 1; intNum < 10; intNum++) {
				System.out.printf("\t%d x %d = %d\n", dan, intNum, dan * intNum);
			}
			
		}	
		
	}

}
