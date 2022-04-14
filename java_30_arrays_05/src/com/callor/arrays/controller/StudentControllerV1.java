package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class StudentControllerV1 {
	
	public static void main(String[] args) {
		
		
		//기본 생성자를 호출하여 인스턴스 생성
		//StudentServiceV1 stServiceV10 = new StudentServiceV1();
		
		//임의 생성자를 호출하여 인스턴스 생성
		StudentServiceV1 stServiceV1 = new StudentServiceV1(5);
		
		stServiceV1.inputStudent();
		//stServiceV1.printStudent();
		
		
	}
}
