package com.callor.todo.service;

import java.io.IOException;
import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	
	//TODO를 추가하기
	public void todoInsert(String content);
	
	//전체 TODOLIST 조회하기
	public List<TodoVO> todoSelectAll();
	
	//Key값으로 1개의 TOTOLIST 조회하기
	public TodoVO findByKey(String key);
	
	//TODO내용 변경하기
	//public void update(TodoVO tVO);
	/**
	 * 2022-05-13 설계변경
	 * method를 변경하기
	 * TodoList의 item index와 content를 매개변수로 받아
	 * TodoList의  항목중 index 번째의 content를 변경할수 있도록 method를 변경함
	 */
	public void update(Integer num, String content);
	
	//할일을 완료했을때 사용할 method
	public void compTodo(Integer num);
	
	//TODOList내용을 파일에 저장하기
	public void saveTodo(String fileName) throws IOException;
}
