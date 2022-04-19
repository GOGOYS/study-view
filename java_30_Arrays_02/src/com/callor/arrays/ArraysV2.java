package com.callor.arrays;

public class ArraysV2 {
	public static void main(String[] args) {
		
		//배열의 갯수를 3개로 선언하면
		//첨자 index는 항상 배열의 개수 -1 까지다
		//다음과 같은 식이 성립한다.
		// index <length : index와 length는 항상 0보다 큰 정수이다.
		
		int[] intNums = new int[1];
		
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		//배열의 length가 3인데 index에 값을 저장하려고 시도를 하면
		//ArrayOutOfBound 문제(exception, 예외)가 발생한다.
		intNums[3] = 40;
	}
}
