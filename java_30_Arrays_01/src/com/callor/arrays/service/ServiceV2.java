package com.callor.arrays.service;

public class ServiceV2 {
	
	public int scoreKorSum() {
		
		//int[] intKor  이름으로 정수형배열 선언
		//new int[100] : 100개의 요소(저장공간)를 생성하라
		//정수형이기 때문에 모두 0 clear
		int[] intKor = new int[100];
		
		//정수형 배열 intKor의 3번 요소의 값을 콘솔에 출력
		//이때 "3"의 숫자를 "첨자"라고 부른다.
		//정수형 intKor의 첨자 3의 값을 console에 출력
		System.out.println( intKor[ 3 ] );
		
		//정수형 intKor의 3번 요소에 정수 100을 대입(저장,할당)
		intKor[3] = 100;
		
		//정수형 intKor의 3번 요소의 값을 console에 출력
		System.out.println( intKor[ 3 ] );
		
		return 0;
		
	}
}

