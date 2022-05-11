package com.callor.todo.service.impl;

import java.util.Scanner;

import com.callor.todo.service.InputService;
import com.callor.utils.Line;

public class InputServiceImplV2 extends InputServiceImplV1{
	
	/*
	 * V1 클래스의 생성자를 호출하여 scan을 실행
	 */
	public InputServiceImplV2() {
		super();
	}
	
	@Override
	public Integer menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		System.out.println("1. TODO  추가하기");
		System.out.println("2. TODO List 보기");
		System.out.println("3. Key 로 검색하기");
		System.out.println("4. 완료처리하기");
		System.out.println("5. 종료하기");
		System.out.println(Line.sLine(50));
		System.out.println("선택 >> ");
		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.println("할일(QUIT: 종료) >>");
		String content = scan.nextLine();
		return content;
	}
	
	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.print("할일선택(QUIT:종료)");
		String selectNum = scan.nextLine();
		Integer intNum = 0;
		
		if(selectNum.equals("QUIT")) return -1;
		
		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return intNum;
	}

}
