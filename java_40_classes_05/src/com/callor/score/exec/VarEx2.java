package com.callor.score.exec;

public class VarEx2 {
	public static void main(String[] args) {
		
		
		int num1 = 100;
		
		
		/*
		 * int형 변수에 담긴 데이터를 Integer형 변수에 복사
		 * 
		 *  int형 데이터에 box를 씌워서 Integer형으로 변환후 저장한다.
		 *  
		 *  boxing
		 */
		
		//타입이 바뀐것은 아니고 기억장치가 감싸는 공간이 바뀌는것
		// int형에서 Integer형으로 형변환이 내부적으로 일어난다.
		// int 를 Integer가 감싼다.
		Integer intNum1 = num1;
		
		
		/*
		 * Integer형 변수에 담긴 데이터를 int형 변수에 복사하기
		 * 
		 *  Integer box에 담긴 데이터를 box를 풀어해쳐 내용물만 int형 변수에 저장
		 *  
		 *  unboxing이라 한다.
		 */
		
		//Integer 형에서 int형으로 형변환이  내부적으로 일어난다.
		//감싸져 있는 Integer를 풀어해치고 int 박스가 나온다.
		num1 = intNum1;
		
		//형변환 casting 
		
	}
}
