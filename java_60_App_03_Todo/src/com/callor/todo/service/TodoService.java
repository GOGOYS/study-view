package com.callor.todo.service;

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
	//할일을 완료했을때 사용할 method
	public void update(TodoVO tVO);
	//TODOList내용을 파일에 저장하기
	public void saveTodo(String fileName);
}
