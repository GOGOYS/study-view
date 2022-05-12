package com.callor.todo.service.impl;

public class TodoServiceImplV2 extends TodoServiceImplV1{
	
	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}
	
	/*
	 * 저장된 todoList.txt파일을 읽어서 todoList에 추가하기
	 * 
	 * todolist.txt파일열기
	 * 한라인씩 읽어서
	 * 컴마(,)기준으로 spilt하고
	 * todoVO에 담고
	 * todoList 추가
	 */
	private void loadTodoList() {
		
	}

}
