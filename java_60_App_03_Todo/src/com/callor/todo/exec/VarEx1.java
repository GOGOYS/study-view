package com.callor.todo.exec;

import com.callor.todo.model.TodoVO;

public class VarEx1 {
	public static void main(String[] args) {
		
		//primitive type 변수
		//순수하게 값을 저장하는 용도로만 사용하는 변수
		int num1;
		long num2;
		float num3;
		num3 = 30f;
		
		//Wrapper 클래스 변수
		Integer num4;
		//System.out.println(num4.toString());
		//System.out.println(num4+ "");
		Long num5;
		Float num6;
		
		//TodoVO 클래스 변수
		TodoVO toVO = new TodoVO();
		toVO.setSDate("3303");
		
		//배열 
		int[] nums = new int[10];
		System.out.println(nums.length);
		
	}
	
}
