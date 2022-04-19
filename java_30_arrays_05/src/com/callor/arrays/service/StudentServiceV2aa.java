package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

/*
 * ServiceV2에서 ServiceV1을 상속 받았다.
 * 상속을 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받는다.
 * 단, 생성자 제외
 * 
 * 상속 키워드가 extends(확장) 인 것에 주목
 * 
 */
public class StudentServiceV2aa extends StudentServiceV1{
	
	public StudentServiceV2aa() {
			
		this(10);
	}
	
	public StudentServiceV2aa(int length) {
		
		strStudents = new String[length];
		
		scan = new Scanner(System.in);
	
	}
	
	/*
	 * ServiceV1에 선언된 메서드 중에서
	 * inputStudent 메서드를 다시 정의 하겠다.
	 */
	@Override
	public int inputStudent() {
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

