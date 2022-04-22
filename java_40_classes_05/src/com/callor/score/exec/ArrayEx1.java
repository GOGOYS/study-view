package com.callor.score.exec;

public class ArrayEx1 {
	public static void main(String[] args) {
		
		//숫자형 배열은 선언하자마자 0이 담겨서 바로 사용가능
		int[] intNums = new int[10];
		
		for(int i=0; i < intNums.length; i++) {
			intNums[i] = (int)(Math.random( )*100)+1;
		}
		
		for(int i =0; i < intNums.length; i++) {
			System.out.printf("%d\t",intNums[i]);
		}
		
		System.out.println();
		
		/*
		 * forEach //확장된 for() 명령, 새로운 for()명령
		 * 배열의 길이만큼만 출력하고 싶을때
		 * int num : intNums // intNums 배열의 0번째 위치의 값부터  int num변수를 생성해서 거기에 담아라.
		 * 
		 * 배열의 0부터 끝까지 (전체요소)에 대하여 연속적으로 연산을 수행하기 위한 심플한  for()명령문
		 * 배열에 일부나, 값을 저장하는 용도는 안됨/ 화면애 출력하거나 연산하는 용도로만 사용하능.
		 */
		for(int num : intNums) {
			System.out.printf("%d\t",num);
		}
	}
}
